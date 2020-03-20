package com.cdm.extrasbackend.controller;

import com.cdm.extrasbackend.model.Registro;
import com.cdm.extrasbackend.services.RegistroServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/registro")
public class RegistroRestController {

    @Autowired
    private RegistroServiceAPI registroServiceAPI;

    @GetMapping("/all")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Registro> getAll(){
        return registroServiceAPI.getAll();
    }

    @GetMapping("/find/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Registro find (@PathVariable Long id){
        return registroServiceAPI.get(id);
    }

    @PostMapping("/save")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<Registro> save (@RequestBody Registro registro){
        Registro obj = registroServiceAPI.save(registro);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity <Registro> delete (@PathVariable Long id){
        Registro registro = registroServiceAPI.get(id);
        if (registro != null){
            registroServiceAPI.delete(id);
        }else {return  new ResponseEntity<>(registro, HttpStatus.INTERNAL_SERVER_ERROR);}
        return new ResponseEntity<>(registro, HttpStatus.OK);
    }
}
