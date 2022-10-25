package com.example.dogsandpuppies.dogsandpuppies.components;

import com.example.dogsandpuppies.dogsandpuppies.models.Dog;
import com.example.dogsandpuppies.dogsandpuppies.models.Person;
import com.example.dogsandpuppies.dogsandpuppies.models.Puppy;
import com.example.dogsandpuppies.dogsandpuppies.repositories.DogRepository;
import com.example.dogsandpuppies.dogsandpuppies.repositories.PersonRepository;
import com.example.dogsandpuppies.dogsandpuppies.repositories.PuppyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run every time EXCEPT Tests
//@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    DogRepository dogRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PuppyRepository puppyRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Person katie = new Person("Katie");
        personRepository.save(katie);
        Person mike = new Person("Mike");
        personRepository.save(mike);
        Person kirsty = new Person("Kirsty");
        personRepository.save(kirsty);
        Person dave = new Person("Dave");
        personRepository.save(dave);
        Person linda = new Person("Linda");
        personRepository.save(linda);

        Dog corgi = new Dog("Mochi", "Corgi", katie);
        dogRepository.save(corgi);
        Dog labrador = new Dog("Teddy", "Golden Labrador", katie);
        dogRepository.save(labrador);
        Dog husky = new Dog("Snowy", "Husky", dave);
        dogRepository.save(husky);
        Dog mongrel = new Dog("Wally", "Mongrel", kirsty);
        dogRepository.save(mongrel);
        Dog corgi2 = new Dog("Queenie", "Corgi", mike);
        dogRepository.save(corgi2);
        Dog daschund = new Dog("Dave", "Daschund", mike);
        dogRepository.save(daschund);
        Dog cavapoo = new Dog("Sheila", "Cavapoo", dave);
        dogRepository.save(cavapoo);
        Dog poodle = new Dog("Lady", "Poodle", kirsty);
        dogRepository.save(poodle);
        Dog dalmatian = new Dog("Luna", "Dalmatian", linda);
        dogRepository.save(dalmatian);

        Puppy puppy1 = new Puppy("Bruce", "white", 1, corgi);
        puppyRepository.save(puppy1);
        Puppy puppy2 = new Puppy("Princess", "white with brown patches", 1, corgi);
        puppyRepository.save(puppy2);
        Puppy puppy3 = new Puppy("Rex", "golden", 2, labrador);
        puppyRepository.save(puppy3);
        Puppy puppy4 = new Puppy("Steve", "golden", 12, labrador);
        puppyRepository.save(puppy4);
        Puppy puppy5 = new Puppy("Flo", "cream", 1, cavapoo);
        puppyRepository.save(puppy5);
        Puppy puppy6 = new Puppy("Lexi", "white with black spots", 12, dalmatian);
        puppyRepository.save(puppy6);
        Puppy puppy7 = new Puppy("Patch", "mixed", 3, mongrel);
        puppyRepository.save(puppy7);
        Puppy puppy8 = new Puppy("Fred", "black", 2, mongrel);
        puppyRepository.save(puppy8);





    }
}
