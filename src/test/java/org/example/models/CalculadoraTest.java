package org.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void restar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    void multiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    void dividir() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(6, 3);
        assertEquals(2.0, resultado);
    }
}