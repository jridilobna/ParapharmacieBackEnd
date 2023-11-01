package com.bezkoder.springjwt.models;

import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name ;
    private String url ;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}
