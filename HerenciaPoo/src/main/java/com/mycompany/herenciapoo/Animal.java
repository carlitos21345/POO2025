package com.mycompany.herenciapoo;

public class Animal {
    String tipo;
    double edad;

    public Animal(String tipo, double edad) {
        this.tipo = tipo;
        this.edad = edad;
    }

    public void describir() {
        System.out.println("Tipo: " + tipo);
        if (edad < 3.0) {
            System.out.println("Es un cachorro");
        } else if (edad >= 3.1) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Edad en transición (ni cachorro ni adulto claramente)");
        }
    }

    public boolean esCachorro() {
        return edad < 3.0;
    }
}
