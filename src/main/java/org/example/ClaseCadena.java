package org.example;

public class ClaseCadena {
    public static String DevuelveIniciales(String nombres) {
        String[] palabras = nombres.split(" ");
        StringBuilder iniciales = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                char inicial = palabra.charAt(0);
                iniciales.append(Character.toUpperCase(inicial)).append(".");
            }
        }

        return iniciales.toString();
    }
}
