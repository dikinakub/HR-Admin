package com.example.demo.Controller;

import com.example.demo.Repository.*;
import com.example.demo.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeMasterController {


    @Autowired private EmployeeMasterRepository employeeMasterRepository;

    /*@PostMapping("/BookMeetingRoom/Report/{date}")
    public Iterable<Report> Report(@PathVariable String date) {
        return this.reportRepository.getDateReport(date);
    }*/

    @PostMapping("/ILS_HR/{employeeMasterCustomerCode}/{employeeMasterFirstName}/{employeeMasterLastName}/{employeeMasterNickName}" +
            "/{employeeMasterGender}/{maritalStatus}/{employeeMasterBirthDate}/{employeeMasterPersonID}/{employeeMasterTel1}/{empEmail}" +
            "/{empAddressReal}/{empAddressPerson}/{employeeMasterStartDate}/{employeePosition}/{employeeDepartment}/{employeeType}/{education}/{bank}/{bankNumber}")
    public EmployeeMaster employeeMaster(@PathVariable String employeeMasterCustomerCode , @PathVariable String employeeMasterFirstName
            , @PathVariable String employeeMasterLastName , @PathVariable String employeeMasterNickName , @PathVariable String employeeMasterGender
            , @PathVariable String maritalStatus , @PathVariable Date employeeMasterBirthDate , @PathVariable String employeeMasterPersonID
            , @PathVariable String employeeMasterTel1, @PathVariable String empEmail , @PathVariable String empAddressReal
            , @PathVariable String empAddressPerson , @PathVariable Date employeeMasterStartDate , @PathVariable String employeePosition
            , @PathVariable String employeeDepartment , @PathVariable String employeeType , @PathVariable String education
            , @PathVariable String bank , @PathVariable String bankNumber ){

        EmployeeMaster employeeMaster1 = new EmployeeMaster();
        employeeMaster1.setEmployeeMasterCustomerCode(employeeMasterCustomerCode);
        employeeMaster1.setEmployeeMasterFirstName(employeeMasterFirstName);
        employeeMaster1.setEmployeeMasterLastName(employeeMasterLastName);
        employeeMaster1.setEmployeeMasterNickName(employeeMasterNickName);
        employeeMaster1.setEmployeeMasterGender(employeeMasterGender);
        employeeMaster1.setMaritalStatus(maritalStatus);
        employeeMaster1.setEmployeeMasterBirthDate(employeeMasterBirthDate);
        employeeMaster1.setEmployeeMasterPersonID(employeeMasterPersonID);
        employeeMaster1.setEmployeeMasterTel1(employeeMasterTel1);
        employeeMaster1.setEmpEmail(empEmail);
        employeeMaster1.setEmpAddressReal(empAddressReal);
        employeeMaster1.setEmpAddressPerson(empAddressPerson);
        employeeMaster1.setEmployeeMasterStartDate(employeeMasterStartDate);
        employeeMaster1.setEmployeePosition(employeePosition);
        employeeMaster1.setEmployeeDepartment(employeeDepartment);
        employeeMaster1.setEmployeeType(employeeType);
        employeeMaster1.setEducation(education);
        employeeMaster1.setBank(bank);
        employeeMaster1.setBankNumber(bankNumber);

        employeeMaster1.setIsActive("1");
        employeeMasterRepository.save(employeeMaster1);
        return employeeMaster1;

    }

  /* @PostMapping("/ILS_HR/{employeeMasterCustomerCode}/{employeeMasterFirstName}/{employeeMasterLastName}/{employeeMasterNickName}/{employeeMasterGender}" +
            "/{maritalStatus}/{employeeMasterBirthDate}/{employeeMasterPersonID}/{employeeMasterTel1}/{empEmail}/{empAddressReal}/{empAddressPerson}/{employeeMasterStartDate}" +
            "/{employeePosition}/{employeeDepartment}/{employeeType}/{education}/{bank}/{bankNumber}")
    public EmployeeMaster employeeMaster(@PathVariable String employeeMasterCustomerCode , @PathVariable String employeeMasterFirstName
            , @PathVariable String employeeMasterLastName , @PathVariable String employeeMasterNickName , @PathVariable String employeeMasterGender
            , @PathVariable String maritalStatus , @PathVariable LocalDate employeeMasterBirthDate , @PathVariable String employeeMasterPersonID
            , @PathVariable String employeeMasterTel1 , @PathVariable String empEmail , @PathVariable String empAddressReal
            , @PathVariable String empAddressPerson , @PathVariable LocalDate employeeMasterStartDate , @PathVariable String employeePosition
            , @PathVariable String employeeDepartment , @PathVariable String employeeType , @PathVariable String education
            , @PathVariable String bank , @PathVariable String bankNumber ){

        EmployeeMaster employeeMaster1 = new EmployeeMaster();
        employeeMaster1.setEmployeeMasterCustomerCode(employeeMasterCustomerCode);
        employeeMaster1.setEmployeeMasterFirstName(employeeMasterFirstName);
        employeeMaster1.setEmployeeMasterLastName(employeeMasterLastName);
        employeeMaster1.setEmployeeMasterNickName(employeeMasterNickName);
        employeeMaster1.setEmployeeMasterGender(employeeMasterGender);
        employeeMaster1.setMaritalStatus(maritalStatus);
        employeeMaster1.setEmployeeMasterBirthDate(employeeMasterBirthDate);
        employeeMaster1.setEmployeeMasterPersonID(employeeMasterPersonID);
        employeeMaster1.setEmployeeMasterTel1(employeeMasterTel1);
        employeeMaster1.setEmpEmail(empEmail);
        employeeMaster1.setEmpAddressReal(empAddressReal);
        employeeMaster1.setEmpAddressPerson(empAddressPerson);
        employeeMaster1.setEmployeeMasterStartDate(employeeMasterStartDate);
        employeeMaster1.setEmployeePosition(employeePosition);
        employeeMaster1.setEmployeeDepartment(employeeDepartment);
        employeeMaster1.setEmployeeType(employeeType);
        employeeMaster1.setEducation(education);
        employeeMaster1.setBank(bank);
        employeeMaster1.setBankNumber(bankNumber);
        employeeMaster1.setIsActive("1");
        employeeMasterRepository.save(employeeMaster1);
        return employeeMaster1;

    }*/
}