package com.veterinaria.petcare.repository;

import com.veterinaria.petcare.entity.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DuenoRepository extends JpaRepository<Dueno, Long> {
}
