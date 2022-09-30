/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author DEVELOPER
 */
public class ScannerInputError {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int suma = 0, contador = 0;
        
        while(leer.hasNextInt()) {
            System.out.print("Ingrese un numero: ");
            int numero = leer.nextInt();
            suma += numero;
            contador++;
        }
        int promedio = suma / contador;
        System.out.println("***************************");
        System.out.println("El promedio es: " + promedio);
    }
}
