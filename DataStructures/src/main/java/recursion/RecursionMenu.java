package recursion;

import java.util.Scanner;

public class RecursionMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {

        // Ciclo para controlar el menú de acciones de la clase recursion
        do {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                            R E C U R S I O N");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                             1. Return");
            System.out.println("2. Factorial                                                        3. Adding");
            System.out.println("4. Fibonacci                                                        5. Easter");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();

            switch (option) {

                case "0" -> {

                    // Permite salir de programa desde este punto
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.exit(0);
                }
                case "1" -> {

                    // Permite regresar al menú principal
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                <--- <--- <--- R E T U R N <--- <--- <---");
                    break;
                }
                case "2" -> {
                    
                    System.out.println("Factorial: " + Operations.factorial(Operations.returnNumber("Enter number")));
                }
                case "3" -> {
                    
                    System.out.println("Adding: " + Operations.adding(Operations.returnNumber("Enter number")));
                }
                case "4" -> {
                    
                    System.out.println("Fibonacci: " + Operations.fibonacci(Operations.returnNumber("Enter number")));
                }
                case "5" -> {

                    // Permite mostrar un huevo de pascua en el programa
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                        CREATED BY D4N13L M0R4L35");
                    break;
                }
                default -> {

                    // Permite mostrarle al usuario que la opción escogida no es válida
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                       I N V A L I D   O P T I O N");
                    break;
                }
            }
        } while (!option.equals("1"));
    }
}
