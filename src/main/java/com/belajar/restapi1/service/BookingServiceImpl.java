package com.belajar.restapi1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.restapi1.entity.Booking;
import com.belajar.restapi1.repository.BookingRepository;

import java.util.*;

@Service
public class BookingServiceImpl implements BookingService{
  @Autowired
  private BookingRepository bookingRepository;

  @Override
  public Booking saveBooking(Booking booking){
    return bookingRepository.save(booking);
  }

  @Override
  public List<Booking> fetchAllBookings() {
      List<Booking> allBookings = bookingRepository.findAll();
      return allBookings;
  }

  @Override
  public Booking getBookingById(Long id) {
      Optional<Booking> booking = bookingRepository.findById(id);
      if (booking.isPresent()) {
          return booking.get();
      }
      return null;
  }

  @Override
  public Booking updateBookingById(Long id, Booking Booking) {
      Optional<Booking> booking1 = bookingRepository.findById(id);

      if (booking1.isPresent()) {
          Booking originalBooking = booking1.get();

          // if (Objects.nonNull(Booking.getBookingName()) && !"".equalsIgnoreCase(Booking.getBookingName())) {
          //     originalBooking.setBookingName(Booking.getBookingName());
          // }
          // if (Objects.nonNull(Booking.getBookingSalary()) && Booking.getBookingSalary() != 0) {
          //     originalBooking.setBookingSalary(Booking.getBookingSalary());
          // }
          return bookingRepository.save(originalBooking);
      }
      return null;
  }

  @Override
  public String deleteBookingById(Long id) {
      if (bookingRepository.findById(id).isPresent()) {
          bookingRepository.deleteById(id);
          return "Booking deleted successfully";
      }
      return "No such Movie in the database";
  }
}
