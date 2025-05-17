/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Restaurante;

/**
 *
 * @author victo
 */
public class CalcularIVA extends Calcular {//Herencia
    @Override
    public double calcularValor(double subtotal) {
        return subtotal * 0.19; // 19% 
    }
}
