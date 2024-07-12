package com.revisi.toti.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "kelas")
public class Kelas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String kodeKelas;
    private int kelas;
    private String namaKelas;

    @OneToOne
    @JoinColumn(name = "kodeWali")
    private WaliKelas kodeWali;

    @ManyToOne
    @JoinColumn(name = "kodeJurusan")
    private Jurusan kodeJurusan;

}
