/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Estudiante
 */
public class OperacionInvalida extends Exception {
    private final int operacion;

    public OperacionInvalida(int operacion) {
        super("Operación "+ operacion +" es Inválida: Use +, -, * . /");
        this.operacion = operacion;
    }

    public int getOperacion() {
        return operacion;
    }    
}
