package com.example.ms_ventas.service;


import com.example.ms_ventas.entity.Venta;
import com.example.ms_ventas.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    public Optional<Venta> buscar(Long id) {
        return ventaRepository.findById(id);
    }

    public Venta guardar(Venta venta) {
        return ventaRepository.save(venta);
    }

    public Venta actualizar(Long id, Venta venta) {
        venta.setId(id);
        return ventaRepository.save(venta);
    }

    public void eliminar(Long id) {
        ventaRepository.deleteById(id);
    }
}
