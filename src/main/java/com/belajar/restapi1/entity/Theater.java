package com.belajar.restapi1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="theaters")
public class Theater {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;

  private long seats;

  private String name;

  @OneToOne(mappedBy = "theater_id")
  private Schedule schedule;
  
  public Theater(long ID, long seats, String name){
    this.ID = ID;
    this.seats = seats;
    this.name = name;
  }

  public void setTheaterID(long ID){
    this.ID = ID;
  }

  public long getTheaterID(){
    return ID;
  }

  public void setSeats(long seats){
    this.seats = seats;
  }

  public long getSeats(){
    return seats;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
}
