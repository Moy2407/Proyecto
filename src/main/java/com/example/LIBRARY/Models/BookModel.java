package com.example.LIBRARY.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Books")
//Nombre, autor(es), Genero, Editorial, correo
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private long request;
    private String name;
    private String author;
    private String category;
    private String editorial;
    private String email;

    public long getRequest() {
        return request;
    }

    public void setRequest(long request) {
        this.request = request;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
