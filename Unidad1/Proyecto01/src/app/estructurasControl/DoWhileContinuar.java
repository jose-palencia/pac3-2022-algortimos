/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.estructurasControl;

import java.util.Scanner;

/**
 *
 * @author DEVELOPER
 */
public class DoWhileContinuar {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        char continuar = 'S';
        
        do {
            
            System.out.println("PROGRAMA PARA IMPRIMIR NUMERO");
            System.out.println("******************************\n");
            
            System.out.print("Ver numeros hasta: ");
            int numero = leer.nextInt();
            
            for (int i = 1; i <= numero; i++) {
                System.out.println("- " + i);
            }
            System.out.println("""
                               Desea continuar? 
                               Ingrese S para continuar 
                               ó cualquier letra para salir""");
            leer.nextLine();
            continuar = leer.nextLine().charAt(0);
        } while (continuar == 'S' || continuar == 's');
        
        System.out.println("Ha salido de la aplicación...");
    }
}
