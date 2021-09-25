package com.syscho.graphql.shows;

import com.syscho.graphql.generated.types.Review;
import com.syscho.graphql.generated.types.Show;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowsServiceImpl implements ShowsService {


    private List<Show> shows = null;
    private List<Review> reviews = null;

    @PostConstruct
    void initData() {

        shows = new ArrayList<>();
        shows.add(buildShow("1", "The Monster hub"));
        shows.add(buildShow("2", "Deadpool the artist"));
        shows.add(buildShow("3", "Wolverine the Beast"));

        reviews = new ArrayList<>();
        reviews.add(buildReview("1", 8));
        reviews.add(buildReview("2", 9));
        reviews.add(buildReview("3", 10));
    }

    private com.syscho.graphql.generated.types.Review buildReview(String showId, int rating) {
        return Review.newBuilder()
                .starRating(rating)
                .showId(showId)

                .build();
    }

    private com.syscho.graphql.generated.types.Show buildShow(String showId, String title) {
        return Show.newBuilder().showId(showId).title(title).build();
    }

    @Override
    public List<Show> getShows() {
        System.out.println(shows);
        System.out.println("**************");
        return shows;
    }

    @Override
    public List<Review> getReviewsForShow(String showId) {
        return reviews.stream().filter(review -> review.getShowId().equals(showId)).collect(Collectors.toList());
    }

}
