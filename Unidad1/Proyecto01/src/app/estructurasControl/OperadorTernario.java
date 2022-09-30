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
public class OperadorTernario {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura del clima: ");
        int temperatura = leer.nextInt();
        
        String clima = 
                (temperatura > 25) ? "A la playa!!!" : "Esperemos buen clima...";
        
        System.out.println(clima);
        
//        if(temperatura > 25) {
//            System.out.println("A la playa!!!");
//        } else {
//            System.out.println("Esperemos buen clima...");
//        }
    } 
}
