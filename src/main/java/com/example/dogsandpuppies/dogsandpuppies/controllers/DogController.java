package com.example.dogsandpuppies.dogsandpuppies.controllers;

import com.example.dogsandpuppies.dogsandpuppies.models.Dog;
import com.example.dogsandpuppies.dogsandpuppies.models.Person;
import com.example.dogsandpuppies.dogsandpuppies.repositories.DogRepository;
import com.example.dogsandpuppies.dogsandpuppies.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DogController {

    @Autowired
    DogRepository dogRepository;

    @GetMapping(value="/dogs")
    public ResponseEntity<List<Dog>> getAllDogs(){
        return new ResponseEntity<>(dogRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/dogs/{id}")
    public ResponseEntity getDog(@PathVariable Long id){
        return new ResponseEntity<>(dogRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/dogs")
    public ResponseEntity<Dog> postDog(@RequestBody Dog dog){
        return new ResponseEntity<>(dogRepository.save(dog), HttpStatus.CREATED);
    }
}
