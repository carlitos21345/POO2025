
package com.mycompany.herenciapoo;

public class CuentaCorriente extends Cuenta {
    double saldo;
    double interes;

    public CuentaCorriente(String titular, double saldo, double interes) {
        super(titular);
        this.saldo = saldo;
        this.interes = interes;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void tipoInteres() {
        double in = saldo * interes;
        System.out.println("Interes ganado: " + in);
    }
}
