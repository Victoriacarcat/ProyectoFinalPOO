/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Restaurante;

/**
 *
 * @author victo
 */
public class Detalle_venta {
    private String id_detalle;
    private int cantidad;
    private String id_platillo;
    private String id_venta;

    public Detalle_venta(String id_detalle, int cantidad, String id_platillo, String id_venta) {
        this.id_detalle = id_detalle;
        this.cantidad = cantidad;
        this.id_platillo = id_platillo;
        this.id_venta = id_venta;
    }

    public String getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(String id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getId_platillo() {
        return id_platillo;
    }

    public void setId_platillo(String id_platillo) {
        this.id_platillo = id_platillo;
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }
    
}
