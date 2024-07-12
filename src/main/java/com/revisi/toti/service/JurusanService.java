package com.revisi.toti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revisi.toti.model.Jurusan;
import com.revisi.toti.repository.JurusanRepository;

@Service
public class JurusanService {

    @Autowired
    private JurusanRepository jurusanRepository;

    // Untuk tambah dan ubah jurusan
    public Jurusan save(Jurusan jurusan){
        return jurusanRepository.save(jurusan);
    }

    // Untuk hapus jurusan
    public void removeOne(Integer id){
        jurusanRepository.deleteById(id);
    }
}
