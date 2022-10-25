package com.example.dogsandpuppies.dogsandpuppies.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="dogs")
public class Dog {

    @Column(name="name")
    public String name;

    @Column(name="breed")
    public String breed;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = true)
    @JsonIgnoreProperties({"dogs"})
    private Person person;

    @JsonIgnoreProperties({"dog"})
    @OneToMany(mappedBy = "dog")
    private List<Puppy> puppies;

    public Dog(String name, String breed, Person person) {
        this.name = name;
        this.breed = breed;
        this.person = person;
        this.puppies = new ArrayList<>();
    }

    public Dog(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Puppy> getPuppies() {
        return puppies;
    }

    public void setPuppies(List<Puppy> puppies) {
        this.puppies = puppies;
    }
}
