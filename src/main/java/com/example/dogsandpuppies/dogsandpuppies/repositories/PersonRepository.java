package com.example.dogsandpuppies.dogsandpuppies.repositories;

import com.example.dogsandpuppies.dogsandpuppies.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
