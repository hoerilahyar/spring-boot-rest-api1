package com.belajar.restapi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.belajar.restapi1.entity.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long>{
  
}
