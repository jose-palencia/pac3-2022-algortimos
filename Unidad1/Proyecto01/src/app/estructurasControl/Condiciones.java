package app.estructurasControl;

import java.util.Scanner;

public class Condiciones {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int x = leer.nextInt();
        
        System.out.println("Ingrese un numero: ");
        int y = leer.nextInt();
        
        if(x == y) {
            System.out.println("Los numeros ingresados"
                    + " son iguales");
        } else {
            System.out.println("Los numero ingresados"
                + " no son iguales");
        }
    }
    
}
