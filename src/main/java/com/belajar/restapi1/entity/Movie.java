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
  
  private String title;

  private String desc;

  private int rating;

  private Date releaseDate;

  private LocalTime duration;

  private String file;
  
  @OneToOne(mappedBy = "movie_id")
  private Schedule schedule;
  
  public Movie(long ID, String title, String desc, int rating, Date releaseDate, LocalTime duration, String file){
    this.ID = ID;
    this.title = title;
    this.desc = desc;
    this.rating = rating;
    this.releaseDate = releaseDate;
    this.duration = duration;
    this.file = file;
  }

  public Movie(Long ID, String title){
    this.ID = ID;
    this.title = title;
  }

  public long getmovieID(){
    return ID;
  }

  public void setmovieID(long ID){
    this.ID = ID;
  }

  public String getTitle(){
    return title;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public int getRating(){
    return rating;
  }

  public void setRating(int rating){
    this.rating = rating;
  }

  public Date getReleaseDate(){
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate){
    this.releaseDate = releaseDate;
  }

  public LocalTime getDuration(){
    return duration;
  }

  public void setDuration(LocalTime duration){
    this.duration = duration;
  }

  public String getfile(){
    return file;
  }

  public void setfile(String file){
    this.file = file;
  }
}
