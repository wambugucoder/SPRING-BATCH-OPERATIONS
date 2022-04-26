package com.example.batchprocessing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Customer {
    @Id
    private int id;

    private String firstname;
    private String lastname;
    private String email;
    private String gender;
    private String contactno;
    private String country;
    private Date dob;

}

