package stack;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    public static final int max = 50;
    public static int top = 0;
    public static int[] stack = new int[max];

    // Retornar dato. Sólo para uso interno de la clase
    private static int returnNumber(String text) {

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
            } catch (Exception e) {

                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                         I N V A L I D   T Y P E");
                sc.nextLine();
            }
        }

        sc.nextLine();
        return number;
    }

    public static void pushStack() {

        if (top < max) {

            int datum = returnNumber("Enter number");
            stack[top] = datum;
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   D A T A   H A S   B E E N   A D D E D");
            top++;
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                 S T A C K   C O M P L E T E L Y   F U L L");
        }
    }

    public static void unpushStack() {

        if (top > 0) {

            top--;
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                        D E L E T E   N U M B E R");
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   S T A C K   H A S N ' T   D A T A");
        }
    }

    public static void showStack() {

        if (top > 0) {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Stack: |");
            for (int i = top - 1; i >= 0; i--) {

                System.out.print(stack[i] + "|");
            }

            System.out.println();
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   S T A C K   H A S N ' T   D A T A");
        }
    }
}
