package linkedlist;

import java.util.Scanner;

public class LinkedListMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {
        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                           L I N K E D   L I S T");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                     1. Return");
            System.out.println("2. Fill                                                     3. Show ");
            System.out.println("4. Seach                                                    5. Modify");
            System.out.println("6. Delete                                                   7. Insert before");
            System.out.println("8. Insert after                                             9. Search largest");
            System.out.println("10. Search smallest                                         11. Easter");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();
            switch (option) {
                case "0" -> {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.exit(0);
                }
                case "1" -> {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                <--- <--- <--- R E T U R N <--- <--- <---");
                    break;
                }
                case "2" -> {
                    Operations.createdNewNode();
                }
                case "3" -> {
                    Operations.showNodes();
                }
                case "4" -> {
                    Operations.searchNode();
                }
                case "5" -> {
                    Operations.modifyNode();
                }
                case "6" -> {
                    Operations.deleteNode();
                }
                case "7" -> {
                    Operations.insertBeforeNode();
                }
                case "8" -> {
                    Operations.insertAfterNode();
                }
                case "9" -> {
                    Operations.searchLargestNode();
                }
                case "10" -> {
                    Operations.searchSmallestNode();
                }
                case "11" -> {
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
        } while (!option.equals("1"));
    }

}
