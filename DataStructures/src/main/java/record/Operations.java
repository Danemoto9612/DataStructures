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
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter id: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    person[lenPerson].id = datum;
                    sw = false;
                } else {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("You haven't entered id");
                }
            }
            datum = "";
            sw = true;

            while (sw) {
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter name: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    person[lenPerson].name = datum;
                    sw = false;
                } else {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("You haven't entered name");
                }
            }

            datum = "";
            sw = true;

            while (sw) {
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter lastname: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    person[lenPerson].lastName = datum;
                    sw = false;
                } else {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("You haven't entered lastname");
                }
            }

            datum = "";
            sw = true;

            while (sw) {
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter cellphone: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    person[lenPerson].cellPhone = datum;
                    sw = false;
                } else {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("You haven't entered cellphone");
                }
            }

            lenPerson++;
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("No more records can be entered");
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
            System.out.println("-----------------------------------------------------------");
            System.out.println("The record haven't data");
        }
    }

}
