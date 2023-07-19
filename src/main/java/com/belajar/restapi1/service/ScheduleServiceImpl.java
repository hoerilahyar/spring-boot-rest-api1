package com.belajar.restapi1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.restapi1.entity.Schedule;
import com.belajar.restapi1.repository.ScheduleRepository;

import java.util.*;

@Service
public class ScheduleServiceImpl implements ScheduleService{

  @Autowired
  private ScheduleRepository scheduleRepository;

  @Override
  public Schedule saveSchedule(Schedule schedule){
    return scheduleRepository.save(schedule);
  }

  @Override
  public List<Schedule> fetchAllSchedules() {
      List<Schedule> allSchedules = scheduleRepository.findAll();
      return allSchedules;
  }

  @Override
  public Schedule getScheduleById(Long id) {
      Optional<Schedule> schedule = scheduleRepository.findById(id);
      if (schedule.isPresent()) {
          return schedule.get();
      }
      return null;
  }

  @Override
  public Schedule updateScheduleById(Long id, Schedule Schedule) {
      Optional<Schedule> schedule1 = scheduleRepository.findById(id);

      if (schedule1.isPresent()) {
          Schedule originalSchedule = schedule1.get();

          // if (Objects.nonNull(Schedule.getScheduleName()) && !"".equalsIgnoreCase(Schedule.getScheduleName())) {
          //     originalSchedule.setScheduleName(Schedule.getScheduleName());
          // }
          // if (Objects.nonNull(Schedule.getScheduleSalary()) && Schedule.getScheduleSalary() != 0) {
          //     originalSchedule.setScheduleSalary(Schedule.getScheduleSalary());
          // }
          return scheduleRepository.save(originalSchedule);
      }
      return null;
  }

  @Override
  public String deleteScheduleById(Long id) {
      if (scheduleRepository.findById(id).isPresent()) {
          scheduleRepository.deleteById(id);
          return "Schedule deleted successfully";
      }
      return "No such schedule in the database";
  }
}
