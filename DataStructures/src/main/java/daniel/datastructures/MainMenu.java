// Main menu
package daniel.datastructures;

import array.ArrayMenu;
import circularlinkedlist.CircularLinkedListMenu;
import java.util.Scanner;
import linkedlist.LinkedListMenu;
import doublelinkedlist.DoubleLinkedListMenu;
import matrix.MatrixMenu;
import queue.QueueMenu;
import record.RecordMenu;
import recursion.RecursionMenu;
import set.SetMenu;
import stack.StackMenu;
import string.StringMenu;

public class MainMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void structuresMenu() {

        // Ciclo para controlar el menú principal de acceso a las demás clases con sus operaciones
        do {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                        D A T A   S T R U C T U R E S");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                 1. Array");
            System.out.println("2. Matrix                                               3. Set  ");
            System.out.println("4. Arraylist                                            5. Stack");
            System.out.println("6. Queue                                                7. Recursion");
            System.out.println("8. Tree                                                 9. Graph");
            System.out.println("10. Record                                              11. LinkedList");
            System.out.println("12. Circular linkedlist                                 13. Double linkedList");
            System.out.println("14. Circular double linkedlist                          15. Character string");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();

            switch (option) {

                case "0" -> {
                    
                    // Permite salir de programa desde este punto
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                }
                case "1" -> {
                    
                    // Permite entrar al menú de array
                    ArrayMenu.operationsMenu();
                    break;
                }
                case "2" -> {
                    
                    // Permite entrar al menú matrix
                    MatrixMenu.operationsMenu();
                    break;
                }
                case "3" -> {
                    
                    // Permite entrar al menú set
                    SetMenu.operationsMenu();
                    break;
                }
                case "4" -> {
                    
                    // Permite entrar al menú arraylist
                    break;
                }
                case "5" -> {
                    
                    // Permite entrar al menú stack
                    StackMenu.operationsMenu();
                    break;
                }
                case "6" -> {
                    
                    QueueMenu.operationsMenu();
                    break;
                }
                case "7" -> {
                    
                    // Permite entrar al menú recursion
                    RecursionMenu.operationsMenu();
                    break;
                }
                case "8" -> {
                    
                    // Permite entrar al menú tree
                    break;
                }
                case "9" -> {
                    
                    // Permite entrar al menú graph
                    break;
                }
                case "10" -> {

                    // Permite entrar al menú record
                    RecordMenu.operationsMenu();
                    break;
                }
                case "11" -> {
                    
                    // Permite entrar al menú linkedlist
                    LinkedListMenu.operationsMenu();
                    break;
                }
                case "12" -> {

                    // Permite entrar al menú circularlinkedlist
                    CircularLinkedListMenu.operationsMenu();
                    break;
                }
                case "13" -> {
                    
                    // Permite entrar al menú doublelinkedlist
                    DoubleLinkedListMenu.operationsMenu();
                    break;
                }
                case "14" -> {
                    
                    // Permite entrar al menú circulardoublelinkedlist
                    break;
                }
                case "15" -> {
                    
                    // Permite entrar al menú string
                    StringMenu.operationsMenu();
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
                    System.out.println("                       I N V A L I D   O P T I O N");
                    break;
                }
            }

        // Permite validar si debe continuar el menú de array
        } while (!option.equals("0"));
    }
}
