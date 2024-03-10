package dev.shadow.movies.Movie;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDAO extends MongoRepository<MovieModel,ObjectId> {
    
    //custom
    Optional<MovieModel> findMovieModelByimdbId(String imdbId);

}
