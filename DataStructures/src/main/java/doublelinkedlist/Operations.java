package doublelinkedlist;

import java.util.Scanner;

public class Operations {

    static Node head = null;
    static Node queue = null;

    static Scanner sc = new Scanner(System.in);

    // Retornar dato. Sólo para uso interno de la clase
    private static int returnNumber(String text) {

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

    public static void createNewNode() {

        Node newNode = new Node();

        int number = returnNumber("Enter number");

        newNode.info = number;
        newNode.lLink = null;
        newNode.rLink = head;

        if (head == null) {

            queue = newNode;
        } else {

            head.lLink = newNode;
        }

        head = newNode;
    }

    public static void createNewNodeEnd() {

        Node newNode = new Node();

        int number = returnNumber("Enter number");

        newNode.info = number;
        newNode.rLink = null;
        newNode.lLink = queue;

        if (head == null) {

            head = newNode;
        } else {

            queue.rLink = newNode;
        }

        queue = newNode;
    }

    public static void showNodes() {

        // Verificar que existan nodos
        if (head != null) {

            /* Crear un nuevo nodo y enlazarlo a la cabeza para usarlo como puntero 
            de desplazamieto por la lista ligada */
            Node shower = head;

            // Ciclo para recorrer la lista ligada y parar cuando no haya más nodos
            while (shower != null) {

                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Dato: " + shower.info);
                System.out.println("Dirección: " + shower);
                System.out.println("Liga izquierda: " + shower.lLink);
                System.out.println("Liga derecha: " + shower.rLink);
                // Mover el puntero de desplazamiento entre nodos existentes
                shower = shower.rLink;
            }
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    public static void searchNode() {
    }

    public static void modifyNode() {
    }

    public static void deleteNode() {
    }

    public static void insertBeforeNode() {
    }

    public static void insertAfterNode() {
    }

    public static void searchLargestNode() {
    }

    public static void searchSmallestNode() {
    }
}
