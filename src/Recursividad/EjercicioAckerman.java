package Recursividad;

import java.util.Scanner;

public class EjercicioAckerman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de m: ");
        int m = sc.nextInt();

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        Ackerman ackerman = new Ackerman(m, n);
        int resultado = ackerman.calcular();

        System.out.println("El valor de Ackerman(" + m + ", " + n + ") es: " + resultado);

        sc.close();
    }
}

class Ackerman {

    private int m;
    private int n;

    public Ackerman(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int calcular() {
        return calcularRecursivo(m, n);
    }

    private int calcularRecursivo(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return calcularRecursivo(m - 1, 1);
        }
        return calcularRecursivo(m - 1, calcularRecursivo(m, n - 1));
    }
}