package com.revisi.toti.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "jurusan")
public class Jurusan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String kodeJurusan;
    private String namaJurusan;
    private String kodeKelas;

}
