/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author USUARIO
 */

@Entity
@Table(name = "category")

public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Quadbike> quadbikes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Quadbike> getQuadbikes() {
        return quadbikes;
    }

    public void setQuadbikes(List<Quadbike> quadbikes) {
        this.quadbikes = quadbikes;
    }

    
    
    
    
}
