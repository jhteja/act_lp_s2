package com.example;
import java.util.Scanner;
public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digitar su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Digitar su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Digita tu altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Tu nombre es: " + nombre + ", tienes " + edad + " años y mides " + altura);
        scanner.close();
     }
}
