package com.belajar.restapi1.service;

import com.belajar.restapi1.entity.Movie;
import java.util.*;

public interface MovieService {
  Movie saveMovie(Movie movie);

  List<Movie> fetchAllMovies();

  Movie getMovieById(Long id);

  Movie updateMovieById(Long id, Movie movie);

  String deleteMovieById(Long id);
}
