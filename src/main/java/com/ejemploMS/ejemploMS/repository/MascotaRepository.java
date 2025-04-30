package com.ejemploMS.ejemploMS.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejemploMS.ejemploMS.model.Mascota;

@Repository
public class MascotaRepository {
    List<Mascota> mascotas = new ArrayList<>();
}
