package com.uj.IT28X87.Honours.DO4.EMS.employeeservice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employees")
public class Employee {

    @Id
    @Column(name="employee_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="first_name", nullable = false)
    private String first_name;
    @Column(name ="last_name", nullable = false)
    private String last_name;
    @Column(name ="email")
    private String email;

    //TODO normalize to address entity
    @Column(name ="address")
    private String address;

    //TODO normalize to contact entity
    @Column(name ="contact_mumber")
    private String contact_mumber;

    //TODO normalize to work entity
    @Column(name ="department")
    private String department;
    @Column(name ="position")
    private String position;

    //TODO normalize to user_account entity
    @Column(name ="username")
    private String username;
    @Column(name ="password")
    private String password;



}
