package com.revisi.toti.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "siswa")
public class Siswa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nis;
    private int idTahunAjar;
    private String password;
    private int status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tanggalLahir;
    private String alamat;
    private String jenisKelamin;
    private String agama;

    @ManyToOne
    @JoinColumn(name = "idKelas")
    private Kelas idKelas;

}
