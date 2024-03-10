package dev.shadow.movies.TestReview;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;

import dev.shadow.movies.Review.ReviewModel;

public class TestReviewModel {

    @Test
    public void testReviewModel() {
        // Create a ReviewModel instance
        ReviewModel review = new ReviewModel();

        // Verify that properties are initially null
        assertNull(review.getId());
        assertNull(review.getBody());

        // Set and get the ID
        ObjectId id = new ObjectId();
        review.setId(id);
        assertEquals(id, review.getId());

        // Set and get the body
        review.setBody("Test review body");
        assertEquals("Test review body", review.getBody());


        ReviewModel review2 = new ReviewModel(new ObjectId(),"hello");
        assertEquals("hello", review2.getBody());


    }
}
