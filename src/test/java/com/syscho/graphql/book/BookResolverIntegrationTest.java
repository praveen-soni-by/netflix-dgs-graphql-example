package com.syscho.graphql.book;

import com.netflix.graphql.dgs.DgsQueryExecutor;
import com.syscho.graphql.NetflixDsgGraphqlApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = NetflixDsgGraphqlApplication.class)
public class BookResolverIntegrationTest {

    @Autowired
    private DgsQueryExecutor dgsQueryExecutor;

    @Test
    void executeAndExtractJsonPathTest() {
        String title = dgsQueryExecutor.executeAndExtractJsonPath(
                "{\n" +
                        "  bookById(id: 1) {\n" +
                        "    title\n" +
                        "    genre\n" +
                        "  }\n" +
                        "}\n",
                "data.bookById.title");

        Assertions.assertEquals(title, "Fundamentals of Wavelets");
    }

    @Test
    void executeAndExtractJsonPathAsObjectTest() {
        com.syscho.graphql.generated.types.Book book = dgsQueryExecutor.executeAndExtractJsonPathAsObject("{ bookAS:bookById(id: 1) { title  genre } }",
                "data.bookAS", com.syscho.graphql.generated.types.Book.class);
        Assertions.assertEquals(book.getTitle(), "Fundamentals of Wavelets");

    }
}
