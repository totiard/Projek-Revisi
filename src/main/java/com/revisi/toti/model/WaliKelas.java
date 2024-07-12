package com.revisi.toti.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "wali_kelas")
public class WaliKelas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String kodeWali;
    private String namaWali;

}
