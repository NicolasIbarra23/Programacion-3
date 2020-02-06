/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraconsola;

import java.util.Scanner;
public class CalculadoraConsola {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int sel = 0;
        double num1 = 0;
        double num2= 0;
        double resul = 0;
        
        do {
            System.out.println("\n");
            System.out.print("Seleccione la operación que desea realizar: ");
            System.out.println("\n");
            System.out.println("-------------------------");
            System.out.println("- 1.  SUMA              -");
            System.out.println("- 2.  RESTA             -");
            System.out.println("- 3.  MULTIPLICACIÓN    -");
            System.out.println("- 4.  DIVISION          -");
            System.out.println("- 5.  SALIR             -");
            System.out.println("-------------------------");
            sel = leer.nextInt();
            
            
            switch (sel)
            {
                case 1:
                     System.out.println ("SUMA\n");
                    System.out.print("Inserte el primer número: ");
                num1 = leer.nextInt();
                System.out.print("Inserte el número 2: ");
                num2 = leer.nextInt();
                    sel = 1;
                    resul = (num1 + num2);
                    
                    System.out.println("El resultado de la suma es: " + resul );
                    break;
                case 2:
                    System.out.println("RESTA\n");
                    System.out.print("Inserte el primer número: ");
                num1 = leer.nextInt();
                System.out.print("Inserte el número 2: ");
                num2 = leer.nextInt();
                    sel = 2;
                    resul = (num1 - num2);
                    System.out.println("El resultado de la suma es: " +resul);
                    break;
                case 3:
                    System.out.println("MULTIPLICACIÓN");
                    System.out.print("Inserte el primer número: ");
                num1 = leer.nextInt();
                System.out.print("Inserte el número 2: ");
                num2 = leer.nextInt();
                    sel = 3;
                    resul = (num1 * num2);
                    System.out.println("El resultado de la multiplicación es: " + resul);
                    break;
                case 4:
                    System.out.println("DIVISÓN");
                    System.out.print("Inserte el primer número: ");
                num1 = leer.nextInt();
                System.out.print("Inserte el número 2: ");
                num2 = leer.nextInt();
                    sel = 4;
                    resul = num1 / num2;
                    System.out.println("El resultado de la división es: " + resul);
                    break;
                    
                    
                    
                    
            }
        }while(sel != 5 && sel < 5);
        System.out.println("Ha elegido salir de la calculadora, Hasta luego");
    }
    
}
