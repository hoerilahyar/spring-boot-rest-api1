package com.belajar.restapi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.belajar.restapi1.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
  
}
