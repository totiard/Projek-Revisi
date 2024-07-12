package com.revisi.toti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;

import com.revisi.toti.model.WaliKelas;
import com.revisi.toti.service.WaliKelasService;

@RestController
@RequestMapping("/api/walikelas")
public class WaliKelasController {

    @Autowired
    private WaliKelasService waliKelasService;

    public WaliKelas create(@RequestBody WaliKelas waliKelas){
        return waliKelasService.save(waliKelas);
    }

    @PutMapping
    public WaliKelas update(@RequestBody WaliKelas waliKelas){
        return waliKelasService.save(waliKelas);
    }
    
    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Integer id){
        waliKelasService.removeOne(id);
    }

    // @GetMapping
    // public Iterable<WaliKelas> findAll(){
    //     return waliKelasService.findAll();
    // }

}
