package com.cdm.extrasbackend.controller;

import com.cdm.extrasbackend.model.Proyecto;
import com.cdm.extrasbackend.services.ProyectoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Proyecto rest controller.
 */
@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/proyecto")
public class ProyectoRestController {

    @Autowired
    private ProyectoServiceAPI proyectoServiceAPI;

    /**
     * Get all list.
     *
     * @return the list
     */
    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Proyecto> getAll(){
        return proyectoServiceAPI.getAll();
    }

    /**
     * Find proyecto.
     *
     * @param id the id
     * @return the proyecto
     */
    @GetMapping("/find/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Proyecto find(@PathVariable String id){
        return proyectoServiceAPI.get(id);
    }

    /**
     * Save response entity.
     *
     * @param proyecto the proyecto
     * @return the response entity
     */
    @PostMapping("/save")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Proyecto> save (@RequestBody Proyecto proyecto){
        Proyecto obj = proyectoServiceAPI.save(proyecto);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    /**
     * Delete response entity .
     *
     * @param id the id
     * @return the response entity
     */
    @GetMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity <Proyecto> delete (@PathVariable String id){
        Proyecto proyecto = proyectoServiceAPI.get(id);
        if (proyecto != null){
            proyectoServiceAPI.delete(id);
        }else {return  new ResponseEntity<>(proyecto, HttpStatus.INTERNAL_SERVER_ERROR);}
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }

}
