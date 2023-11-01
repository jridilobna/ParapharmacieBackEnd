package com.bezkoder.springjwt.models;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}