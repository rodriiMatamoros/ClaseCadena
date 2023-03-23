package org.example;

public class Main {
    public static void main(String[] args) {
        String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac");
        System.out.println(iniciales); // Imprime "A.D."

        String iniciales2 = ClaseCadena.DevuelveIniciales("Andreas");
        System.out.println(iniciales2); // Imprime "A."

        String iniciales3 = ClaseCadena.DevuelveIniciales("Andreas Dulac Sánchez");
        System.out.println(iniciales3); // Imprime "A.D.S."

    }
}
