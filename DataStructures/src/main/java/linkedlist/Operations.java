package linkedlist;

import java.util.Scanner;

public class Operations {

    static Node head = null;
    static Node queue = null;

    static Scanner sc = new Scanner(System.in);

    // Retornar un valor entero
    // Función sólo para uso interno de la clase
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

    // Cuando se crea un nodo por el inicio se mueve la cabeza
    public static void createNewNode() {

        // Creación de un nuevo nodo
        Node newNode = new Node();

        // Retorno del dato y agregado al nuevo nodo
        int datum = returnNumber("Enter number");
        newNode.info = datum;

        // Enlace de la cabeza al nuevo nodo
        newNode.link = head;

        // Verificar que sea el primer nodo y posicionar el queue en ese nodo sin moverlo.
        if (head == null) {
            
            // Enlace de la cola con el nuevo nodo
            queue = newNode;
        }

        // Posicionar la cabeza en el nodo actual
        head = newNode;
    }

    // Cuando se crea un nodo por el final se mueve la cola
    public static void createNewNodeEnd() {

        // Creación de un nuevo nodo
        Node newNode = new Node();
        
        // Retorno del dato
        int datum = returnNumber("Enter number");

        // Agreado del dato al nuevo nodo y enlace a null
        newNode.info = datum;
        newNode.link = null;

        // Verificar que sea el primer nodo
        if (head == null) {

            // Posicionar la cabeza en el nuevo nodo
            head = newNode;
        } else {
            
            // Enlazar el link del nodo anterior con la dirección del nodo actual
            queue.link = newNode;
        }

        // Mover la cola al nodo actual
        queue = newNode;
    }

