package com.example.ms_ventas.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producto;
    private int cantidad;
    private double precioTotal;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecioTotal() { return precioTotal; }
    public void setPrecioTotal(double precioTotal) { this.precioTotal = precioTotal; }
}
