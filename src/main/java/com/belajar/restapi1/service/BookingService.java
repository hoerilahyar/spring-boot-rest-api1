package com.belajar.restapi1.service;

import com.belajar.restapi1.entity.Booking;

import java.util.*;

public interface BookingService {
  Booking saveBooking(Booking booking);

  List<Booking> fetchAllBookings();

  Booking getBookingById(Long id);

  Booking updateBookingById(Long id, Booking booking);

  String deleteBookingById(Long id);
}
