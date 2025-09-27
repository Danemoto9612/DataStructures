package array;

import java.util.Scanner;

public class ArrayMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {
        
        // Ciclo para controlar el menú de acciones de la clase vectores
        do {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                                 A R R A Y");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                             1. Return");
            System.out.println("2. Fill                                                             3. Show  ");
            System.out.println("4. Search                                                           5. Modify");
            System.out.println("6. Insert                                                           7. Delete");
            System.out.println("8. Sort                                                             9. Easter");
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
                    
                    // Permite llenar el vector
                    Operations.fill();
                    break;
                }
                case "3" -> {
                    
                    // Permite mostrar los datos en el vector
                    Operations.show();
                    break;
                }
                case "4" -> {
                    
                    // Permite buscar un dato existente en el vector
                    Operations.search();
                    break;
                }
                case "5" -> {
                    
                    // Permite buscar y modificar un dato existente en el vector
                    Operations.modify();
                    break;
                }
                case "6" -> {
                    
                    // Permite insertar un dato nuevo antes de un dato existente en el vector
                    Operations.insert();
                    break;
                }
                case "7" -> {
                    
                    // Permite borrar un dato existente en el vector
                    Operations.delete();
                    break;
                }
                case "8" -> {
                    
                    // Permite ordenar de forma ascendente o descendente el vector
                    Operations.bubbleSort(Operations.chooseOpt());
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
