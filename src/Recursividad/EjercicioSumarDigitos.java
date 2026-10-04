package Recursividad;

import java.util.Scanner;

public class EjercicioSumarDigitos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        SumaDigitos suma = new SumaDigitos(n);
        int resultado = suma.calcular();

        System.out.println("La suma de los digitos es: " + resultado);

        sc.close();
    }
}

class SumaDigitos {

    private int numero;

    public SumaDigitos(int numero) {
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