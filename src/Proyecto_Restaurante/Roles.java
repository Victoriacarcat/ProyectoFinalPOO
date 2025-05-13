/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Restaurante;

/**
 *
 * @author victo
 */
public class Roles {
    private String id;
    private String nombre;

    public Roles(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre; // Lo que se verá en el JComboBox
    } 
}
