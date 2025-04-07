package com.example.ms_ventas.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @GetMapping("/test")
    public String testService() {
        return "El servicio de ventas está funcionando!";
    }
}
