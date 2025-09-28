package record;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    // Crea un vector de registros de tipo Person con un tamaño máximo de 50
    private static Person[] person = new Person[50];
    // Variable para controlar la posición actual del último registro y el tamaño lógico del vector
    private static int lenPerson = 0;

    // Agregar un nuevo registro de tipo persona
    public static void addPerson() {

        // Verificar que es posible agregar un nuevo registro
        if (lenPerson < 50) {
            
            // Crea un nuevo objeto persona en la posición lenPerson del vector
            person[lenPerson] = new Person();

            // Variable para pedir los datos a ingresar
            String datum = "";
            // Variable controlar y salir del ciclo
            boolean sw = true;

            // Ciclo para pedir dato id
            while (sw) {
                
                // Pedir y almacenar dato en datum
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter id: ");
                datum = sc.nextLine();
                // Verificar que el tamaño del dato sea correcta
                if (datum.length() > 0 && datum.length() <= 20) {
                    
                    // Agregar dato id en person.id
                    person[lenPerson].id = datum;
                    sw = false;
                } else {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                Y O U   H A V E N ' T   E N T E R E D   I D");
                }
            }
            // Vaciar datum
            datum = "";
            // Actualizar sw
            sw = true;

            // Ciclo para pedir dato name
            while (sw) {
                
                // Pedir y almacenar dato en datum
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter name: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    
                    // Agregar dato id en person.name
                    person[lenPerson].name = datum;
                    sw = false;
                } else {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("             Y O U   H A V E N ' T   E N T E R E D   N A M E");
                }
            }

            // Vaciar datum
            datum = "";
            // Actualizar sw
            sw = true;

            // Ciclo para pedir dato lastname
            while (sw) {
                
                // Pedir y almacenar dato en datum
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter lastname: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    
                    // Agregar dato id en person.lastname
                    person[lenPerson].lastName = datum;
                    sw = false;
                } else {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("          Y O U   H A V E N ' T   E N T E R E D   L A S T N A M E");
                }
            }

            // Vaciar datum
            datum = "";
            // Actualizar sw
            sw = true;

            // Ciclo para pedir dato cellphone
            while (sw) {
                
                // Pedir y almacenar dato en datum
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter cellphone: ");
                datum = sc.nextLine();
                if (datum.length() > 0 && datum.length() <= 20) {
                    
                    // Agregar dato id en person.cellphone
                    person[lenPerson].cellPhone = datum;
                    sw = false;
                } else {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("         Y O U   H A V E N ' T   E N T E R E D   C E L L P H O N E");
                }
            }

            // actualizar lenPerson con una posición extra
            lenPerson++;
            
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("          N O   M O R E   R E C O R D   C A N   B E   E N T E R E D");
        }
    }

    // Mostrar todos los registros almacenados en el vector person
    public static void showPersons() {

        // Verifica que el vector tenga registros
        if (lenPerson > 0) {
            
            // imprime en una tabla los registros almacenados
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
