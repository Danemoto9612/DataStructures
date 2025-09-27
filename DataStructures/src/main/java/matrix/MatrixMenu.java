package matrix;

import java.util.Scanner;

public class MatrixMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {
        
        // Ciclo para controlar el menú de acciones de la clase matrix
        do {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                                M A T R I X");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                1. Return");
            System.out.println("2. Fill                                                3. Show  ");
            System.out.println("4. Search                                              5. Modify");
            System.out.println("6. Insert Raw                                          7. Insert Column");
            System.out.println("8. Delete Raw                                          9. Delete Column");
            System.out.println("10. Print Raw                                          11. Print Column");
            System.out.println("12. Main diagonal                                      13. Secondary diagonal");
            System.out.println("14. Upper triangle                                     15. Lower triangle");
            System.out.println("16. Easter");
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
                    
                    // Permite llenar la matriz
                    Operations.fill();
                    break;
                }
                case "3" -> {
                     
                    // Permite mostrar los datos en la matriz
                    Operations.show();
                    break;
                }
                case "4" -> {
                    
                    // Permite buscar un dato existente en la matriz
                    Operations.search();
                    break;
                }
                case "5" -> {
                    
                    // Permite modificar un dato existente en la matriz
                    Operations.modify();
                    break;
                }
                case "6" -> {
                    
                    // Permite insertar una fila en la matriz
                    Operations.insertRaw();
                    break;
                }
                case "7" -> {
                    
                    // Permite insertar una columna en la matriz
                    Operations.insertColumn();
                    break;
                }
                case "8" -> {
                    
                    // Permite borrar una fila en la matriz
                    Operations.deleteRaw();
                    break;
                }
                case "9" -> {
                    
                    // Permite borrar una columna en la matriz
                    Operations.deleteColumn();
                    break;
                }
                case "10" -> {
                    
                    // Permite imprimir una fila en la matriz
                    Operations.printRaw();
                    break;
                }
                case "11" -> {
                    
                    // Permite imprimir una columna en la matriz
                    Operations.printColumn();
                    break;
                }
                case "12" -> {
                    
                    // Permite imprimir la diagonal principal en la matriz
                    Operations.printMainDiagonal();
                    break;
                }
                case "13" -> {
                    
                    // Permite imprimir la diagonal secundaria en la matriz
                    Operations.printSecondaryDiagonal();
                    break;
                }
                case "14" -> {
                    
                    // Permite imprimir el triángulo por encima de la diagonal principal
                    Operations.printUpperTriangle();
                    break;
                }
                case "15" -> {
                    
                    // Permite imprimir el triángulo por debajo de la diagonal principal
                    Operations.printLowerTriangle();
                    break;
                }
                case "16" -> {
                    
                    // Permite mostrar un huevo de pascua en el programa
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                        CREATED BY D4N13L M0R4L35");
                    break;
                }
                default -> {
                    
                    // Permite mostrarle al usuario que la opción escogida no es válida
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                 I N V A L I D   O P T I O N");
                    break;
                }
            }
            
        // Permite validar si debe continuar el menú de array
        } while (!option.equals("1"));
    }

}
