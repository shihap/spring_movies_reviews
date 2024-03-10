package dev.shadow.movies.Movie;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import dev.shadow.movies.Review.ReviewModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
//instead of writing getters , setters , constructors {lombok}
@Data //getters, setters
@AllArgsConstructor //constructor(all parameters)
@NoArgsConstructor //constructor()
public class MovieModel {

    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private List<String> genres;

    private String poster;

    private List<String> backdrops;

    @DocumentReference //will only got the id
    private List<ReviewModel> reviewIds;
    
}
