package com.belajar.restapi1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.restapi1.entity.Movie;
import com.belajar.restapi1.service.MovieService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@Tag(name = "Movie", description = "Movie APIs")
@RequestMapping("/api/movie")
public class MovieController {

  @Autowired
  private MovieService movieService;
  
  @PostMapping("/movie")
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @GetMapping("/movie")
    public List<Movie> getAllMovies() {
        return movieService.fetchAllMovies();
    }

    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable("id") Long id) {
        return movieService.getMovieById(id);
    }

    @PutMapping("/movie/{id}")
    public Movie updateMovie(@PathVariable("id") Long id, @RequestBody Movie movie) {
        return movieService.updateMovieById(id, movie);
    }

    @DeleteMapping("/movie/{id}")
    public String deleteMovie(@PathVariable("id") Long id) {
        return movieService.deleteMovieById(id);
    }
}
