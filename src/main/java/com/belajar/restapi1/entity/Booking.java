package com.belajar.restapi1.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

@Data
@Entity
@Table(name="bookings")
public class Booking {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "book_schedule", 
    joinColumns = @JoinColumn(name = "schedule_id", referencedColumnName = "id"), 
    inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
  private List<Schedule> schedules;
  
  private String name;

  
}
