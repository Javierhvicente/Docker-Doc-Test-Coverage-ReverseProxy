package org.example;

import org.example.models.Calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculadora calculator = new Calculadora();
        System.out.println(calculator.sumar(5, 3));
    }
}