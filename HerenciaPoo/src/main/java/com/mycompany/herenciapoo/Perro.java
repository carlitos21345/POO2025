package com.mycompany.herenciapoo;

public class Perro extends Animal {
    String raza;

    public Perro(String tipo, String raza, double edad) {
        super(tipo, edad);
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("Guau guau Soy un: " + raza);
    }

    public void mostrarVacunas() {
        if (esCachorro()) {
            System.out.println("Necesita 4 vacunas");
        } else {
            System.out.println("Necesita 7 vacunas");
        }
    }
}
