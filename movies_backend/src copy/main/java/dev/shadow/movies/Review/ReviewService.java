package dev.shadow.movies.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import dev.shadow.movies.Movie.MovieModel;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewDAO reviewDAO;

    @Autowired
    private MongoTemplate mongoTemplate; //joins , dynamic query


    public ReviewModel createReview(String imdbId,String body){

        //insert the review
        ReviewModel review = reviewDAO.insert(new ReviewModel(body));;


        //update movies with the review (joins)
        mongoTemplate.update(MovieModel.class)
                    .matching(Criteria.where("imdbId").is(imdbId))
                    .apply(new Update().push("reviewIds").value(review))
                    .first();


        return review;

    }

}
