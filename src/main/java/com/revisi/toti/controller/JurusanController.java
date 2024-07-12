package com.revisi.toti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.revisi.toti.model.Jurusan;
import com.revisi.toti.service.JurusanService;

@RestController
@RequestMapping("/api/jurusan")
public class JurusanController {

    @Autowired
    private JurusanService jurusanService;

    public Jurusan create(@RequestBody Jurusan jurusan){
        return jurusanService.save(jurusan);
    }

    @PutMapping
    public Jurusan update(@RequestBody Jurusan jurusan){
        return jurusanService.save(jurusan);
    }
    
    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Integer id){
        jurusanService.removeOne(id);
    }

}
