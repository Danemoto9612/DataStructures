package record;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    private static Person[] person = new Person[50];
    private static int lenPerson = 0;

    public static void addPerson() {

        if (lenPerson < 50) {
            person[lenPerson] = new Person();

            String datum = "";
            boolean sw = true;

            while (sw) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter id: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    person[lenPerson].id = datum;
                    sw = false;
                } else {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                Y O U   H A V E N ' T   E N T E R E D   I D");
                }
            }
            datum = "";
            sw = true;

            while (sw) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter name: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    person[lenPerson].name = datum;
                    sw = false;
                } else {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("             Y O U   H A V E N ' T   E N T E R E D   N A M E");
                }
            }

            datum = "";
            sw = true;

            while (sw) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter lastname: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    person[lenPerson].lastName = datum;
                    sw = false;
                } else {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("          Y O U   H A V E N ' T   E N T E R E D   L A S T N A M E");
                }
            }

            datum = "";
            sw = true;

            while (sw) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter cellphone: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    person[lenPerson].cellPhone = datum;
                    sw = false;
                } else {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("         Y O U   H A V E N ' T   E N T E R E D   C E L L P H O N E");
                }
            }

            lenPerson++;
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("          N O   M O R E   R E C O R D   C A N   B E   E N T E R E D");
        }
    }

    public static void showPersons() {

        if (lenPerson > 0) {
            System.out.println("+-----+----------+-----------+--------+----------+");
            System.out.println("| Id  |  Nombre  | Apellido  |  Edad  |  Estudia |");
            System.out.println("+-----+----------+-----------+--------+----------+");
            for (int i = 0; i < lenPerson; i++) {
                System.out.println("| "
                        + person[i].id + " | "
                        + person[i].name + " | "
                        + person[i].lastName + " | "
                        + person[i].cellPhone + " | ");
            }
            System.out.println("+-----+----------+-----------+--------+----------+");
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("               T H E   R E C O R D   H A S E N ' T   D A T A");
        }
    }

}
