package set;

import java.util.Scanner;

public class SetMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {

        // Ciclo para controlar el menú de acciones de la clase set
        do {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                                  S E T");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                       1. Return");
            System.out.println("2. Fill                                                       3. Show  ");
            System.out.println("4. Search                                                     5. Modify");
            System.out.println("6. Insert                                                     7. Delete");
            System.out.println("8. Union                                                      9. Intersection");
            System.out.println("10. Difference                                                11. Complement");
            System.out.println("12. Easter");
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
                    
                    // Permite llenar los sets
                    Operations.fillSet();
                    break;
                }
                case "3" -> {
                    
                    // Permite mostrar los sets
                    Operations.showSet();
                    break;
                }
                case "4" -> {
                    
                    // Permite buscar un dato existente en los sets
                    Operations.searchSet();
                    break;
                }
                case "5" -> {
                    
                    // Permite modificar un dato existente en los sets
                    Operations.modifySet();
                    break;
                }
                case "6" -> {
                    
                    // Permite insertar un nuevo dato en los sets
                    Operations.insertSet();
                    break;
                }
                case "7" -> {
                    
                    // Permite borrar un dato existente en los sets
                    Operations.deleteSet();
                    break;
                }
                case "8" -> {
                    
                    // Permite aplicar operación de unión a los sets
                    Operations.unionSet();
                    break;
                }
                case "9" -> {
                    
                    // Permite aplicar operación de intersección a los sets
                    Operations.intersectionSet();
                    break;
                }
                case "10" -> {
                    
                    // Permite aplicar operación de diferencia a los sets
                    Operations.differenceSet();
                    break;
                }
                case "11" -> {
                    
                    // Permite aplicar operación de complemento a los sets
                    Operations.complementSet();
                    break;
                }
                case "12" -> {
                    
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
