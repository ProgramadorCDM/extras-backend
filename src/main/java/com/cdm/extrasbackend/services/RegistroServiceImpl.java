package com.cdm.extrasbackend.services;

import com.cdm.extrasbackend.api.RegistroDaoAPI;
import com.cdm.extrasbackend.model.Registro;
import com.cdm.extrasbackend.utils.commons.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge Mina
 * @version 06/05/2020/A
 *
 * The type Registro service.
 */
@Service
public class RegistroServiceImpl  extends GenericServiceImpl <Registro, Long> implements RegistroServiceAPI {

    @Autowired
    RegistroDaoAPI registroDaoAPI;

    @Override
    public CrudRepository<Registro, Long> getDAO() {
        return registroDaoAPI;
    }
}
