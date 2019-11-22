package com.example.demo.Repository.EmployeeRepository;

import com.example.demo.Entity.EmployeeEntity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Collection;

//@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface AccountUserRepository extends JpaRepository<AccountUsers,Long> {

    AccountUsers findByaccountID(String accountID);

}