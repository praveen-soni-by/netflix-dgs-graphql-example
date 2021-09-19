package com.syscho.graphql.book.resolver;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.syscho.graphql.book.BookDO;
import com.syscho.graphql.book.BookRepository;
import com.syscho.graphql.book.BookVO;
import com.syscho.graphql.exception.NoDataFoundException;
import graphql.schema.DataFetchingEnvironment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@DgsComponent
@RequiredArgsConstructor
@Slf4j
public class BookResolver {
    private final BookRepository bookRepository;
    private final JdbcTemplate jdbcTemplate;

    @DgsData(parentType = "QueryResolver", field = "books")
    public List<BookVO> getBooks(DataFetchingEnvironment environment) {
        String query = "SELECT " + extractSelectedFields(environment) + " FROM BOOK ";
        log.info("query : {}", query);
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(BookVO.class));
    }

    @DgsData(parentType = "QueryResolver", field = "bookById")
    public BookVO getById(@InputArgument("id") String id, DataFetchingEnvironment environment) {
        String query = prepareQueryById(environment);
        log.info("query : {}", query);
        try {
            return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(BookVO.class), new Object[]{id});

        } catch (EmptyResultDataAccessException exception) {
            throw new NoDataFoundException(id);
        }
    }

    @DgsData(parentType = "MutationResolver", field = "addBook")
    public BookVO addBook(@InputArgument("request") BookVO bookVO) {
        BookDO bookDO = new BookDO();
        bookVO.setId(UUID.randomUUID().toString());
        BeanUtils.copyProperties(bookVO, bookDO);
        bookRepository.save(bookDO);
        return bookVO;
    }

    @DgsData(parentType = "MutationResolver", field = "deleteBook")
    public void delete(@InputArgument("id") String id) {
        jdbcTemplate.update("DELETE FROM  BOOK WHERE ID = ? ", id);
    }

    @DgsData(parentType = "MutationResolver", field = "updateBook")
    public BookVO updateBook(@InputArgument("request") BookVO bookVO, DataFetchingEnvironment environment) {
        StringBuilder updateFields = new StringBuilder();
        Map<String, String> result = environment.getArgument("request");
        result.forEach((key, value) -> {
            if (!key.equals("id"))
                updateFields.append(" " + key + " = '" + value + "',");
        });
        String updateQuery = "UPDATE BOOK SET  " + updateFields.substring(0, updateFields.toString().length() - 1) + " Where Id = ?";
        String id = result.get("id");
        log.info("Query :{} ", updateQuery);
        jdbcTemplate.update(updateQuery, id);
        return jdbcTemplate.queryForObject("select * from Book where id = ?", new BeanPropertyRowMapper<>(BookVO.class), id);
    }

    private String prepareQueryById(DataFetchingEnvironment environment) {
        return "SELECT " + extractSelectedFields(environment) + " FROM BOOK WHERE ID = ? ";
    }

    private String extractSelectedFields(DataFetchingEnvironment env) {
        return env.getSelectionSet().getImmediateFields().stream().map(selectedField ->
                selectedField.getName()).collect(Collectors.joining(","));
    }
}
