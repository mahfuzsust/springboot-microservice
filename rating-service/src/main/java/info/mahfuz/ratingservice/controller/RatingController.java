package info.mahfuz.ratingservice.controller;

import info.mahfuz.ratingservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RestTemplate restTemplate;

    private List<Rating> ratings = new ArrayList<>();

    public RatingController() {
        this.ratings.add(new Rating(1,5, 1, 1));
        this.ratings.add(new Rating(2,4, 1, 2));
        this.ratings.add(new Rating(3,4, 2, 1));
        this.ratings.add(new Rating(4,5, 2, 2));
    }

    @RequestMapping("/get/user/{userId}")
    public ListResponse<RatingResponse> getRating(@PathVariable("userId") int userId) {
        List<Rating> ratings = this.ratings.stream()
                .filter(rating -> rating.getUserId() == userId)
                .collect(Collectors.toList());

        List<RatingResponse> responseList = new ArrayList<>();
        ratings.forEach(rating -> {
            RatingResponse resp = new RatingResponse();
            resp.setId(rating.getId());
            resp.setRating(rating.getRating());
            resp.setUser(restTemplate.getForObject("http://user-service/user/get/" + rating.getUserId(), User.class));
            resp.setBook(restTemplate.getForObject("http://book-service/book/get/" + rating.getBookId(), Book.class));

            responseList.add(resp);
        });

        return new ListResponse(responseList);
    }

    @RequestMapping("/get/{id}")
    public Rating get(@PathVariable("id") int id) {
        return this.ratings.stream().filter(rating -> rating.getId() == id).findAny().orElse(null);
    }
}
