package Recursividad;

import java.util.Scanner;

public class EjercicioMultiplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        Multiplicacion multiplicacion = new Multiplicacion(a, b);
        int resultado = multiplicacion.calcular();

        System.out.println("El producto es: " + resultado);

        sc.close();
    }
}

class Multiplicacion {

    private int a;
    private int b;

    public Multiplicacion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calcular() {
        return calcularRecursivo(a, b);
    }

    private int calcularRecursivo(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + calcularRecursivo(a, b - 1);
    }
}