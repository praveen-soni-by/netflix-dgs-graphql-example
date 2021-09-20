package com.syscho.graphql.context;

import java.util.ArrayList;

public class CustomContext {

    private final ArrayList<com.syscho.graphql.generated.types.Book>
            context = new ArrayList<>();

    public ArrayList<com.syscho.graphql.generated.types.Book> getContext() {
        return context;
    }


}
