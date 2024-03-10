package dev.shadow.movies.Review;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewDAO extends MongoRepository<ReviewModel,ObjectId> {
    
}
