package com.cdm.extrasbackend.controller;

import com.cdm.extrasbackend.model.Registro;
import com.cdm.extrasbackend.services.RegistroServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/api/registro")
@CrossOrigin({"*"})
public class RegistroController {

    @Autowired
    public RegistroServiceAPI registroServiceAPI;

    @GetMapping(value = "/all")
    public List<Registro> getAll(){
        return registroServiceAPI.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Registro find (@PathVariable Long id){
        return registroServiceAPI.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Registro> save (@RequestBody Registro registro){
        Registro obj = registroServiceAPI.save(registro);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping (value = "/delete/{id}")
    public ResponseEntity<Registro> delete (@PathVariable Long id){
        Registro registro = registroServiceAPI.get(id);
        if(registro != null){
            registroServiceAPI.delete(id);
        }else {
            return new ResponseEntity<>(registro, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(registro, HttpStatus.OK);
    }

}
