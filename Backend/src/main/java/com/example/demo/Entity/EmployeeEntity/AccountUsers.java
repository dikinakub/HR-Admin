package com.example.demo.Entity.EmployeeEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity

@NoArgsConstructor


public class AccountUsers {
    @Id
    @SequenceGenerator(name = "user_seq",sequenceName = "user_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq")
    @Column(name = "AccountID",unique = true,nullable = false)
    @NotNull(message = "AccountID is Null")
    private Long accountID;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



   /* @OneToOne(fetch = FetchType.EAGER  ,targetEntity = EmployeeMaster.class)
    @JoinColumn(name = "employeeMasterID",insertable = true)
    private EmployeeMaster employeeMaster;*/
}
