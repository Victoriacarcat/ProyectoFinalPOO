/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Restaurante;

/**
 *
 * @author victo
 */
public class CalcularDescuento extends Calcular {//Herencia
    @Override
    public double calcularValor(double subtotal) {
        if (subtotal > 50000) {
            return subtotal * 0.10; // 10% de descuento
        }
        return 0;
    }
}
