package com.cdm.extrasbackend.services;

import com.cdm.extrasbackend.api.PersonaDaoAPI;
import com.cdm.extrasbackend.model.Persona;
import com.cdm.extrasbackend.utils.commons.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge Mina
 * @version 06/05/2020/A
 *
 * Clase de tipo Persona Service Impl
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl <Persona, String> implements PersonaServiceAPI {

    @Autowired
    private PersonaDaoAPI personaDaoAPI;

    @Override
    public CrudRepository<Persona, String> getDAO() {
        return personaDaoAPI;
    }
}
