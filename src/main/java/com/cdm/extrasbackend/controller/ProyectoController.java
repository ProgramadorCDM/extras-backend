package com.cdm.extrasbackend.controller;

import com.cdm.extrasbackend.model.Proyecto;
import com.cdm.extrasbackend.services.ProyectoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/Proyecto")
@CrossOrigin ({"*"})
public class ProyectoController {

    @Autowired
    ProyectoServiceAPI proyectoServiceAPI;

    @GetMapping(value = "/all")
    public List<Proyecto> getAll(){
        return proyectoServiceAPI.getAll();
    }

    @GetMapping (value = "/find/{id}")
    public Proyecto find (@PathVariable String id){
        return proyectoServiceAPI.get(id);
    }

    @PostMapping (value = "/save")
    public ResponseEntity<Proyecto> save (@RequestBody Proyecto proyecto) {
        Proyecto obj = proyectoServiceAPI.save(proyecto);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Proyecto> delete(@PathVariable String id){
        Proyecto proyecto = proyectoServiceAPI.get(id);
        if(proyecto != null){
            proyectoServiceAPI.delete(id);
        }else{
            return new ResponseEntity<>(proyecto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }

}
