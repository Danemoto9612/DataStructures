package set;

import java.util.Scanner;

public class SetMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {

        do {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                                  S E T");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                       1. Return");
            System.out.println("2. Fill                                                       3. Show  ");
            System.out.println("4. Search                                                     5. Modify");
            System.out.println("6. Insert                                                     7. Delete");
            System.out.println("8. Union                                                      9. Intersection");
            System.out.println("10. Difference                                                11 . Complement");
            System.out.println("12. Easter");
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
                    
                    Operations.fillSet();
                    break;
                }
                case "3" -> {
                    
                    Operations.showSet();
                    break;
                }
                case "4" -> {
                    
                    Operations.searchSet();
                    break;
                }
                case "5" -> {
                    
                    Operations.modifySet();
                    break;
                }
                case "6" -> {
                    
                    Operations.insertSet();
                    break;
                }
                case "7" -> {
                    
                    Operations.deleteSet();
                    break;
                }
                case "8" -> {
                    
                    Operations.unionSet();
                    break;
                }
                case "9" -> {
                    
                    Operations.intersectionSet();
                    break;
                }
                case "10" -> {
                    
                    Operations.differenceSet();
                    break;
                }
                case "11" -> {
                    
                    Operations.complementSet();
                    break;
                }
                case "12" -> {
                    
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
