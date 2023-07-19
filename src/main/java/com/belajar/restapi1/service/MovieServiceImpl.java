package com.belajar.restapi1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.restapi1.entity.Movie;
import com.belajar.restapi1.repository.MovieRepository;

import java.util.*;

@Service
public class MovieServiceImpl implements MovieService{

  @Autowired
  private MovieRepository movieRepository;

  @Override
  public Movie saveMovie(Movie movie){
    return movieRepository.save(movie);
  }

  @Override
  public List<Movie> fetchAllMovies() {
      List<Movie> allMovies = movieRepository.findAll();
      return allMovies;
  }

  @Override
  public Movie getMovieById(Long id) {
      Optional<Movie> movie = movieRepository.findById(id);
      if (movie.isPresent()) {
          return movie.get();
      }
      return null;
  }

  @Override
  public Movie updateMovieById(Long id, Movie movie) {
      Optional<Movie> movie1 = movieRepository.findById(id);

      if (movie1.isPresent()) {
          Movie originalMovie = movie1.get();

          // if (Objects.nonNull(Movie.getMovieName()) && !"".equalsIgnoreCase(Movie.getMovieName())) {
          //     originalMovie.setMovieName(Movie.getMovieName());
          // }
          // if (Objects.nonNull(Movie.getMovieSalary()) && Movie.getMovieSalary() != 0) {
          //     originalMovie.setMovieSalary(Movie.getMovieSalary());
          // }
          return movieRepository.save(originalMovie);
      }
      return null;
  }

  @Override
  public String deleteMovieById(Long id) {
      if (movieRepository.findById(id).isPresent()) {
          movieRepository.deleteById(id);
          return "Movie deleted successfully";
      }
      return "No such Movie in the database";
  }
}
