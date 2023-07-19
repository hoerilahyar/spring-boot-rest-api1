package com.belajar.restapi1.service;

import com.belajar.restapi1.entity.Theater;
import java.util.*;

public interface TheaterService {
  
  Theater saveTheater(Theater theater);

  List<Theater> fetchAllTheaters();

  Theater getTheaterById(Long id);

  Theater updateTheaterById(Long id, Theater theater);

  String deleteTheaterById(Long id);
}
