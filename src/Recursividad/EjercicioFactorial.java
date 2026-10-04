package Recursividad;

import java.util.Scanner;

public class EjercicioFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        Factorial factorial = new Factorial(n);
        long resultado = factorial.calcular();

        System.out.println("El factorial de " + n + " es: " + resultado);

        sc.close();
    }
}

class Factorial {

    private int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }

    public long calcular() {
        return calcularRecursivo(numero);
    }

    private long calcularRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularRecursivo(n - 1);
    }
}