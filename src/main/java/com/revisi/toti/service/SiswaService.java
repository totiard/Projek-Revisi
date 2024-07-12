package com.revisi.toti.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revisi.toti.model.Siswa;
import com.revisi.toti.repository.SiswaRepository;

@Service
public class SiswaService {

    @Autowired
    private SiswaRepository siswaRepository;

    // Untuk tambah dan ubah siswa
    public Siswa save(Siswa siswa){
        return siswaRepository.save(siswa);
    }

    // Untuk cari siswa
    public Siswa findOne(Integer id){
        Optional<Siswa> siswa = siswaRepository.findById(id);
        if (!siswa.isPresent()) {
            return null;
        }
        return siswa.get();
    }

    // Untuk lihat siswa
    public Iterable<Siswa> findAll(){
        return siswaRepository.findAll();
    }

    // Untuk hapus siswa
    public void removeOne(Integer id){
        siswaRepository.deleteById(id);
    }

}
