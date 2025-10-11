package queue;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    public static final int max = 50;
    public static int last = 0;
    public static int[] queue = new int[max];

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

    public static void pushQueue() {

        if (last < max) {

            int datum = returnNumber("Enter number");
            queue[last] = datum;
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   D A T A   H A S   B E E N   A D D E D");
            last++;
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                 Q U E U E   C O M P L E T E L Y   F U L L");
        }
    }

    public static void popQueue() {

        if (last > 0) {

            for (int i = 0; i < last - 1; i++) {
                queue[i] = queue[i + 1];
            }
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                        D E L E T E   N U M B E R");
            last--;
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   Q U E U E   H A S N ' T   D A T A");
        }
    }

    public static void showQueue() {

        if (last > 0) {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Queue: |");
            for (int i = 0; i < last; i++) {

                System.out.print(queue[i] + "|");
            }

            System.out.println();
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   Q U E U E   H A S N ' T   D A T A");
        }
    }
}
