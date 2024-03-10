/*package dev.shadow.movies.TestMovie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;

import dev.shadow.movies.Movie.MovieModel;
import dev.shadow.movies.Review.ReviewModel;

public class TestMovieModel {
    
    @Test
    public void testMovieModel() {
        // Create a MovieModel instance
        MovieModel movie = new MovieModel();

        // Verify that properties are initially null
        assertNull(movie.getId());
        assertNull(movie.getImdbId());
        assertNull(movie.getTitle());
        assertNull(movie.getReleaseDate());
        assertNull(movie.getTrailerLink());
        assertNull(movie.getGenres());
        assertNull(movie.getPoster());
        assertNull(movie.getBackdrops());
        assertNull(movie.getReviewIds());


        // Set properties functions
        ObjectId id = new ObjectId();
        movie.setId(id);
        movie.setImdbId("tt123456");
        movie.setTitle("Test Movie");
        movie.setReleaseDate("2023-10-16");
        movie.setTrailerLink("https://example.com/trailer");
        movie.setGenres(List.of("Action", "Adventure"));
        movie.setPoster("https://example.com/poster");
        movie.setBackdrops(List.of("https://example.com/backdrop1", "https://example.com/backdrop2"));
        movie.setReviewIds(List.of(new ReviewModel(), new ReviewModel()));

        // Verify that the properties are set correctly
        assertEquals(id, movie.getId());
        assertEquals("tt123456", movie.getImdbId());
        assertEquals("Test Movie", movie.getTitle());
        assertEquals("2023-10-16", movie.getReleaseDate());
        assertEquals("https://example.com/trailer", movie.getTrailerLink());
        assertEquals(2, movie.getGenres().size());
        assertEquals("https://example.com/poster", movie.getPoster());
        assertEquals(2, movie.getBackdrops().size());
        assertEquals(2, movie.getReviewIds().size());
        
    }

}
*/