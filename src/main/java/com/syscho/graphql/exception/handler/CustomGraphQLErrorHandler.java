package com.syscho.graphql.exception.handler;

import com.netflix.graphql.dgs.exceptions.DefaultDataFetcherExceptionHandler;
import com.netflix.graphql.types.errors.ErrorType;
import com.netflix.graphql.types.errors.TypedGraphQLError;
import com.syscho.graphql.exception.NoDataFoundException;
import graphql.GraphQLError;
import graphql.execution.DataFetcherExceptionHandler;
import graphql.execution.DataFetcherExceptionHandlerParameters;
import graphql.execution.DataFetcherExceptionHandlerResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientRequestException;

@Component
@Slf4j
@ConditionalOnProperty(prefix = "exception.custom", name = "enable", havingValue = "true")
public class CustomGraphQLErrorHandler implements DataFetcherExceptionHandler {
    private final DefaultDataFetcherExceptionHandler defaultHandler = new DefaultDataFetcherExceptionHandler();

    @Override
    public DataFetcherExceptionHandlerResult onException(DataFetcherExceptionHandlerParameters handlerParameters) {
        //Handling graphql exception
        log.error("DataFetcherExceptionHandlerResult : error ", handlerParameters);

        if (handlerParameters.getException() instanceof NoDataFoundException) {
            GraphQLError graphqlError = TypedGraphQLError.newBuilder().message(handlerParameters.getException().getMessage())
                    .extensions(((NoDataFoundException) handlerParameters.getException()).getExtensions())
                    .path(handlerParameters.getPath()).build();
            return buildResponse(graphqlError);
        }
        //Handling spring/java exception
        else if (handlerParameters.getException() instanceof WebClientRequestException) {
            GraphQLError graphqlError = TypedGraphQLError.newBuilder().message("service is down try some  other time")
                    .errorType(ErrorType.INTERNAL)
                    .path(handlerParameters.getPath()).build();
            return buildResponse(graphqlError);
        } else {
            return defaultHandler.onException(handlerParameters);
        }
    }

    private DataFetcherExceptionHandlerResult buildResponse(GraphQLError graphqlError) {
        return DataFetcherExceptionHandlerResult.newResult()
                .error(graphqlError)
                .build();
    }

}
