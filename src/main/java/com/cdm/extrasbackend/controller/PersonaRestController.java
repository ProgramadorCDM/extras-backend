package com.cdm.extrasbackend.controller;

import com.cdm.extrasbackend.model.Persona;
import com.cdm.extrasbackend.services.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Persona rest controller.
 */
@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/persona")
public class PersonaRestController {

    @Autowired
    private PersonaServiceAPI personaServiceAPI;

    /**
     * Get all list.
     *
     * @return the list
     */
    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Persona> getAll(){
        return personaServiceAPI.getAll();
    }

    /**
     * Find persona.
     *
     * @param id the id
     * @return the persona
     */
    @GetMapping("/find/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Persona find(@PathVariable String id){
        return personaServiceAPI.get(id);
    }

    /**
     * Save response entity.
     *
     * @param persona the persona
     * @return the response entity
     */
    @PostMapping("/save")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Persona> save (@RequestBody Persona persona){
        Persona obj = personaServiceAPI.save(persona);
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
    public ResponseEntity <Persona> delete (@PathVariable String id){
        Persona persona = personaServiceAPI.get(id);
        if (persona != null){
            personaServiceAPI.delete(id);
        }else {return  new ResponseEntity<>(persona, HttpStatus.INTERNAL_SERVER_ERROR);}
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

}
