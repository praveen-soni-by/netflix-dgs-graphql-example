package com.syscho.graphql.shows;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
public class ShowResolver {

    @Autowired
    private ShowsService showsService;

    @DgsData(parentType = "QueryResolver", field = "shows")
    List<com.syscho.graphql.generated.types.Show> shows() {
        System.out.println("**********************************");
        return showsService.getShows();
    }

    @DgsData(parentType = "Show", field = "reviews")
    List<com.syscho.graphql.generated.types.Review> reviews(DgsDataFetchingEnvironment dfe) {
        System.out.println("**********************************");

        com.syscho.graphql.generated.types.Show show = dfe.getSource();
        return showsService.getReviewsForShow(show.getShowId());
    }

}
