// Main menu
package daniel.datastructures;

import array.ArrayMenu;
import java.util.Scanner;
import linkedlist.LinkedListMenu;
import matrix.MatrixMenu;
import record.RecordMenu;

public class MainMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void structuresMenu() {

        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                     D A T A   S T R U C T U R E S");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                        1. Array");
            System.out.println("2. Matrix                                                      3. Set  ");
            System.out.println("4. Arraylist                                                   5. Stack");
            System.out.println("6. Queue                                                       7. Recursion");
            System.out.println("8. Tree                                                        9. Graph");
            System.out.println("10. Record                                                     11. LinkedList");
            System.out.println("12. Character string                                           13. Easter");
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
                }
                case "2" -> {
                    MatrixMenu.operationsMenu();
                }
                case "3" -> {
                }
                case "4" -> {
                }
                case "5" -> {
                }
                case "6" -> {
                }
                case "7" -> {
                }
                case "8" -> {
                }
                case "9" -> {
                }
                case "10" -> {
                    RecordMenu.operationsMenu();
                }
                case "11" -> {
                    LinkedListMenu.operationsMenu();
                }
                case "12" -> {
                }
                case "13" -> {
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
