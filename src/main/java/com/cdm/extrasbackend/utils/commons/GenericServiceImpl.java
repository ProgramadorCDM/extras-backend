package com.cdm.extrasbackend.utils.commons;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jorge Mina , Jordy Rodríguez
 * @version 06/05/2020/A
 *
 * Clase abstracta Generic service.
 * Clase diseñada para implemente la interface GenericServiceAPI de
 * modo que todas las clases que hereden de esta implementan la
 * interface
 *
 * @param <T>  the type parameter
 * @param <ID> the type parameter
 */
@Service
public abstract class GenericServiceImpl <T, ID extends Serializable> implements GenericServiceAPI<T, ID> {

    @Override
    public T save(T entity) {
        return getDAO().save(entity);
    }

    @Override
    public void delete(ID id) {
        getDAO().deleteById(id);
    }

    @Override
    public T get(ID id) {
        Optional<T> optUser = getDAO().findById(id); // returns un optional de java8.
        // handle not found, return null or throw, pero enviamos un null en lugar del error
        return optUser.orElse(null);
    }

    @Override
    public List<T> getAll() {
        List<T> returnList = new ArrayList<>();
        getDAO ().findAll().forEach(returnList::add);
        return returnList;
    }

    public abstract CrudRepository <T, ID> getDAO();
}