    // Muestra un nodo desde la cabeza hasta la cola
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
                System.out.println("Liga: " + shower.link);
                // Mover el puntero de desplazamiento entre nodos existentes
                shower = shower.link;
            }
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("            T H E R E ' R E   N O   N O D E S   C R E A T E D");
        }
    }

    // Busca y muestra un nodo y la dirección en memoria 
    public static void searchNode() {

        // Verificar que existan nodos
        if (head != null) {

            // Nodo para usar como puntero de desplazamiento
            Node searcher = head;
            // Variable lógica para parar el ciclo cuando encuentre el nodo buscado
            boolean sw = true;

            // Retorno de dato a buscar
            int datum = returnNumber("Enter number");

            // Ciclo para desplazarse por la lista ligada
            while (searcher != null && sw) {

                // Si existe el nodo buscado muestra el dato, la dirección y el enlace
                if (searcher.info == datum) {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Number: " + searcher.info);
                    System.out.println("Address: " + searcher);
                    // Parar el ciclo porque el dato buscado existe
                    sw = false;
                } else {
                    
                    // Mover el puntero de desplazamiento entre nodos existentes
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

    // Busca un nodo y modifica el dato en él
    public static void modifyNode() {

        // Verificar que existan nodos
        if (head != null) {

            // Nodo nuevo para buscar en la lista ligada
            Node searcher = head;
            // Variable lógica para parar el ciclo cuando encuentre el nodo buscado
            boolean sw = true;

            // Retorno de dato a buscar para modificar
            int datum = returnNumber("Enter number");

            // Ciclo para desplazarse por la lista ligada
            while (searcher != null && sw) {

                // Si existe el nodo buscado pide el nuevo dato y lo actualiza en el nodo
                if (searcher.info == datum) {
                    
                    int newDatum = returnNumber("Enter new number");
                    searcher.info = newDatum;
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                D A T A   H A S   B E E N   M O D I F I E D");
                    // Parar el ciclo porque el dato buscado existe
                    sw = false;
                } else {
                    
                    // Mover el puntero de desplazamiento entre nodos existentes
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

    // Borra un nodo y enlaza el anterior y el siguiente a el nodo
    public static void deleteNode() {

        // Verificar que existan nodos
        if (head != null) {

            // Nodos siguiente y anterior para desplazarse y enlazar
            Node next = head.link;
            Node behind = head;
            // Variable lógica para parar el ciclo cuando encuentre el nodo buscado
            boolean sw = true;

            // Retorno de dato a buscar para eliminar
            int datum = returnNumber("Enter number");

            // Verificar si el nodo buscado es la cabeza
            if (head.info == datum) {
                
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                 D A T A   H A S   B E E N   D E L E T E D");
                // Mover la cabeza al siquiente nodo
                head = head.link;
            } else {

                // Ciclo para desplazarse por la lista ligada
                while (next != null && sw) {

                    // Si existe el nodo buscado
                    if (next.info == datum) {
                        
                        // Enlaza por medio de los punteros siguiente y anterior 
                        behind.link = next.link;
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                 D A T A   H A S   B E E N   D E L E T E D");
                        // Parar el ciclo porque el dato buscado existe
                        sw = false;
                    } else {
                        
                        // Mover los punteros a los nodos siguientes
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

    // Inserta un nodo nuevo antes del nodo de referencia
    public static void insertBeforeNode() {

        // Verificar que existan nodos
        if (head != null) {

            // Retorno de dato a buscar para insertar nuevo nodo antes
            int datum = returnNumber("Enter number");

            // Verificar si el nodo buscado es la cabeza
            if (head.info == datum) {

                // Crear nuevo nodo
                Node newNode = new Node();
                
                // Retornar dato para el nuevo nodo
                datum = returnNumber("Enter new number");

                //Agregar dato al nuevo nodo
                newNode.info = datum;
                // Enlazar nuuevo nodo con la caebza
                newNode.link = head;
                // Mover cabeza al nuevo nodo
                head = newNode;
            } else {

                // Nodo buscador enlazado al nodo siguiente a la cabeza
                Node searcher = head.link;
                // Nodo  anterior enlazada al nodo cabeza
                Node previous = head;
                // Variable lógica para parar el ciclo cuando encuentre el nodo
                boolean sw = true;

                // Ciclo para desplazarse por la lista ligada
                while (searcher != null && sw) {

                    // Si existe el nodo
                    if (searcher.info == datum) {

                        // Crear nuevo nodo
                        Node newNode = new Node();

                        // Retornar nuevo dato
                        datum = returnNumber("Enter new number");
                        // Agregar nuevo dato al nodo nuevo
                        newNode.info = datum;
                        // Enlazar nodo anterior con el nuevo nodo
                        previous.link = newNode;
                        // Enlazar nodo nuevo con el nodo siguiente
                        newNode.link = searcher;
                        // Parar el ciclo porque el dato buscado existe
                        sw = false;
                    } else {
                        
                        // Mover punteros a los nodos siguientes
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

    // Inserta un nodo nuevo después del nodo de referencia
    public static void insertAfterNode() {

        // Verificar que existan nodos
        if (head != null) {

            // Retorno de dato a buscar para insertar nuevo nodo antes
            int datum = returnNumber("Enter number");

            // Nodo buscador
            Node searcher = head;
            // Variable lógica para parar el ciclo cuando encuentre el nodo
            boolean sw = true;

            // Ciclo para desplazarse por la lista ligada
            while (searcher != null && sw) {

                // Si existe el nodo
                if (searcher.info == datum) {

                    // Crear nuevo nodo
                    Node newNode = new Node();
                    // Retornar nuevo dato
                    datum = returnNumber("Enter new number");
                    // Agregar nuevo dato al nodo nuevo
                    newNode.info = datum;
                    // Enlazar el nuevo nodo al nodo siguiente al buscador
                    newNode.link = searcher.link;
                    // Enlazar el nodo buscador al nuevo nodo
                    searcher.link = newNode;
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                D A T A   H A S   B E E N   I N S E R T E D");
                    // Parar el ciclo porque el dato buscado existe
                    sw = false;
                } else {
                    
                    // Mover puntero al nodo siguiente
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

    // Buscar el dato mayor almacenado en la lista ligada
    public static void searchLargestNode() {

        // Verificar que existan nodos
        if (head != null) {

            // Nodo siguiente enlazado al nodo siguiente a la cabeza
            Node next = head.link;
            // Varibale que contiene el dato del nodo cabeza, usado como supuesto mayor dato
            int largest = head.info;

            // Ciclo para desplazarse por la lista ligada
            while (next != null) {

                // Verificar si el dato de siguiente es mayor que el dato de largest
                if (next.info > largest) {
                    
                    // Actualizar largest con el nuevo dato mayor
                    largest = next.info;
                } else {
                    
                    // Mover puntero al nodo siguiente
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

    // Buscar el dato menor almacenado en la lista ligada
    public static void searchSmallestNode() {

        // Verificar que existan nodos
        if (head != null) {

            // Nodo siguiente enlazado al nodo siguiente a la cabeza
            Node next = head.link;
            // Varibale que contiene el dato del nodo cabeza, usado como supuesto menor dato
            int smallest = head.info;
            
            // Ciclo para desplazarse por la lista ligada
            while (next != null) {

                // Verificar si el dato de siguiente es menor que el dato de smallest
                if (next.info < smallest) {

                    // Actualizar smallest con el nuevo dato menor
                    smallest = next.info;
                } else {

                    // Mover puntero al nodo siguiente
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
