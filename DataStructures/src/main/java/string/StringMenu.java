package string;

import java.util.Scanner;

public class StringMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {

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
                    Operations.fillString();
                }
                case "3" -> {
                    Operations.showString();
                }
                case "4" -> {
                    Operations.palindromeString();
                }
                case "5" -> {
                    Operations.decimal2RomanString();
                }
                case "6" -> {
                    Operations.upperString();
                }
                case "7" -> {
                    Operations.lowerString();
                }
                case "8" -> {
                    Operations.deleteString();
                }
                case "9" -> {
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
