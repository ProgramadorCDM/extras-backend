package com.cdm.extrasbackend.services;

import com.cdm.extrasbackend.api.RegistroRepository;
import com.cdm.extrasbackend.model.Registro;
import com.cdm.extrasbackend.utils.commons.GenericServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistroServiceImpl extends GenericServiceImpl <Registro, Long> implements  RegistroServiceAPI {

    private RegistroRepository registroRepository;


    @Override
    public CrudRepository<Registro, Long> getDAO() {
        return registroRepository;
    }
}
