package com.cdm.extrasbackend.services;

import com.cdm.extrasbackend.api.ProyectoRepository;
import com.cdm.extrasbackend.model.Proyecto;
import com.cdm.extrasbackend.utils.commons.GenericServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl extends GenericServiceImpl <Proyecto, String> implements ProyectoServiceAPI {

    private ProyectoRepository proyectoRepository;

    @Override
    public CrudRepository<Proyecto, String> getDAO() {
        return proyectoRepository;
    }
}
