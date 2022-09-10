package com.taller.taller.repositories;

import com.taller.taller.model.ModoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModoPagoRepository extends JpaRepository<ModoPago, String> {
}
