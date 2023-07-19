package com.belajar.restapi1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.belajar.restapi1.entity.Schedule;
import com.belajar.restapi1.service.ScheduleService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.util.*;

public class ScheduleController {

  @Autowired
  private ScheduleService scheduleService;
  
  @PostMapping("/schedule")
    public Schedule saveSchedule(@RequestBody Schedule schedule) {
        return scheduleService.saveSchedule(schedule);
    }

    @GetMapping("/schedule")
    public List<Schedule> getAllSchedules() {
        return scheduleService.fetchAllSchedules();
    }

    @GetMapping("/schedule/{id}")
    public Schedule getScheduleById(@PathVariable("id") Long id) {
        return scheduleService.getScheduleById(id);
    }

    @PutMapping("/schedule/{id}")
    public Schedule updateSchedule(@PathVariable("id") Long id, @RequestBody Schedule schedule) {
        return scheduleService.updateScheduleById(id, schedule);
    }

    @DeleteMapping("/schedule/{id}")
    public String deleteSchedule(@PathVariable("id") Long id) {
        return scheduleService.deleteScheduleById(id);
    }
}
