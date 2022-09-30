/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.estructurasControl;

import java.util.Calendar;

/**
 *
 * @author DEVELOPER
 */
public class DiaSemana {
    public static void main(String[] args) {
        int dia = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        
        switch (dia) {
            case 1: 
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break; 
            case 4:
                System.out.println("Miercoles");
                break; 
            case 5:
                System.out.println("Jueves");
                break; 
            case 6:
                System.out.println("Viernes");
                break; 
            case 7:
                System.out.println("Sabado");
                break;     
            default:
                System.out.println("El dia no es valido");
                break;
        }
    }
}
