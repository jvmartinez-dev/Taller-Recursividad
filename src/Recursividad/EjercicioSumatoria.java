package Recursividad;

import java.util.Scanner;

public class EjercicioSumatoria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un valor entero n: ");
        int n = sc.nextInt();

        SumatoriaArmonica sumatoria = new SumatoriaArmonica(n);
        double resultado = sumatoria.calcular();

        System.out.println("La sumatoria es: " + resultado);

        sc.close();
    }
}

class SumatoriaArmonica {

    private int n;

    public SumatoriaArmonica(int n) {
        this.n = n;
    }

    public double calcular() {
        return calcularRecursivo(n);
    }

    private double calcularRecursivo(int i) {
        if (i == 1) {
            return 1.0;
        }
        return (1.0 / i) + calcularRecursivo(i - 1);
    }
}