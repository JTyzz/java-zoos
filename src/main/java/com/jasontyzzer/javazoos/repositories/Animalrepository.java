package com.jasontyzzer.javazoos.repositories;

import com.jasontyzzer.javazoos.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Animalrepository extends JpaRepository<Animal, Long>
{
    Animal findByAnimalTypeEqualsIgnoreCase(String name);
}