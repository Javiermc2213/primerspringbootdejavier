package com.example.springbootapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @GetMapping("/api")
    public String getAPIInfo() {
        return "API REST es una arquitectura que permite la comunicación entre sistemas utilizando HTTP.";
    }
@GetMapping("/api/verbos")
public String getVerbos() {
    return "Los verbos en una API REST incluyen GET, POST, PUT, DELETE.";
}

@PostMapping("/api/crear")
public String crearRecurso() {
    return "Ejemplo de POST: Crear un nuevo recurso.";
}

@PutMapping("/api/actualizar")
public String actualizarRecurso() {
    return "Ejemplo de PUT: Actualizar un recurso existente.";
}
}

