package com.mycompany.herenciapoo;

import java.util.Scanner;

public class HerenciaPoo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Perro p = new Perro("Mamifero", "Labrador", 2.5);
        p.describir();
        p.ladrar();
        p.mostrarVacunas();
    }
}*/
        CuentaAhorros cuentaAhorrativa = new CuentaAhorros("Carlitos", 8900, 0.05);
        CuentaCorriente cuentaCorre = new CuentaCorriente("Vanessita", 4500, 0.07);

        System.out.println("Tipo de cuenta");
        System.out.println("Ahorros[1]----Corriente[2]: ");

        int tipoCuenta = input.nextInt();

        switch (tipoCuenta) {
            case 1:
                cuentaAhorrativa.mostrarTitular();
                cuentaAhorrativa.mostrarSaldo();
                cuentaAhorrativa.tipoInteres();
                break;
            case 2:
                cuentaCorre.mostrarTitular();
                cuentaCorre.mostrarSaldo();
                cuentaCorre.tipoInteres();
                break;
            default:
                System.out.println("Error");
        }

    }
}
    
