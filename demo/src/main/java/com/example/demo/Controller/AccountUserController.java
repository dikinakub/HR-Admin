package com.example.demo.Controller;

import com.example.demo.Repository.*;
import com.example.demo.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class AccountUserController {

    @Autowired private AccountUserRepository accountUserRepository;
    @Autowired private EmployeeMasterRepository employeeMasterRepository;

    @PostMapping("/ILS_HR/{employeeid}/{statusSelect}/{userCreate}/{passwordCreate}")
    public AccountUsers accountUsers( @PathVariable Long employeeid , @PathVariable String statusSelect
                                    , @PathVariable String userCreate , @PathVariable String passwordCreate){

        EmployeeMaster employeeMaster1 = employeeMasterRepository.findById(employeeid).get();

        AccountUsers accountUsers1 = new AccountUsers();
        accountUsers1.setEmployeeMasterid(employeeMaster1);
        accountUsers1.setStatus(statusSelect);
        accountUsers1.setUsername(userCreate);
        accountUsers1.setPassword(passwordCreate);
        accountUserRepository.save(accountUsers1);
        return accountUsers1;


    }
}