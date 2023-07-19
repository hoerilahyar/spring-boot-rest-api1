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
  
}
