package recursion;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);
    
    // Retornar dato. Sólo para uso interno de la clase
    public static int returnNumber(String text) {

        int number = 0;
        boolean sw = true;

        // Ciclo para veficar que se ingrese un tipo de dato válido
        while (sw) {

            // Controlar excepciones al entrar datos de tipo no entero
            try {

                System.out.println("-----------------------------------------------------------------------------");
                System.out.print(text + ": ");
                number = sc.nextInt();
                // Finalizar ciclo cuando el dato ingresado sea válido
                sw = false;
                System.out.println("-----------------------------------------------------------------------------");
            } catch (Exception e) {

                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                         I N V A L I D   T Y P E");
                sc.nextLine();
            }
        }

        sc.nextLine();
        return number;
    }
    
    public static int factorial(int data) {
        
        if (data == 0) {
            
            return 1;
        } else {
            
            return data * factorial(data - 1);
        }
    }
    
    public static int adding(int data) {
        
        if (data == 1) {
            
            return 1;
        } else {
            
            return data + adding(data - 1);
        }
    }
    
    public static int fibonacci(int data) {
        
        if (data < 2) {
            
            return data;
        } else {
            
            return fibonacci(data - 1) + fibonacci(data - 2);
        }
    }
}
