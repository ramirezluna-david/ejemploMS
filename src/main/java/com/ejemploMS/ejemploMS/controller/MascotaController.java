package com.ejemploMS.ejemploMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploMS.ejemploMS.model.Mascota;
import com.ejemploMS.ejemploMS.service.MascotaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/mascotas")
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @GetMapping
    public String algo() {
        return "ahora sí";
    }

    @PostMapping
    public Mascota postMascota(@RequestBody Mascota mascota) {
        return mascotaService.guardarMascota(mascota);
    }
}
