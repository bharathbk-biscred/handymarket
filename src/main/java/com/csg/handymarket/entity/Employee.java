package com.csg.handymarket.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname ;
    private String lastname;
    private String date_of_birth;
    private double salary;
    private String isd_code ;
    private String mobile_contact;
    private String email;
    private String gender;
    @OneToMany(targetEntity = Brand.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "E_id",referencedColumnName = "id")
    private List<Brand> brand_id;


    public Employee(String firstname, String lastname, String date_of_birth, double salary, String isd_code, String mobile_contact, String email, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.date_of_birth = date_of_birth;
        this.salary = salary;
        this.isd_code = isd_code;
        this.mobile_contact = mobile_contact;
        this.email = email;
        this.gender = gender;
    }


}
