package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        String miVariable = "Hola Mundo";
        int _contador = 1;
        double $precio = 17.5;
        //String variable123 = "Variable con números";
        // Son variables válidas porque inician con letras, guion bajo o signo de dólar, y no contienen espacios ni caracteres especiales.
        //123variable; mi-variable; class; public
        // No son identificadores válios si inician con números, contienen espacios o caracteres especiales, además si son palabras reservadas.
        System.out.println("Identificadores de variables válidos: " + miVariable + ", " + _contador + ", " + $precio);
    }
}
