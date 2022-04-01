package com.mir00r.ratingdataservices.controllers;

import com.mir00r.ratingdataservices.models.Rating;
import com.mir00r.ratingdataservices.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mir00r on 1/4/22
 * @project IntelliJ IDEA
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingController {

    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;
    }
}
