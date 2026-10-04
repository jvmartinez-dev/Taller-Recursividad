package Recursividad;

import java.util.Scanner;

public class EjercicioSumaArreglo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos valores desea ingresar: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        SumaArreglo suma = new SumaArreglo(arreglo);
        int resultado = suma.calcular();

        System.out.println("La suma de los elementos es: " + resultado);

        sc.close();
    }
}

class SumaArreglo {

    private int[] arreglo;

    public SumaArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int calcular() {
        return calcularRecursivo(0);
    }

    private int calcularRecursivo(int indice) {
        if (indice == arreglo.length) {
            return 0;
        }
        return arreglo[indice] + calcularRecursivo(indice + 1);
    }
}