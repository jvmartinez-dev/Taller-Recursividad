package Recursividad;

import java.util.Scanner;

public class EjercicioSumarEnteros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        SumatoriaDigitos sumatoria = new SumatoriaDigitos(n);
        int resultado = sumatoria.calcular();

        System.out.println("La sumatoria de los digitos es: " + resultado);

        sc.close();
    }
}

class SumatoriaDigitos {

    private int numero;

    public SumatoriaDigitos(int numero) {
        this.numero = numero;
    }

    public int calcular() {
        return calcularRecursivo(numero);
    }

    private int calcularRecursivo(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + calcularRecursivo(n / 10);
    }
}