package com.example.dogsandpuppies.dogsandpuppies.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="puppies")
public class Puppy {

    @Column(name="name")
    private String name;

    @Column(name="colour")
    private String colour;

    @Column(name="weight")
    private int weight;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "dog_id", nullable = true)
    @JsonIgnoreProperties({"puppies"})
    private Dog dog;

    public Puppy(String name, String colour, int weight, Dog dog) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.dog = dog;
    }

    public Puppy(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
