package com.belajar.restapi1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.restapi1.entity.Theater;
import com.belajar.restapi1.service.TheaterService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@Tag(name = "Theater", description = "Theater APIs")
@RequestMapping("/api/theater")
public class TheaterController {

  @Autowired
  private TheaterService theaterService;
  
  @PostMapping("/theater")
    public Theater saveTheater(@RequestBody Theater theater) {
        return theaterService.saveTheater(theater);
    }

    @GetMapping("/theater")
    public List<Theater> getAllTheaters() {
        return theaterService.fetchAllTheaters();
    }

    @GetMapping("/theater/{id}")
    public Theater getTheaterById(@PathVariable("id") Long id) {
        return theaterService.getTheaterById(id);
    }

    @PutMapping("/theater/{id}")
    public Theater updateTheater(@PathVariable("id") Long id, @RequestBody Theater theater) {
        return theaterService.updateTheaterById(id, theater);
    }

    @DeleteMapping("/theater/{id}")
    public String deleteTheater(@PathVariable("id") Long id) {
        return theaterService.deleteTheaterById(id);
    }
}
