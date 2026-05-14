/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package com.example.holamundorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HolaController {

    @GetMapping("/api/hola")
    public Map<String, String> saludar() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "¡Hola Mundo desde Java!");
        respuesta.put("estado", "activo");
        return respuesta;
    }
}
*/
package com.example.holamundorest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1") // Versionamiento de API
public class HolaController {

    @GetMapping("/saludar")
    public ResponseEntity<ApiResponse> saludar(
            @RequestParam(value = "nombre", defaultValue = "Invitado") String nombre) {
        
        ApiResponse response = new ApiResponse(
            "Hola " + nombre + ", bienvenido a la API de Java",
            "1.0.0",
            System.currentTimeMillis(),
            true
        );

        return ResponseEntity.ok(response);
    }
}
