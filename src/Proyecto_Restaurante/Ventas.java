/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Restaurante;

import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class Ventas {
    private String id_venta;
    private String fecha_hora;
    private String id_mesa;
    private ArrayList<Detalle_venta> detalles;

    public Ventas(String id_venta, String fecha_hora, String id_mesa) {
        this.id_venta = id_venta;
        this.fecha_hora = fecha_hora;
        this.id_mesa = id_mesa;
        this.detalles = new ArrayList<>();
    }
    public void agregarDetalle(Detalle_venta detalle) {
        detalles.add(detalle);
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(String id_mesa) {
        this.id_mesa = id_mesa;
    }

    public ArrayList<Detalle_venta> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<Detalle_venta> detalles) {
        this.detalles = detalles;
    }
    
}
