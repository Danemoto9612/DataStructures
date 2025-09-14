package linkedlist;

import java.util.Scanner;

public class Operations {

    static Node head;

    public Operations() {

        head = null;
    }

    static Scanner sc = new Scanner(System.in);

    public static void createdNewNode() {

        Node newNode = new Node();

        int datum;
        boolean sw = true;

        while (sw) {
            try {
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter number: ");
                datum = sc.nextInt();
                newNode.info = datum;
                sc.nextLine();
                sw = false;
            } catch (Exception e) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("                  I N V A L I D   T Y P E");
                sc.nextLine();
            }
        }

        newNode.link = head;
        head = newNode;
    }

    public static void showNodes() {

        if (head != null) {

            Node p = head;

            while (p != null) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Dato: " + p.info);
                System.out.println("Dirección: " + p);
                System.out.println("Liga: " + p.link);
                p = p.link;
            }
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("There're no nodes created");
        }
    }

}
