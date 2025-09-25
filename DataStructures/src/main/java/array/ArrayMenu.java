package array;

import java.util.Scanner;

public class ArrayMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {
        
        // Ciclo para controlar el menú de acciones sobre los vectores
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
                    
                    Operations.fill();
                    break;
                }
                case "3" -> {
                    
                    Operations.show();
                    break;
                }
                case "4" -> {
                    
                    Operations.search();
                    break;
                }
                case "5" -> {
                    
                    Operations.modify();
                    break;
                }
                case "6" -> {
                    
                    Operations.insert();
                    break;
                }
                case "7" -> {
                    
                    Operations.delete();
                    break;
                }
                case "8" -> {
                    
                    Operations.bubbleSort(Operations.chooseOpt());
                    break;
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
