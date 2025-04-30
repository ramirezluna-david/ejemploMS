package com.ejemploMS.ejemploMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mascotas")
public class MascotaController {
    @GetMapping
    public String algo() {
        return "ahora sí";
    }
}
