/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Restaurante;

/**
 *
 * @author victo
 */
public class Mesa {
    private String id_mesa;
    private int capacidad;     
    private String id_status;

    public Mesa(String id_mesa, int capacidad, String id_status) {
        this.id_mesa = id_mesa;
        this.capacidad = capacidad;
        this.id_status = id_status;
    }

    public String getId_mesa() {
        return id_mesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getId_status() {
        return id_status;
    }

    @Override
    public String toString() {
        return "Mesa #"+id_mesa;  
    }
}
