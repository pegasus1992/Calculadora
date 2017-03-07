package com.edu.eci.cosw.calculadora.model;

/**
 * Created by Julian Gonzalez Prieto (Avuuna la Luz del Alba) on 11/2/16.
 */
public class Calculator {

    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double substraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }

    public double sin(double num) {
        return Math.sin(num);
    }

    public double cos(double num) {
        return Math.cos(num);
    }

    public double tan(double num) {
        return Math.tan(num);
    }
}
