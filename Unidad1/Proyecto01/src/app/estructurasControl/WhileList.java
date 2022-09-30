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
public class WhileList {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ver numeros hasta: ");
        int numero = leer.nextInt();
        int i = 1;
        
        while(i <= numero) {
            System.out.println("- " + i);
            i++;
        }
    }
}
