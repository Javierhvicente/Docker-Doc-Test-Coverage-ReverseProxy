package org.example.models;

/**
 * Clase calculadora con métodos de calculo básicos
 */
public class Calculadora {
    /**
     * Función que suma dos números enteros pasados por parámetros
     * @param a número entero
     * @param b número entero
     * @return la suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Función que resta dos números enteros pasados por parámetros
     * @param a número entero
     * @param b número entero
     * @return la resta de a y b
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Función que multiplica dos números enteros
     * @param a número entero
     * @param b número entero
     * @return la multiplicación de a por b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Función que divide dos números enteros
     * @param a número entero
     * @param b número entero
     * @return la división de a entre b
     **/
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }

}
