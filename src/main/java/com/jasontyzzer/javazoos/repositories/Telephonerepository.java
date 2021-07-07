package com.jasontyzzer.javazoos.repositories;

import com.jasontyzzer.javazoos.models.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Telephonerepository extends JpaRepository<Telephone, Long> {
}