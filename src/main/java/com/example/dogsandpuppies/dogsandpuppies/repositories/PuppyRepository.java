package com.example.dogsandpuppies.dogsandpuppies.repositories;
import com.example.dogsandpuppies.dogsandpuppies.models.Puppy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuppyRepository extends JpaRepository<Puppy, Long> {
}
