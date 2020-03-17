package com.cdm.extrasbackend.api;

import com.cdm.extrasbackend.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository <Registro, Long> {
}
