/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.matrices;

import java.util.Scanner;

/**
 *
 * @author DEVELOPER
 */
public class Matrices02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Cuantos alumnos ingresara: ");
        int filas = leer.nextInt();
        
        System.out.print(
                "Cuantas notas por alumno ingresara: ");
        int columnas = leer.nextInt();
        
        leer.nextLine();
        
        int[][] notas = new int[filas][columnas];
        String[] alumnos = new String[filas];
        
        System.out.println(
                "REGISTRO DE NOTAS DE " + columnas + " ALUMNOS");
        
        //System.out.println("POSICIONES MATRIZ: " + notas[0].length);
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el Alumno No " + (i+1) + ": ");
            alumnos[i] = leer.nextLine();
            
            System.out.println("Ingrese las notas:");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("NOTA " + (j + 1) + ": ");
                notas[i][j] = leer.nextInt();
            }
            
            leer.nextLine();
            
        }
        
        System.out.println("\n-----------------------------------");
        System.out.print("ALUMNOS\t");
        for (int i = 0; i < notas[0].length; i++) {
            System.out.print("\tN" + i);
        }
        
        System.out.println("");
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("-" + (i+1) + ". " + alumnos[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("\t" + notas[i][j]);
            }
            System.out.println("");
        }
        
        
    }
}
