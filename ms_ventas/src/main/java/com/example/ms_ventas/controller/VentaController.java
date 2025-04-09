package com.example.ms_ventas.controller;

import com.example.ms_ventas.entity.Venta;
import com.example.ms_ventas.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("venta")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @RequestMapping
    public List<Venta> listar() {
        return ventaService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Venta> buscar(@PathVariable Long id) {
        return ventaService.buscar(id);
    }

    @PostMapping
    public Venta guardar(@RequestBody Venta venta) {
        return ventaService.guardar(venta);
    }

    @PutMapping("/{id}")
    public Venta actualizar(@PathVariable Long id, @RequestBody Venta venta) {
        return ventaService.actualizar(id, venta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ventaService.eliminar(id);
    }
}
