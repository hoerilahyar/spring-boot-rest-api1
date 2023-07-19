package com.belajar.restapi1.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.*;

@Data
@Entity
@Table(name="movies")
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;
  
  private String Title;

  private String Desc;

  private int Rating;

  private Date releaseDate;

  private LocalTime duration;

  private String file;
  
  @OneToOne(mappedBy = "movie_id")
  private Schedule schedule;
  
  public Movie(){

  }

  public Movie(Long ID, String Title){
    this.ID = ID;
    this.Title = Title;
  }

  public long getmovieID(){
    return ID;
  }

  public long setmovieID(long ID){
    this.ID = ID;
    return ID;
  }
}
