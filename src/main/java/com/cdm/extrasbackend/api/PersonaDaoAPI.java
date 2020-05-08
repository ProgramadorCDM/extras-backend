package com.cdm.extrasbackend.api;

import com.cdm.extrasbackend.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDaoAPI extends CrudRepository <Persona, String> {
}
