/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Restaurante;

import java.util.List;

/**
 *
 * @author victo
 */
public class Factura {
    private List<Detalle_venta> detalles;
    private List<Platillos> platillos;

    public Factura(List<Detalle_venta> detalles, List<Platillos> platillos) {
        this.detalles = detalles;
        this.platillos = platillos;
    }

    public List<Detalle_venta> getDetalles() {
        return detalles;
    }

    public List<Platillos> getPlatillos() {
        return platillos;
    }
}
