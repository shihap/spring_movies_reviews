package dev.shadow.movies.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired //instead of intilaized by constructor
    private MovieDAO movieDAO;

    public List<MovieModel> AllMovies(){
         return movieDAO.findAll();
    }

    public Optional<MovieModel> SingleMovie(String id){
        return movieDAO.findMovieModelByimdbId(id);
    }
    
}
