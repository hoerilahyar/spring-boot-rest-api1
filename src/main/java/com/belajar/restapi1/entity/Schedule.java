package com.belajar.restapi1.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

@Data
@Entity
@Table(name="schedules")
public class Schedule {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;

  @OneToOne
  @JoinColumn(name="movie_id", unique=true, nullable=false, updatable=false)
  private Movie movie_id;

  @OneToOne
  @JoinColumn(name="theater_id", unique=true, nullable=false, updatable=false)
  private Theater theater_id;

  @ManyToMany(mappedBy = "schedules")
  private List<Booking> bookings;

  private LocalDateTime start_showing;  

  private LocalDateTime finish_showing;

  private long price;

  public Schedule(long ID, LocalDateTime start_showing, LocalDateTime finish_showing, long price){
    this.ID = ID;
    this.start_showing = start_showing;
    this.finish_showing = finish_showing;
    this.price = price;
  }

  public void setScheduleID(long ID){
    this.ID = ID;
  }

  public long getScheduleID(){
    return ID;
  }

  public void setStartShow(LocalDateTime startShow){
    this.start_showing = startShow;
  }

  public LocalDateTime getStartShow(){
    return start_showing;
  }

  public void setFinishShow(LocalDateTime finishShow){
    this.finish_showing = finishShow;
  }

  public LocalDateTime getFinishShow(){
    return finish_showing;
  }

  public void setPrice(long price){
    this.price = price;
  }

  public long getPrice(){
    return price;
  }

}
