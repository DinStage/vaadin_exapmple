package com.example.application.data.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity(name = "Contacts")
@Getter
@Setter
@EqualsAndHashCode
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String secondName;
    private String fatherName;
    private String numberPhone;
    private String email;
}