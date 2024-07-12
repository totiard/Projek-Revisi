package com.revisi.toti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revisi.toti.model.WaliKelas;
import com.revisi.toti.repository.WaliKelasRepository;

@Service
public class WaliKelasService {

    @Autowired
    private WaliKelasRepository waliKelasRepository;

    // Untuk tambah dan hapus wali kelas
    public WaliKelas save(WaliKelas waliKelas){
        return waliKelasRepository.save(waliKelas);
    }

    // Untuk hapus kelas
    public void removeOne(Integer id){
        waliKelasRepository.deleteById(id);
    }

    // // Untuk lihat wali kelas
    // public Iterable<WaliKelas> findAll(){
    //     return waliKelasRepository.findAll();
    // }

}
