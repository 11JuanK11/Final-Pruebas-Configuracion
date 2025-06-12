package com.ejemplo.demo;

public class MalaPractica {
    public void metodoLargo() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Línea " + i);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Otra línea " + i);
        }
        // Repítelo varias veces para que Sonar detecte método muy largo
    }

    public void metodoDuplicado() {
        System.out.println("Código duplicado");
        System.out.println("Código duplicado");
        System.out.println("Código duplicado");
    }
}