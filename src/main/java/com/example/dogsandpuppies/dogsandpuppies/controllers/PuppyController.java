package com.example.dogsandpuppies.dogsandpuppies.controllers;

import com.example.dogsandpuppies.dogsandpuppies.models.Person;
import com.example.dogsandpuppies.dogsandpuppies.models.Puppy;
import com.example.dogsandpuppies.dogsandpuppies.repositories.PersonRepository;
import com.example.dogsandpuppies.dogsandpuppies.repositories.PuppyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PuppyController {

    @Autowired
    PuppyRepository puppyRepository;

    @GetMapping(value="/puppies")
    public ResponseEntity<List<Puppy>> getAllPuppies(){
        return new ResponseEntity<>(puppyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/puppies/{id}")
    public ResponseEntity getPuppy(@PathVariable Long id){
        return new ResponseEntity<>(puppyRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/puppies")
    public ResponseEntity<Puppy> postPuppy(@RequestBody Puppy puppy){
        return new ResponseEntity<>(puppyRepository.save(puppy), HttpStatus.CREATED);
    }
}
