package com.revisi.toti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.revisi.toti.model.Kelas;
import com.revisi.toti.service.KelasService;

@RestController
@RequestMapping("/api/kelas")
public class KelasController {

    @Autowired
    private KelasService kelasService;

    public Kelas create(@RequestBody Kelas kelas){
        return kelasService.save(kelas);
    }

    @PutMapping
    public Kelas update(@RequestBody Kelas kelas){
        return kelasService.save(kelas);
    }
    
    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Integer id){
        kelasService.removeOne(id);
    }

}
