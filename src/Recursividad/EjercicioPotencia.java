package Recursividad;

import java.util.Scanner;

public class EjercicioPotencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();

        Potencia potencia = new Potencia(base, exponente);
        long resultado = potencia.calcular();

        System.out.println("El resultado es: " + resultado);

        sc.close();
    }
}

class Potencia {

    private int base;
    private int exponente;

    public Potencia(int base, int exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    public long calcular() {
        return calcularRecursivo(base, exponente);
    }

    private long calcularRecursivo(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * calcularRecursivo(base, exponente - 1);
    }
}