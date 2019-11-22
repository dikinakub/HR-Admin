package com.example.demo.Controller.EmployeeController;

import com.example.demo.Repository.EmployeeRepository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeMasterController {


    @Autowired
    private EmployeeMasterRepository employeeMasterRepository;

    /*@PostMapping("/BookMeetingRoom/Report/{date}")
    public Iterable<Report> Report(@PathVariable String date) {
        return this.reportRepository.getDateReport(date);
    }*/
}