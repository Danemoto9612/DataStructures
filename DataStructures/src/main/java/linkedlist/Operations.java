package linkedlist;

import java.util.Scanner;

public class Operations {

    static Node head = null;
    static Node queue = null;

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

    public static void createNewNode() {

        Node newNode = new Node();

        int datum;

        datum = returnNumber("Enter number");
        newNode.info = datum;

        newNode.link = head;
        
        if (head == null) {
            queue = newNode;
        }
        
        head = newNode;
    }

    public static void createNewNodeEnd() {
        
        int datum = returnNumber("Enter number");
        Node newNode = new Node();
        
        newNode.info = datum;
        newNode.link = null;
        
        if (head == null) {
            
            head = newNode;
        } else {
            queue.link = newNode;
        }
        
        queue = newNode;
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

            Node searcher = head;
            int datum;
            boolean sw = true;

            datum = returnNumber("Enter number");

            while (searcher != null && sw) {

                if (searcher.info == datum) {
                    int newDatum = returnNumber("Enter new number");
                    searcher.info = newDatum;
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                D A T A   H A S   B E E N   M O D I F I E D");
                    sw = false;
                } else {
                    searcher = searcher.link;
                }
            }

            if (sw) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("              D A T A   H A S N ' T   B E E N   M O D I F I E D");
            }
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void deleteNode() {

        if (head != null) {

            int datum;
            boolean sw = true;
            Node next = head.link;
            Node behind = head;

            datum = returnNumber("Enter number");

            if (head.info == datum) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                 D A T A   H A S   B E E N   D E L E T E D");
                head = head.link;
            } else {

                while (next != null && sw) {

                    if (next.info == datum) {
                        behind.link = next.link;
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                 D A T A   H A S   B E E N   D E L E T E D");
                        sw = false;
                    } else {
                        behind = next;
                        next = next.link;
                    }
                }
            }

            if (sw) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("              D A T A   H A S N ' T   B E E N   D E L E T E D");
            }
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void insertBeforeNode() {

        if (head != null) {
            
            int datum = returnNumber("Enter number");
            
            if (head.info == datum) {
                
                Node newNode = new Node();
                datum = returnNumber("Enter new number");
                
                newNode.info = datum;
                newNode.link = head;
                head = newNode;
            } else {
                
                Node searcher = head.link;
                Node previous = head;
                boolean sw = true;
                
                while (searcher != null && sw) {
                    
                    if (searcher.info == datum) {
                        
                        Node newNode = new Node();
                        
                        datum = returnNumber("Enter new number");
                        newNode.info = datum;
                        previous.link = newNode;
                        newNode.link = searcher;
                    } else {
                        searcher = searcher.link;
                        previous = previous.link;
                    }
                }
            }
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void insertAfterNode() {

        if (head != null) {

            int datum = returnNumber("Enter number");

            Node searcher = head;
            boolean sw = true;

            while (searcher != null && sw) {

                if (searcher.info == datum) {

                    Node newNode = new Node();

                    datum = returnNumber("Enter new number");
                    newNode.info = datum;
                    newNode.link = searcher.link;
                    searcher.link = newNode;
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                D A T A   H A S   B E E N   I N S E R T E D");
                    sw = false;
                } else {
                    searcher = searcher.link;
                }
            }

            if (sw) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("             D A T A   H A S N ' T   B E E N   I N S E R T E D");
            }
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void searchLargestNode() {

        if (head != null) {

            Node next = head.link;

            int largest = head.info;

            while (next != null) {

                if (next.info > largest) {

                    largest = next.info;
                } else {

                    next = next.link;
                }
            }

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Largest Node: " + largest);
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void searchSmallestNode() {

        if (head != null) {

            Node next = head.link;

            int smallest = head.info;

            while (next != null) {

                if (next.info < smallest) {

                    smallest = next.info;
                } else {

                    next = next.link;
                }
            }

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Largest Node: " + smallest);
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

}
