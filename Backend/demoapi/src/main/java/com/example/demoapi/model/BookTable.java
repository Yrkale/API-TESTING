package com.example.demoapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity   
public class BookTable {

    @Id   
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;

    private String title;
    private String author;
    private Double price;

    //  Default constructor required by JPA
    public BookTable() {}

    //  Optional all-args constructor (useful for manual creation)
    public BookTable(Long id, String title, String author, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters (needed for JSON <-> Java and JPA)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
