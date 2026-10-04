package Recursividad;

import java.util.Scanner;

public class EjercicioCociente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        Cociente cociente = new Cociente(dividendo, divisor);
        int resultado = cociente.calcular();

        System.out.println("El cociente es: " + resultado);

        sc.close();
    }
}

class Cociente {

    private int dividendo;
    private int divisor;

    public Cociente(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int calcular() {
        return calcularRecursivo(dividendo, divisor);
    }

    private int calcularRecursivo(int a, int b) {
        if (a < b) {
            return 0;
        }
        return 1 + calcularRecursivo(a - b, b);
    }
}