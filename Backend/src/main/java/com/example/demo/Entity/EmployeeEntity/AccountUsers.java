package com.example.demo.Entity.EmployeeEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "AccountUsers")
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

   /* @OneToOne(fetch = FetchType.EAGER  ,targetEntity = EmployeeMaster.class)
    @JoinColumn(name = "employeeMasterID",insertable = true)
    private EmployeeMaster employeeMaster;*/
}
