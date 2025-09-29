package circularlinkedlist;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    static Node head = null;
    static Node queue = null;

    // Retornar dato. Sólo para uso interno de la clase
    public static int returnNumber(String text) {

        int number = 0;
        boolean sw = true;

        // Ciclo para veficar que se ingrese un tipo de dato válido
        while (sw) {

            // Controlar excepciones al entrar datos de tipo no entero
            try {

                System.out.println("-----------------------------------------------------------------------------");
                System.out.print(text + ": ");
                number = sc.nextInt();
                // Finalizar ciclo cuando el dato ingresado sea válido
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

    // Crear un nuevo nodo por el inicio
    public static void createNewNode() {

        // Crear nuevo nodo
        Node newNode = new Node();

        // pedir y almacenar dato para el nuevo nodo
        int number = returnNumber("Enter number");

        // Agregar dato al nuevo nodo
        newNode.info = number;

        // Poner el enlace del nuevo nodo al anterior
        newNode.link = head;

        // Verificar si es el primer nodo y poner la cola en ese nodo
        if (head == null) {

            queue = newNode;
        } else {

            // Enlazar la cola con el nodo cabeza y hacerla circular
            queue.link = newNode;
        }

        // Mover la cabeza al nuevo nodo
        head = newNode;
    }

    // Crear un nuevo nodo por el final
    public static void createNewNodeEnd() {

        Node newNode = new Node();

        int number = returnNumber("Enter number");

        newNode.info = number;
        newNode.link = head;

        if (head == null) {

            head = newNode;
        } else {

            queue.link = newNode;
        }

        queue = newNode;
    }

    // Mostrar los nodos creados
    public static void showNodes() {

        // Verificar que existan nodos
        if (head != null) {

            /* Crear un nuevo nodo y enlazarlo a la cabeza para usarlo como puntero 
            de desplazamieto por la lista ligada */
            Node shower = head;

            // Ciclo para recorrer la lista ligada y parar cuando no haya más nodos
            while (shower != queue) {

                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Dato: " + shower.info);
                System.out.println("Dirección: " + shower);
                System.out.println("Liga: " + shower.link);
                // Mover el puntero de desplazamiento entre nodos existentes
                shower = shower.link;
            }
            // Muestra el último nodo de la lista ligada circularmente
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Dato: " + queue.info);
            System.out.println("Dirección: " + queue);
            System.out.println("Liga: " + queue.link);
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void searchNode() {

        if (head != null) {

            Node searcher = head;
            boolean sw = true;

            int number = returnNumber("Enter number");

            if (searcher.info == number) {

                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Number: " + searcher.info);
                System.out.println("Address: " + searcher);
            } else {

                searcher = searcher.link;

                while (searcher != head && sw) {

                    if (searcher.info == number) {

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
            }
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void modifyNode() {

        if (head != null) {

            Node searcher = head;
            boolean sw = true;

            int number = returnNumber("Enter number");

            if (searcher.info == number) {

                number = returnNumber("Enter new number");
                searcher.info = number;
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                D A T A   H A S   B E E N   M O D I F I E D");
            } else {

                searcher = searcher.link;

                while (searcher != head && sw) {

                    if (searcher.info == number) {

                        number = returnNumber("Enter new number");
                        searcher.info = number;
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                D A T A   H A S   B E E N   M O D I F I E D");
                        sw = false;
                    } else {

                        searcher = searcher.link;
                    }
                }

                if (sw) {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                   N O D E   D O E S N ' T   E X I S T");
                }
            }
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void deleteNode() {

        if (head != null) {

            Node searcher;
            Node previous;

            int number = returnNumber("Enter number");

            if (head.info == number) {

                head = head.link;
                queue.link = head;
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                 D A T A   H A S   B E E N   D E L E T E D");
            }

            if (queue.info == number) {

                boolean sw = true;
                searcher = head.link;
                previous = head;

                while (searcher != null && sw) {

                    if (searcher.info == number) {

                        queue = previous;
                        previous = searcher.link;
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                 D A T A   H A S   B E E N   D E L E T E D");
                        sw = false;
                    } else {

                        previous = previous.link;
                        searcher = searcher.link;
                    }
                }

                if (sw) {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("              D A T A   H A S N ' T   B E E N   D E L E T E D");
                }
            } else {

                searcher = head.link;
                previous = head;
                boolean sw = true;

                while (searcher != null && sw) {

                    if (searcher.info == number) {

                        previous.link = searcher.link;
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                 D A T A   H A S   B E E N   D E L E T E D");
                        sw = false;
                    } else {

                        previous = previous.link;
                        searcher = searcher.link;
                    }
                }

                if (sw) {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("              D A T A   H A S N ' T   B E E N   D E L E T E D");
                }
            }

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
}
