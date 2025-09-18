package linkedlist;

import java.util.Scanner;

public class Operations {

    static Node head;

    public Operations() {

        head = null;
    }

    static Scanner sc = new Scanner(System.in);

    public static int returnNumber(String text) {

        int number = 0;
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

    public static void createdNewNode() {

        Node newNode = new Node();

        int datum;

        datum = returnNumber("Enter number");
        newNode.info = datum;

        newNode.link = head;
        head = newNode;
    }

    public static void showNodes() {

        if (head != null) {

            Node p = head;

            while (p != null) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Dato: " + p.info);
                System.out.println("Dirección: " + p);
                System.out.println("Liga: " + p.link);
                p = p.link;
            }
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void searchNode() {

        if (head != null) {
            
            boolean sw = true;
            Node searcher = head;
            
            int datum = returnNumber("Enter number");
            
            while (searcher != null && sw) {
                if (searcher.info == datum) {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Number: " + searcher.info);
                    System.out.println("Address: " + searcher);
                    sw = false;
                } else {
                    searcher = searcher.link;
                }
            }
            
            if (sw) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                   N O D E   D O E S N ' T   E X I S T");
            }
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void modifyNode() {

        if (head != null) {

        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void deleteNode() {

        if (head != null) {

        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void insertBeforeNode() {

        if (head != null) {

        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void insertAfterNode() {

        if (head != null) {

        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void searchLargestNode() {

        if (head != null) {

        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void searchSmallestNode() {

        if (head != null) {

        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

}
