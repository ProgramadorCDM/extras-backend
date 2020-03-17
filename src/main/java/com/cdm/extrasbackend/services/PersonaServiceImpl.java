package com.cdm.extrasbackend.services;

import com.cdm.extrasbackend.api.PersonaRepository;
import com.cdm.extrasbackend.model.Persona;
import com.cdm.extrasbackend.utils.commons.GenericServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl <Persona, String> implements PersonaServiceAPI {

    PersonaRepository personaRepository;

    @Override
    public CrudRepository<Persona, String> getDAO() {
        return personaRepository;
    }
}
