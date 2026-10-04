package Recursividad;

import java.util.Scanner;

public class EjercicioSumaMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int m = sc.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        SumaMatriz suma = new SumaMatriz(matriz);
        int resultado = suma.calcular();

        System.out.println("La suma de los elementos es: " + resultado);

        sc.close();
    }
}

class SumaMatriz {

    private int[][] matriz;

    public SumaMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int calcular() {
        return calcularRecursivo(0, 0);
    }

    private int calcularRecursivo(int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        }
        if (columna == matriz[fila].length) {
            return calcularRecursivo(fila + 1, 0);
        }
        return matriz[fila][columna] + calcularRecursivo(fila, columna + 1);
    }
}