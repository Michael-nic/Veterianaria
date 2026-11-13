package com.veterinaria.petcare.repository;

import com.veterinaria.petcare.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
