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
public class Matrices01 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        final int FILAS = 4, COLUMNAS = 3;
        
        int[][] notas = new int[FILAS][COLUMNAS];
        String[] alumnos = new String[FILAS];
        
        System.out.println("REGISTRO DE NOTAS DE 4 ALUMNOS");
        
        for (int i = 0; i < FILAS; i++) {
            System.out.print("Ingrese el Alumno No " + (i+1) + ": ");
            alumnos[i] = leer.nextLine();
            
            System.out.println("Ingrese las notas:");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("NOTA " + (j + 1) + ": ");
                notas[i][j] = leer.nextInt();
            }
            
            leer.nextLine();
            
        }
        
        
        
        
    }
}
