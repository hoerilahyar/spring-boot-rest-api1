package com.belajar.restapi1.service;

import com.belajar.restapi1.entity.Schedule;
import java.util.*;

public interface ScheduleService {
  
  Schedule saveSchedule(Schedule schedule);

  List<Schedule> fetchAllSchedules();

  Schedule getScheduleById(Long id);

  Schedule updateScheduleById(Long id, Schedule schedule);

  String deleteScheduleById(Long id);
  
}
