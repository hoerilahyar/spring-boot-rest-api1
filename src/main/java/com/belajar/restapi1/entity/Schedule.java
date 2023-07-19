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

}
