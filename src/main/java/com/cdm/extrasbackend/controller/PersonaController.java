package com.cdm.extrasbackend.controller;

import com.cdm.extrasbackend.model.Persona;
import com.cdm.extrasbackend.services.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/api/persona")
@CrossOrigin({"*"})
public class PersonaController {

    @Autowired
    public PersonaServiceAPI personaServiceAPI;

    @GetMapping(value = "/all")
    public List<Persona> getAll(){
        return personaServiceAPI.getAll();
    }

    @GetMapping(value =  "/find/{id}")
    public Persona find (@PathVariable String id){
        return personaServiceAPI.get(id);
    }

    @PostMapping (value = "/save")
    public ResponseEntity<Persona> save(@RequestBody Persona persona){
        Persona obj = personaServiceAPI.save(persona);
        return  new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Persona> delete(@RequestBody String id){
        Persona persona = personaServiceAPI.get(id);
        if(persona != null){
            personaServiceAPI.delete(id);
        }else{
            return new ResponseEntity<>(persona, HttpStatus.INTERNAL_SERVER_ERROR );
        }
        return new ResponseEntity<>(persona, HttpStatus.OK );
    }


}
