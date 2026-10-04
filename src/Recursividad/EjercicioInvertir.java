package Recursividad;

import java.util.Scanner;

public class EjercicioInvertir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        Inversor inversor = new Inversor(n);
        int resultado = inversor.invertir();

        System.out.println("El numero invertido es: " + resultado);

        sc.close();
    }
}

class Inversor {

    private int numero;

    public Inversor(int numero) {
        this.numero = numero;
    }

    public int invertir() {
        return invertirRecursivo(numero, 0);
    }

    private int invertirRecursivo(int n, int acumulado) {
        if (n == 0) {
            return acumulado;
        }
        return invertirRecursivo(n / 10, acumulado * 10 + (n % 10));
    }
}