package com.revisi.toti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.revisi.toti.model.Siswa;
import com.revisi.toti.service.SiswaService;

@RestController
@RequestMapping("/api/siswa")
public class SiswaController {

    @Autowired
    private SiswaService siswaService;

    @PostMapping
    public Siswa create(@RequestBody Siswa siswa){
        return siswaService.save(siswa);
    }

    @GetMapping
    public Iterable<Siswa> findAll(){
        return siswaService.findAll();
    }

    @GetMapping("/{id}")
    public Siswa findOne(@PathVariable("id") Integer id){
        return siswaService.findOne(id);
    }

    @PutMapping
    public Siswa update(@RequestBody Siswa siswa){
        return siswaService.save(siswa);
    }
    
    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Integer id){
        siswaService.removeOne(id);
    }

}
