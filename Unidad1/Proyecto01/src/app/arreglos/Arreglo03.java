/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.arreglos;

import java.util.Scanner;

/**
 *
 * @author DEVELOPER
 */
public class Arreglo03 {
    public static void main(String[] args) {
        int edades[];
        int promedio = 0;
        char continuar = 'S';
        Scanner leer = new Scanner(System.in);
        
        do {            
            int suma = 0;
            System.out.print("Cuantas edades quiere ingresar: ");
            int cantidad = leer.nextInt();
            edades = new int[cantidad];

            for(int i = 0; i < edades.length; i++) {
                System.out.print("Ingrese edad " + (i+1) + ": ");
                edades[i] = leer.nextInt();
                suma += edades[i];
            }

            promedio = suma/edades.length;
            System.out.println("El Promedio de edad es: " + promedio);

            System.out.println("Desea continuar? S. ");
            leer.nextLine();
            continuar = leer.nextLine().charAt(0);
        } while (continuar == 'S');
        
    }
}
