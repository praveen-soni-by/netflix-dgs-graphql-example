package com.syscho.graphql.shows;

import java.util.List;

public interface ShowsService {
    List<com.syscho.graphql.generated.types.Show> getShows(); //Does not include reviews

    List<com.syscho.graphql.generated.types.Review> getReviewsForShow(String showId);
}