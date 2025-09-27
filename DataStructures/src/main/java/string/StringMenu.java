package string;

import java.util.Scanner;

public class StringMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {

        // Ciclo para controlar el menú de acciones de la clase string
        do {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                               S T R I N G");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                   1. Return");
            System.out.println("2. Fill                                                   3. Show  ");
            System.out.println("4. Palindrome                                             5. Decimal to roman");
            System.out.println("6. Upper                                                  7. Lower");
            System.out.println("8. Delete                                                 9. Easter");
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
                    
                    // Permite crear una cadena
                    Operations.fillString();
                    break;
                }
                case "3" -> {
                    
                    // Permite mostrar la cadena existente
                    Operations.showString();
                }
                case "4" -> {
                    
                    // Permite verificar si la cadena existente es palíndroma
                    Operations.palindromeString();
                    break;
                }
                case "5" -> {
                    
                    // Permite pasar la cadena(numeros) a números romanos
                    Operations.decimal2RomanString();
                    break;
                }
                case "6" -> {
                    
                    // Permite convertir la cadena existente en mayúscula
                    Operations.upperString();
                    break;
                }
                case "7" -> {
                    
                    // Permite convertir la cadena existente en minúscula
                    Operations.lowerString();
                    break;
                }
                case "8" -> {
                    
                    // Permite eliminar la cadena existente
                    Operations.deleteString();
                    break;
                }
                case "9" -> {
                    
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
            
        // Permite validar si debe continuar el menú de array
        } while (!option.equals("1"));
    }

}
