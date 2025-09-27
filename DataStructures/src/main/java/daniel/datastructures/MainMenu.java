// Main menu
package daniel.datastructures;

import array.ArrayMenu;
import java.util.Scanner;
import linkedlist.LinkedListMenu;
import matrix.MatrixMenu;
import record.RecordMenu;
import set.SetMenu;
import string.StringMenu;

public class MainMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void structuresMenu() {

        // Ciclo para controlar el menú principal de acceso a las demás clases con sus operaciones
        do {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                     D A T A   S T R U C T U R E S");
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

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                }
                case "1" -> {

                    ArrayMenu.operationsMenu();
                    break;
                }
                case "2" -> {

                    MatrixMenu.operationsMenu();
                    break;
                }
                case "3" -> {

                    SetMenu.operationsMenu();
                    break;
                }
                case "4" -> {

                    break;
                }
                case "5" -> {

                    break;
                }
                case "6" -> {

                    break;
                }
                case "7" -> {

                    break;
                }
                case "8" -> {

                    break;
                }
                case "9" -> {

                    break;
                }
                case "10" -> {

                    RecordMenu.operationsMenu();
                    break;
                }
                case "11" -> {

                    LinkedListMenu.operationsMenu();
                    break;
                }
                case "12" -> {

                    StringMenu.operationsMenu();
                    break;
                }
                case "13" -> {
                    
                    break;
                }
                case "14" -> {
                    
                    break;
                }
                case "15" -> {
                    
                    break;
                }
                case "16" -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                        CREATED BY D4N13L M0R4L35");
                    break;
                }
                default -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                       I N V A L I D   O P T I O N");
                    break;
                }
            }

        } while (!option.equals("0"));
    }
}
