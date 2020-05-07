package com.cdm.extrasbackend.utils.commons;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Jorge Mina , Jordy Rodríguez
 * @version 06/05/2020/A
 *
 * Interface Generic service api.
 * Diseñada para omitir código genérico y repetitivo en el aplicación
 *
 *
 * @param <T>  Representa las diferentes entidades identificadas o
 *           clases propiamente dichas
 * @param <ID> Representa al tipo de datos de la llave primaria en
 *            en las
 */
public interface GenericServiceAPI <T, ID extends Serializable> {

    /**
     * Save t.
     * Método para guarda la Entidad recibida
     *
     * @param entity de entity
     * @return t
     */
    T save(T entity);

    /**
     * Delete.
     * Elemento para borrar una entidad según su id, el tipo de dato
     * viene dado por ID
     *
     * @param id de id
     */
    void delete(ID id);

    /**
     * Get t.
     * Método que retorna  una entidad según su id de tipo ID
     *
     * @param id de ID
     * @return  t
     */
    T get(ID id);

    /**
     * Gets all.
     * Método para obtener todos los valores de tipo T y guardados en
     * variable de tipo List
     *
     * @return all
     */
    List<T> getAll();

    /**
     * Gets dao.
     * Método para obtener el DAO u objeto de acceso de datos de la
     * entidad
     *
     * @return el dao
     */
    CrudRepository<T, ID> getDAO();
}
