package com.belajar.restapi1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.restapi1.entity.Theater;
import com.belajar.restapi1.repository.TheaterRepository;

import java.util.*;

@Service
public class TheaterServiceImpl implements TheaterService{
  
  @Autowired
  private TheaterRepository theaterRepository;

  @Override
  public Theater saveTheater(Theater theater){
    return theaterRepository.save(theater);
  }

  @Override
  public List<Theater> fetchAllTheaters() {
      List<Theater> allTheaters = theaterRepository.findAll();
      return allTheaters;
  }

  @Override
  public Theater getTheaterById(Long id) {
      Optional<Theater> theater = theaterRepository.findById(id);
      if (theater.isPresent()) {
          return theater.get();
      }
      return null;
  }

  @Override
  public Theater updateTheaterById(Long id, Theater theater) {
      Optional<Theater> theater1 = theaterRepository.findById(id);

      if (theater1.isPresent()) {
          Theater originalTheater = theater1.get();

          // if (Objects.nonNull(Theater.getTheaterName()) && !"".equalsIgnoreCase(Theater.getTheaterName())) {
          //     originalTheater.setTheaterName(Theater.getTheaterName());
          // }
          // if (Objects.nonNull(Theater.getTheaterSalary()) && Theater.getTheaterSalary() != 0) {
          //     originalTheater.setTheaterSalary(Theater.getTheaterSalary());
          // }
          return theaterRepository.save(originalTheater);
      }
      return null;
  }

  @Override
  public String deleteTheaterById(Long id) {
      if (theaterRepository.findById(id).isPresent()) {
          theaterRepository.deleteById(id);
          return "Theater deleted successfully";
      }
      return "No such Theater in the database";
  }
}
