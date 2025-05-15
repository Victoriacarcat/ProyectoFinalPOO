/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Restaurante;

public class Platillos {
    private String id_platillo;
    private String nombre;
    private double precio;
    private String id_categoria;

    public Platillos(String id_platillo, String nombre, double precio, String id_categoria) {
        this.id_platillo = id_platillo;
        this.nombre = nombre;
        this.precio = precio;
        this.id_categoria = id_categoria;
    }

    public String getId_platillo() {
        return id_platillo;
    }

    public void setId_platillo(String id_platillo) {
        this.id_platillo = id_platillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    public String toString() {
        return nombre; // Lo que se verá en el JComboBox
    } 
}
