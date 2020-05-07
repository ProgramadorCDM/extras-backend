package com.cdm.extrasbackend.api;

import com.cdm.extrasbackend.model.Registro;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Registro dao api.
 */
public interface RegistroDaoAPI extends CrudRepository <Registro, Long> {
}
