package com.example.demo.Controller.EmployeeController;

import com.example.demo.Repository.EmployeeRepository.*;
import com.example.demo.Entity.EmployeeEntity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AccountUserController {

    @Autowired private AccountUserRepository accountUserRepository;

    @PostMapping("/ILS_HR/{username}/{password}")
    public AccountUsers accountUsers(@PathVariable String username , @PathVariable String password){
        AccountUsers accountUsers1 = new AccountUsers();
        accountUsers1.setUsername(username);
        accountUsers1.setPassword(password);
        accountUserRepository.save(accountUsers1);
        return accountUsers1;
        //return this.accountUserRepository.findByUsernameAndPassword(userid,password);

    }
}