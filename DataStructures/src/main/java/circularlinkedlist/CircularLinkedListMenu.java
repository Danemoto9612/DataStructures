package circularlinkedlist;

import java.util.Scanner;

public class CircularLinkedListMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {

        // Ciclo para controlar el menú de acciones de la clase listas ligadas
        do {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                 C I R C U L A R   L I N K E D   L I S T");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                     1. Return");
            System.out.println("2. Fill start                                               3. Show ");
            System.out.println("4. Search                                                   5. Modify");
            System.out.println("6. Delete                                                   7. Insert before");
            System.out.println("8. Insert after                                             9. Search largest");
            System.out.println("10. Search smallest                                         11. Fill end");
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

                    // Permite crear un nuevo nodo por el inicio
                    Operations.createNewNode();
                    break;
                }
                case "3" -> {

                    // Permite mostrar los nodos existentes
                    Operations.showNodes();
                    break;
                }
                case "4" -> {

                    // Permite buscar un nodo existente
                    Operations.searchNode();
                    break;
                }
                case "5" -> {

                    // Permite modificar un nodo existente
                    Operations.modifyNode();
                    break;
                }
                case "6" -> {

                    // Permite borrar un nodo existente
                    Operations.deleteNode();
                    break;
                }
                case "7" -> {

                    // Permite insertar un nuevo nodo antes de un nodo existente
                    //linkedlist.Operations.insertBeforeNode();
                    break;
                }
                case "8" -> {

                    // Permite insertar un nuevo nodo después de un nodo existente
                    //linkedlist.Operations.insertAfterNode();
                    break;
                }
                case "9" -> {

                    // Permite buscar el nodo de mayor valor
                    //linkedlist.Operations.searchLargestNode();
                    break;
                }
                case "10" -> {

                    // Permite buscar el nodo de menor valor
                    //linkedlist.Operations.searchSmallestNode();
                    break;
                }
                case "11" -> {

                    // Permite crear un nuevo nodo por el final
                    Operations.createNewNodeEnd();
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
