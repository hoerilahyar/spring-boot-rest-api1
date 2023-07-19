package com.belajar.restapi1.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.belajar.restapi1.entity.Booking;
import com.belajar.restapi1.service.BookingService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Booking", description = "Booking APIs")
@RequestMapping("/api/booking")
public class BookingController {

  @Autowired
  private BookingService bookingService;
  
  @PostMapping("/booking")
    public Booking saveBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    @GetMapping("/booking")
    public List<Booking> getAllBookings() {
        return bookingService.fetchAllBookings();
    }

    @GetMapping("/booking/{id}")
    public Booking getBookingById(@PathVariable("id") Long id) {
        return bookingService.getBookingById(id);
    }

    @PutMapping("/booking/{id}")
    public Booking updateBooking(@PathVariable("id") Long id, @RequestBody Booking booking) {
        return bookingService.updateBookingById(id, booking);
    }

    @DeleteMapping("/booking/{id}")
    public String deleteBooking(@PathVariable("id") Long id) {
        return bookingService.deleteBookingById(id);
    }
}
