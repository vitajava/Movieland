package ua.ievleva.movieland.dao;

import ua.ievleva.movieland.entity.Movie;

import java.util.List;
import java.util.Map;


public interface MovieDao {

    List<Movie> getAllMovies(Map<String, String> orderByParameters);

    Movie getMovieById(String movieId);

    List<Movie> searchMovies(Map<String, String> searchParameters);

}
