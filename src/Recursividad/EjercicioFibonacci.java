package Recursividad;

import java.util.Scanner;

public class EjercicioFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el limite de la serie: ");
        int n = sc.nextInt();

        Fibonacci fibonacci = new Fibonacci(n);

        System.out.println("La serie de Fibonacci hasta " + n + " es:");
        fibonacci.imprimirSerie();

        sc.close();
    }
}

class Fibonacci {

    private int limite;

    public Fibonacci(int limite) {
        this.limite = limite;
    }

    public void imprimirSerie() {
        for (int i = 0; i <= limite; i++) {
            System.out.print(calcular(i) + " ");
        }
        System.out.println();
    }

    private int calcular(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calcular(n - 1) + calcular(n - 2);
    }
}