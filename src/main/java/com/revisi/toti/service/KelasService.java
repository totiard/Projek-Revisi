package com.revisi.toti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revisi.toti.model.Kelas;
import com.revisi.toti.repository.KelasRepository;

@Service
public class KelasService {

    @Autowired
    private KelasRepository kelasRepository;

    // Untuk tambah dan ubah kelas
    public Kelas save(Kelas kelas){
        return kelasRepository.save(kelas);
    }

    // Untuk hapus kelas
    public void removeOne(Integer id){
        kelasRepository.deleteById(id);
    }
}
