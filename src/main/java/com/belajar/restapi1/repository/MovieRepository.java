package com.belajar.restapi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.belajar.restapi1.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
  
}
