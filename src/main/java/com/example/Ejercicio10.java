package com.example;
import java.util.Scanner;
public class Ejercicio10 {
    public static void ejercicio10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 10");
        final double PRECIO_PRODUCTO = 19.99;
        final int IVA_PORCENTAJE = 16;
        System.out.print("Digite la cantidad de productos a comprar: ");
        int cantidad = scanner.nextInt();
        System.out.print("Digitar nombre del cliente: ");
        String nombreCliente = scanner.next();
        double subtotal = PRECIO_PRODUCTO * cantidad;
        double iva = subtotal * IVA_PORCENTAJE / 100;
        double total = subtotal + iva;
        System.out.println("Factura del cliente: " + nombreCliente);
        System.out.println("Cantidad de productos: " + cantidad);
        System.out.println("Precio unitario: $" + PRECIO_PRODUCTO);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (" + IVA_PORCENTAJE + "%): $" + iva);
        System.out.println("Total a pagar: $" + total);
        scanner.close();
    }
}
