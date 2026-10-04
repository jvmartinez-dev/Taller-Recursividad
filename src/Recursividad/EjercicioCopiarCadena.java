package Recursividad;

import java.util.Scanner;

public class EjercicioCopiarCadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = sc.nextLine();

        Copiador copiador = new Copiador(cadena);
        String copia = copiador.copiar();

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena copiada: " + copia);

        sc.close();
    }
}

class Copiador {

    private String cadena;

    public Copiador(String cadena) {
        this.cadena = cadena;
    }

    public String copiar() {
        return copiarRecursivo(0);
    }

    private String copiarRecursivo(int indice) {
        if (indice == cadena.length()) {
            return "";
        }
        return cadena.charAt(indice) + copiarRecursivo(indice + 1);
    }
}