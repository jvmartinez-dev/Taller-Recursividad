package Recursividad;

import java.util.Scanner;

public class EjercicioMCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int m = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int n = sc.nextInt();

        Mcd mcd = new Mcd(m, n);
        int resultado = mcd.calcular();

        System.out.println("El M.C.D. es: " + resultado);

        sc.close();
    }
}

class Mcd {

    private int m;
    private int n;

    public Mcd(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int calcular() {
        return calcularRecursivo(m, n);
    }

    private int calcularRecursivo(int m, int n) {
        if (n == 0) {
            return m;
        }
        return calcularRecursivo(n, m % n);
    }
}