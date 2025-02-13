package com.example.W2Assignment2.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(nullable=false)
    String name;

    @Column(nullable = false)
    float price;

    @Column(length = 120)
    String description;

    @Column(nullable = false)
    int quantity;
}
