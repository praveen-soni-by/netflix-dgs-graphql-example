package com.syscho.graphql.context;

import com.netflix.graphql.dgs.context.DgsCustomContextBuilder;
import com.syscho.graphql.generated.types.Book;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Primary
public class GenericContextBuilder implements DgsCustomContextBuilder<CustomContext> {
    @Override
    public CustomContext build() {
        return new CustomContext();
    }
}

