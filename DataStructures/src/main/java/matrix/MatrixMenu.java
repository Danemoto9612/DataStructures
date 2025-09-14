package matrix;

import java.util.Scanner;

public class MatrixMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {

        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("                      M A T R I X");
            System.out.println("-----------------------------------------------------------");
            System.out.println("0. Exit                              1. Return");
            System.out.println("2. Fill                              3. Show  ");
            System.out.println("4. Search                            5. Modify");
            System.out.println("6. Insert Raw                        7. Insert Column");
            System.out.println("8. Delete Raw                        9. Delete Column");
            System.out.println("10. Print Raw                        11. Print Column");
            System.out.println("12. Main diagonal                    13. Secondary diagonal");
            System.out.println("14. Upper triangle                   15. Lower triangle");
            System.out.println("16. Easter");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();
            switch (option) {
                case "0" -> {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------");
                    System.exit(0);
                }
                case "1" -> {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("        <--- <--- <--- R E T U R N <--- <--- <---");
                    break;
                }
                case "2" -> {
                    Operations.fill();
                }
                case "3" -> {
                    Operations.show();
                }
                case "4" -> {
                    Operations.search();
                }
                case "5" -> {
                    Operations.modify();
                }
                case "6" -> {
                    Operations.insertRaw();
                }
                case "7" -> {
                    Operations.insertColumn();
                }
                case "8" -> {
                    Operations.deleteRaw();
                }
                case "9" -> {
                    Operations.deleteColumn();
                }
                case "10" -> {
                    Operations.printRaw();
                }
                case "11" -> {
                    Operations.printColumn();
                }
                case "12" -> {
                    Operations.printMainDiagonal();
                }
                case "13" -> {
                    Operations.printSecondaryDiagonal();
                }
                case "14" -> {
                    Operations.printUpperTriangle();
                }
                case "15" -> {
                    Operations.printLowerTriangle();
                }
                case "16" -> {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                 CREATED BY D4N13L M0R4L35");
                    break;
                }
                default -> {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                 I N V A L I D   O P T I O N");
                    break;
                }
            }
        } while (!option.equals("1"));
    }

}
