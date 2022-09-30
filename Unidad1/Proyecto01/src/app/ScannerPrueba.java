package app;

import java.util.Scanner;

public class ScannerPrueba {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingrese su genero: ");
        char genero = leer.next().charAt(0);
        
        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();
        
        System.out.println("***************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Edad: " + edad);
        System.out.println("***************************");
    }
}