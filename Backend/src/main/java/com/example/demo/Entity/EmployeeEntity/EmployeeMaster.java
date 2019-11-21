package com.example.demo.Entity.EmployeeEntity;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "EmployeeMaster")
public class EmployeeMaster {
    @Id
    @SequenceGenerator(name = "Emp_seq", sequenceName = "Emp_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Emp_seq")
    @Column(name = "employeeMasterID", unique = true, nullable = false)
    @NotNull(message = "employeeMasterID is Null")
    private Long employeeMasterID;

    @Column(name = "employeeMasterCustomerCode", unique = true, nullable = false)
    @NotNull(message = "employeeMasterCustomerCode is Null ")
    private String employeeMasterCustomerCode;

    @Column(name = "employeeMasterFirstName", unique = false, nullable = false)
    @NotNull(message = "employeeMasterFirstName is Null ")
    private String employeeMasterFirstName;

    //    @Column(name = "employeeMasterLastName" ,unique = false ,nullable = false)
//    @NotNull(message = "employeeMasterLastName is Null ")
    private String employeeMasterLastName;

    //    @Column(name = "employeeMasterPersonID" ,unique = true ,nullable = true)
    @Pattern(regexp = "(\\d{13})||(\\w*\\d{2,9})||(\\w*\\s\\d{2,9})|null", message = "employeeMasterPersonID Pattern is fail")
    private String employeeMasterPersonID;

    //    @Column(name = "employeeMasterNickName" ,unique = false ,nullable = true)
//    @NotNull(message = "employeeMasterNickName is Null ")
    private String employeeMasterNickName;

    //    @Column(name = "employeeMasterTel1" ,unique = false ,nullable = true)
//    @NotNull(message = "employeeMasterTel1 is Null ")
    @Pattern(regexp = "\\d[08,09,06]\\d{8}|null", message = "employeeMasterTel1 Pattern is fail")
    @Size(max = 10, min = 0, message = "employeeMasterTel2 Size is Over or Little")
    private String employeeMasterTel1;

    //    @Column(name = "employeeMasterTel2" ,unique = false ,nullable = true)
//    @NotNull(message = "employeeMasterTel2 is Null")
    @Pattern(regexp = "\\d[08,09,06]\\d{8}|-|null", message = "employeeMasterTel2 Pattern is fail")
    @Size(max = 10, min = 0, message = "employeeMasterTel2 Size is Over or Little")
    private String employeeMasterTel2;

    //    @Column(name = "employeeMasterGender" ,unique = false ,nullable = true)
//    @NotNull(message = "employeeMasterGender is Null")
    private String employeeMasterGender;

    //    @Column(name = "employeeMasterBirthDate" ,unique = false ,nullable = true ,columnDefinition = "DATE")
//    @NotNull(message = "employeeMasterBirthDate is Null")
    private LocalDate employeeMasterBirthDate;

    //    @Column(name = "employeeMasterStartDate" ,unique = false ,nullable = true ,columnDefinition = "DATE")
//    @NotNull(message = "employeeMasterStartDate is Null")
    private LocalDate employeeMasterStartDate;

    //    @Column(name = "employeeMasterAccountNo" ,unique = false ,nullable = true)
//    @NotNull(message = "employeeMasterAccountNo is Null")
    @Size(min = 0, max = 10, message = "employeeMasterAccountNo Size is fail")
    private String employeeMasterAccountNo;

    //    @Column(name = "employeeMasterPrefix" ,unique = false ,nullable = true)
//    @NotNull(message = "employeeMasterPrefix is Null")
    private String employeeMasterPrefix;

    //    @Column(name = "maritalStatus" ,unique = false ,nullable = true)
//    @NotNull(message = "maritalStatus is Null")
    private String maritalStatus;

    //    @Column(name = "empAddressPerson" ,unique = false ,nullable = true)
//    @NotNull(message = "empAddressPerson is Null")
    private String empAddressPerson;

    //    @Column(name = "education" ,unique = false ,nullable = true)
//    @NotNull(message = "education is Null")
    private String education;

    //    @Column(name = "empAddressReal" ,unique = false ,nullable = true)
//    @NotNull(message = "empAddressReal is Null")
    private String empAddressReal;

    //    @Column(name = "empUserName" ,unique = true ,nullable = true)
//    @NotNull(message = "empUserName is Null")
    private String empUserName;

    //    @Column(name = "empPassword" ,unique = false ,nullable = true)
//    @NotNull(message = "empPassword is Null")
    private String empPassword;

    //    @Column(name = "empWorkExp" ,unique = false ,nullable = false)
//    @NotNull(message = "empWorkExp is Null")
   /* private Long empWorkExp;

    private LocalDateTime createDate;

    private String createName;

    private LocalDateTime updateDate;

    private String updateName;

    //----------------------------------------1JoinTable == EmployeeType
//    @NotNull(message = "employeeTypeName is Null in table EmployeeMaster")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = EmployeeType.class)
    @JoinColumn(name = "employeeTypeName", insertable = true)
    private EmployeeType employeeType;

    //----------------------------------------2JoinTable == EmployeePosition
//    @NotNull(message = "employeePositionName is Null in table EmployeeMaster")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = EmployeePosition.class)
    @JoinColumn(name = "employeePositionName", insertable = true)
    private EmployeePosition employeePosition;

    //----------------------------------------3JoinTable == EmployeeStatus
//    @NotNull(message = "employeeStatusName is Null in table EmployeeMaster")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = EmployeeStatus.class)
    @JoinColumn(name = "employeeStatusName", insertable = true)
    private EmployeeStatus employeeStatus;

    //----------------------------------------4JoinTable == EmployeeDepartment
//    @NotNull(message = "employeeDepartmentName is Null in table EmployeeMaster")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = EmployeeDepartment.class)
    @JoinColumn(name = "employeeDepartmentName", insertable = true)
    private EmployeeDepartment employeeDepartment;

    //----------------------------------------5JoinTable == Bank
//    @NotNull(message = "bankName is Null in table EmployeeMaster")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Bank.class)
    @JoinColumn(name = "bankName", insertable = true)
    private Bank bank;

    //----------------------------------------6JoinTable == IsActive
//    @NotNull(message = "empIsActiveID is Null in table EmployeeMaster")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = IsActive.class)
    @JoinColumn(name = "empIsActiveID", insertable = true)
    private IsActive isActive;
    //----------------------------------------7JoinTable == LeaveRole
//    @NotNull(message = "leaveRoleID is Null in table EmployeeMaster")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = LeaveRole.class)
    @JoinColumn(name = "leaveRoleID", insertable = true)
    private LeaveRole leaveRole;

    @ManyToMany    //8
    @JoinTable(
            name = "EmployeeMasterRoles",
            joinColumns = @JoinColumn(
                    name = "emp_id", referencedColumnName = "employeeMasterID"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "roleID"
            )
    )
    private Collection<Role> roles;*/
}
