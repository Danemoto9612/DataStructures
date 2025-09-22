package set;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    static int[] setOne = new int[50];
    static int[] setTwo = new int[50];
    static int[] setOneC = new int[50];
    static int[] setTwoC = new int[50];
    static final int[] setUniversal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static int lenSetOne, lenSetTwo;
    static final int lenSetUniversal = setUniversal.length;
    static int number;

    public static int getLenSetOne() {
        return lenSetOne;
    }

    public static int getLenSetTwo() {
        return lenSetTwo;
    }

    public static int getLenSetUniversal() {
        return lenSetUniversal;
    }

    public static void addLenSet(String text, String option) {

        switch (option) {

            case "1" -> {

                boolean sw = true;

                while (sw) {

                    try {
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.print(text + ": ");
                        lenSetOne = sc.nextInt();
                        if (lenSetOne > 0 && lenSetOne < 50) {
                            sw = false;
                        } else {
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                          S I Z E   L E S S   5 0");
                        }
                    } catch (Exception e) {
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                         I N V A L I D   T Y P E");
                        sc.nextLine();
                    }
                }

                sc.nextLine();
            }
            case "2" -> {

                boolean sw = true;

                while (sw) {

                    try {
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.print(text + ": ");
                        lenSetTwo = sc.nextInt();
                        if (lenSetTwo > 0 && lenSetTwo < 50) {
                            sw = false;
                        } else {
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                          S I Z E   L E S S   5 0");
                        }
                    } catch (Exception e) {
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                         I N V A L I D   T Y P E");
                        sc.nextLine();
                    }
                }

                sc.nextLine();
            }
        }
    }

    public static int returnNumber(String text) {

        boolean sw = true;

        while (sw) {

            try {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print(text + ": ");
                number = sc.nextInt();
                sw = false;
            } catch (Exception e) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                         I N V A L I D   T Y P E");
                sc.nextLine();
            }
        }

        sc.nextLine();
        return number;
    }

    public static void fillSet() {

        String option;

        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                       1. Return");
            System.out.println("2. Fill set one                                               3. Fill set two");
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

                    addLenSet("Enter size set one", "1");
                    for (int i = 0; i < lenSetOne; i++) {

                        number = returnNumber("Enter number [" + (i + 1) + "]");
                        if (i == 0) {
                            setOne[0] = number;
                        } else {

                            boolean sw = true;

                            for (int datum : setOne) {

                                if (datum == number) {
                                    sw = false;
                                    break;
                                }
                            }

                            if (!sw) {
                                System.out.println("-----------------------------------------------------------------------------");
                                System.out.println("                  D A T A   A L R E A D Y   E X I S T S");
                                i--;
                            } else {
                                setOne[i] = number;
                            }
                        }
                    }
                    break;
                }
                case "3" -> {

                    addLenSet("Enter size set two", "2");
                    for (int i = 0; i < lenSetTwo; i++) {

                        number = returnNumber("Enter number [" + (i + 1) + "]");
                        if (i == 0) {
                            setTwo[0] = number;
                        } else {

                            boolean sw = true;

                            for (int datum : setTwo) {

                                if (datum == number) {
                                    sw = false;
                                    break;
                                }
                            }

                            if (!sw) {
                                System.out.println("-----------------------------------------------------------------------------");
                                System.out.println("                  D A T A   A L R E A D Y   E X I S T S");
                                i--;
                            } else {
                                setTwo[i] = number;
                            }
                        }
                    }
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

    public static void showSet() {

        if (lenSetOne > 0 && lenSetOne < 50) {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Set one: |");

            for (int i = 0; i < lenSetOne; i++) {
                System.out.print(setOne[i] + "|");
            }

            System.out.println();
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                  S E T   O N E   H A S E N ' T   D A T A");
        }

        if (lenSetTwo > 0 && lenSetTwo < 50) {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Set two: |");

            for (int i = 0; i < lenSetTwo; i++) {
                System.out.print(setTwo[i] + "|");
            }

            System.out.println();
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                  S E T   T W O   H A S E N ' T   D A T A");
        }

        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Set universal: |");

        for (int i = 0; i < lenSetUniversal; i++) {
            System.out.print(setUniversal[i] + "|");
        }

        System.out.println();
    }

    public static void insertSet() {

        String option;

        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                     1. Return");
            System.out.println("2. Insert set one                                           3. Insert set two");
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

                    if (lenSetOne < 50) {

                        int index = -1;

                        number = returnNumber("Enter number");

                        for (int i = 0; i < lenSetOne; i++) {

                            if (setOne[i] == number) {

                                index = i;
                                break;
                            }
                        }

                        if (index > -1) {

                            for (int i = lenSetOne; i > index; i--) {
                                setOne[i] = setOne[i - 1];
                            }

                            lenSetOne++;

                            boolean sw = true;

                            while (true) {

                                number = returnNumber("Enter new number");

                                for (int datum : setOne) {

                                    if (datum == number) {

                                        sw = false;
                                        break;
                                    }

                                    sw = true;
                                }

                                if (!sw) {
                                    System.out.println("-----------------------------------------------------------------------------");
                                    System.out.println("                  D A T A   A L R E A D Y   E X I S T S");
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------");
                                    System.out.println("                     N E W   N U M B E R   I N S E R T");
                                    setOne[index] = number;
                                    break;
                                }
                            }

                        } else {
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                   D A T A   D O E S N ' T   E X I S T");
                        }
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                    S E T   W I T H O U T   S P A C E");
                    }
                    break;
                }
                case "3" -> {

                    if (lenSetTwo < 50) {

                        int index = -1;

                        number = returnNumber("Enter number");

                        for (int i = 0; i < lenSetTwo; i++) {

                            if (setTwo[i] == number) {

                                index = i;
                                break;
                            }
                        }

                        if (index > -1) {

                            for (int i = lenSetTwo; i > index; i--) {
                                setTwo[i] = setTwo[i - 1];
                            }

                            lenSetTwo++;

                            boolean sw = true;

                            while (true) {

                                number = returnNumber("Enter new number");

                                for (int datum : setTwo) {

                                    if (datum == number) {

                                        sw = false;
                                        break;
                                    }

                                    sw = true;
                                }

                                if (!sw) {
                                    System.out.println("-----------------------------------------------------------------------------");
                                    System.out.println("                  D A T A   A L R E A D Y   E X I S T S");
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------");
                                    System.out.println("                     N E W   N U M B E R   I N S E R T");
                                    setTwo[index] = number;
                                    break;
                                }
                            }

                        } else {
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                   D A T A   D O E S N ' T   E X I S T");
                        }
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                    S E T   W I T H O U T   S P A C E");
                    }
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

    public static void deleteSet() {

        String option;

        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                     1. Return");
            System.out.println("2. Delete set one                                           3. Delete set two");
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

                    if (lenSetOne > 0) {

                        int index = -1;

                        number = returnNumber("Enter number");

                        for (int i = 0; i < lenSetOne; i++) {

                            if (setOne[i] == number) {

                                index = i;
                                break;
                            }
                        }

                        if (index > -1) {

                            for (int i = index; i < lenSetOne - 1; i++) {

                                setOne[i] = setOne[i + 1];
                            }
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                        D E L E T E   N U M B E R");
                            lenSetOne--;
                        } else {
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                   D A T A   D O E S N ' T   E X I S T");
                        }
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                  S E T   O N E   H A S E N ' T   D A T A");
                    }
                    break;
                }
                case "3" -> {

                    if (lenSetTwo > 0) {
                        int index = -1;

                        number = returnNumber("Enter number");

                        for (int i = 0; i < lenSetTwo; i++) {

                            if (setTwo[i] == number) {

                                index = i;
                                break;
                            }
                        }

                        if (index > -1) {
                            for (int i = index; i < lenSetTwo - 1; i++) {

                                setTwo[i] = setTwo[i + 1];
                            }
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                        D E L E T E   N U M B E R");
                            lenSetTwo--;
                        } else {
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                   D A T A   D O E S N ' T   E X I S T");
                        }
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                  S E T   T W O   H A S E N ' T   D A T A");
                    }
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

    public static void searchSet() {
    }

    public static void modifySet() {
    }

    public static void unionSet() {
    }

    public static void intersectionSet() {
    }

    public static void differenceSet() {
    }

    public static void complementSet() {
    }

}
