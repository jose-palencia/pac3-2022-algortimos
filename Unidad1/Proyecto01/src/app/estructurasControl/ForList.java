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
public class ForList {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ver numeros hasta: ");
        int numero = leer.nextInt();
        
        for(int i = 1; i <= numero; i++){
            System.out.println("- " + i);
        }
    }
    
}
