package set;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    // Vector para trabajar como conjunto 1 con tamaño máximo de 50
    static int[] setOne = new int[50];
    // Vector para trabajar como conjunto 2 con tamaño máximo de 50
    static int[] setTwo = new int[50];
    // Vector para trabajar como conjunto complemento 1 con tamaño máximo de 50
    static int[] setOneC = new int[50];
    // Vector para trabajar como conjunto complemento 2 con tamaño máximo de 50
    static int[] setTwoC = new int[50];
    // Vector para trabajar como conjunto vacío
    static String[] setUniversalC = {"C O N J U N T O   V A C I O"};
    // Vector para trabajar como conjunto unión entre conjunto 1 y 2
    static int[] setUnion = new int[50];
    // Vector para trabajar como conjunto intersección entre conjunto 1 y 2
    static int[] setIntersection = new int[50];
    // Vector para trabajar como conjunto diferencia entre conjunto 1 y 2 ó 2 y 1
    static int[] setTDifference = new int[50];
    // Vector para trabajar como conjunto universal
    static final int[] setUniversal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    // Variables para controlar los tamaños lógicos de los conjuntos 1 y 2
    static int lenSetOne, lenSetTwo;
    // Variable para controlar el tamaño lógico del conjunto universal
    static final int lenSetUniversal = setUniversal.length;
    // variable para ingresar los datos a los conjuntos
    static int number;

    // Agregar tamaño de los conjuntos. Sólo para uso interno de la clase
    private static void addLenSet(String text, String option) {

        // Switch para controlar que conjunto
        switch (option) {

            // Tamaño del conjunto 1
            case "1" -> {

                // Variable para controlar y salir del ciclo
                boolean sw = true;

                // Ciclo para agregar dato
                while (sw) {

                    // Captura la excepción cuando el dato ingresado no sea del tipo válido
                    try {
                        
                        // Pide el tamaño del conjunto 1
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.print(text + ": ");
                        lenSetOne = sc.nextInt();
                        
                        // Verfica que el dato ingresado esté entre 1 y 49
                        if (lenSetOne > 0 && lenSetOne < 50) {
                            
                            // Si el tamaño es válido sale del ciclo
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
            // Tamaño del conjunto 2
            case "2" -> {

                boolean sw = true;

                while (sw) {

                    // Captura la excepción cuando el dato ingresado no sea del tipo válido
                    try {
                        
                        // Pide el tamaño del conjunto 2
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.print(text + ": ");
                        lenSetTwo = sc.nextInt();
                        
                        // Verfica que el dato ingresado esté entre 1 y 49
                        if (lenSetTwo > 0 && lenSetTwo < 50) {
                            
                            // Si el tamaño es válido sale del ciclo
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

    // Pedir y retornar un número. Sólo para uso interno de la clase
    private static int returnNumber(String text) {

        // Variable lógica para controlar y salir del ciclo
        boolean sw = true;

        // Ciclo para pedir dato
        while (sw) {

            // Captura la excepción en caso de que el dato ingresado no sea del tipo válido
            try {
                
                // Pide el dato
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print(text + ": ");
                number = sc.nextInt();
                // Sale del ciclo si el dato es válido
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

        // Variable para ingresar una opción
        String option;

        // Ciclo para controlar el menú de acciones sobre el llenado de los conjuntos
        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                       1. Return");
            System.out.println("2. Fill set one                                               3. Fill set two");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();
            
            // Switch para controlar la decisión tomada
            switch (option) {
                
                // Salir del programa desde este punto
                case "0" -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.exit(0);
                }
                // Retornar al menú anterior
                case "1" -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                <--- <--- <--- R E T U R N <--- <--- <---");
                    break;
                }
                // LLenar el conjunto 1
                case "2" -> {

                    // LLama al método interno y agrega un tamaño para el conjunto 1
                    addLenSet("Enter size set one", "1");
                    for (int i = 0; i < lenSetOne; i++) {

                        // Pide un número y lo agrega al conjunto
                        number = returnNumber("Enter number [" + (i + 1) + "]");
                        
                        // Si es el primer número lo agrega directamente
                        if (i == 0) {
                            
                            setOne[0] = number;
                        // Sino, debe entrar a verificar que el el número no esté ya en el conjunto
                        } else {

                            boolean sw = true;

                            for (int datum : setOne) {

                                if (datum == number) {
                                    
                                    sw = false;
                                    break;
                                }
                            }

                            // Si el número ya existe debe preguntar por un numero nuevamente para esa misma posición
                            if (!sw) {
                                
                                System.out.println("-----------------------------------------------------------------------------");
                                System.out.println("                  D A T A   A L R E A D Y   E X I S T S");
                                i--;
                            // Sino agrega el número ingresado    
                            } else {
                                
                                setOne[i] = number;
                            }
                        }
                    }
                    break;
                }
                // El conjunto 2 no tiene comentarios porque es lo mismo que el conjunto 1
                // Llenar el conjunto 2 
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
                // Permite mostrarle al usuairo que la opción ingresa es incorrecta
                default -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                       I N V A L I D   O P T I O N");
                    break;
                }
            }
        } while (!option.equals("1"));
    }

    public static void showSet() {

        // Verifica que el conjunto 1 tenga datos
        if (lenSetOne > 0 && lenSetOne < 50) {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Set one: |");

            // Muestra los datos almacenados en el conjunto 1
            for (int i = 0; i < lenSetOne; i++) {
                
                System.out.print(setOne[i] + "|");
            }

            System.out.println();
            
        } else {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                  S E T   O N E   H A S E N ' T   D A T A");
        }

        // Verifica que el conjunto 2 tenga datos
        if (lenSetTwo > 0 && lenSetTwo < 50) {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Set two: |");

            // Muestra los datos almacenados en el conjunto 2
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

        // Muestra los datos almacenados en el conjunto universal
        for (int i = 0; i < lenSetUniversal; i++) {
            
            System.out.print(setUniversal[i] + "|");
        }

        System.out.println();
    }

    public static void insertSet() {

        // Varaible para almacenar la opción escogida
        String option;

        // Ciclo para controlar el menú de acciones
        do {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                     1. Return");
            System.out.println("2. Insert set one                                           3. Insert set two");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();
            
            // Switch para controlar las opciones
            switch (option) {
                
                // Salir del programa desde este punto
                case "0" -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.exit(0);
                }
                case "1" -> {

                    // Retornar al menú anterior
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                <--- <--- <--- R E T U R N <--- <--- <---");
                    break;
                }
                // Insertar dato en el conjunto 1
                case "2" -> {

                    // Verifica que el conjunto 1 tenga datos
                    if (lenSetOne > 0 && lenSetOne < 50) {

                        // Variable usada para almacenar la posición del dato de referencia
                        int index = -1;

                        // Pide y almacena el dato de referencia
                        number = returnNumber("Enter number");

                        // Ciclo para buscar el dato de referencia
                        for (int i = 0; i < lenSetOne; i++) {

                            // Si el dato existe
                            if (setOne[i] == number) {

                                // Actualiza la variable index con la posición del dato buscado
                                index = i;
                                break;
                            }
                        }

                        // Condicional para determinar si el dato existe por medio de index
                        if (index > -1) {

                            // Ciclo para mover los datos y crear el espacio para el nuevo dato a insertar
                            for (int i = lenSetOne; i > index; i--) {
                                
                                setOne[i] = setOne[i - 1];
                            }

                            // Agregar un espacio extra en el conjunto 1
                            lenSetOne++;

                            // Varibale lógica para controlar y salir del ciclo
                            boolean sw = true;

                            // Ciclo para verificar si el dato nuevo ingresado ya existe en el conjunto
                            while (true) {

                                // Pide y almacena el nuevo dato
                                number = returnNumber("Enter new number");

                                // Ciclo para buscar el nuevo dato ingresado en el conjunto 1s
                                for (int datum : setOne) {

                                    // Verificar si el dato ingresado existe en el conjunto 1
                                    if (datum == number) {

                                        // Si el dato existe sale del ciclo for y actualiza sw en false
                                        sw = false;
                                        break;
                                    }

                                    sw = true;
                                }

                                // Si existe sw = false y muestra que no puede agregarse
                                if (!sw) {
                                    
                                    System.out.println("-----------------------------------------------------------------------------");
                                    System.out.println("                  D A T A   A L R E A D Y   E X I S T S");
                                // Sino sw = true e inserta el nuevo dato en la posición de referencia
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
                        System.out.println("                 S E T   O N E   W I T H O U T   S P A C E");
                        System.out.println("                                     O R");
                        System.out.println("                  S E T   O N E   H A S E N ' T   D A T A");
                    }
                    
                    break;
                }
                // El conjunto 2 no tiene comentarios porque es lo mismo que el conjunto 1
                // Insertar dato en el conjunto 2
                case "3" -> {

                    if (lenSetTwo > 0 && lenSetTwo < 50) {

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
                        System.out.println("                 S E T   T W O   W I T H O U T   S P A C E");
                        System.out.println("                                     O R");
                        System.out.println("                  S E T   T W O   H A S E N ' T   D A T A");
                    }
                    break;
                }
                // Permite mostrarle al usuario que la opción ingresada es inválida
                default -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                       I N V A L I D   O P T I O N");
                    break;
                }
            }
        } while (!option.equals("1"));
    }

    public static void deleteSet() {

        // Variable para almacenar la opción escogida
        String option;

        // Ciclo para controlar el menú de acciones
        do {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                     1. Return");
            System.out.println("2. Delete set one                                           3. Delete set two");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();
            
            // Switch para controlar las opciones
            switch (option) {
                
                // Salir del programa desde este punto
                case "0" -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.exit(0);
                }
                // Retornar al menú anterior
                case "1" -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                <--- <--- <--- R E T U R N <--- <--- <---");
                    break;
                }
                // Eliminar dato existente en el conjunto 1
                case "2" -> {

                    // Verificar que el conjunto 1 tenga datos
                    if (lenSetOne > 0) {

                        // Varibale para almacenar la posición del dato de referencia
                        int index = -1;

                        // Pedir y almacenar el dato a buscar para eliminar
                        number = returnNumber("Enter number");

                        // Ciclo para buscar el dato
                        for (int i = 0; i < lenSetOne; i++) {

                            // Verificar si el dato existe
                            if (setOne[i] == number) {

                                // Actualizar variable index con la posición del dato buscado
                                index = i;
                                break;
                            }
                        }

                        // Si index es diferente de -1 el dato existe 
                        if (index > -1) {

                            // Mover lo datos para eliminar el dato buscado
                            for (int i = index; i < lenSetOne - 1; i++) {

                                setOne[i] = setOne[i + 1];
                            }
                            
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                        D E L E T E   N U M B E R");
                            // Restar un espacio en el conjunto
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
                // El conjunto 2 no tiene comentarios porque es lo mismo que el conjunto 1
                // Eliminar dato existente en el conjunto 2
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
                // Permite mostrarle al usuairo que la opción ingresa es incorrecta
                default -> {

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                       I N V A L I D   O P T I O N");
                    break;
                }
            }
        } while (!option.equals("1"));
    }

    public static void searchSet() {

        // Variable para almacenar la opción escogida
        String option;

        // Ciclo para controlar el menú de acciones
        do {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                     1. Return");
            System.out.println("2. Search set one                                           3. Search set two");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();
            
            // Switch para controlar las opciones
            switch (option) {
                
                // Salir del programa desde este punto
                case "0" -> {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.exit(0);
                }
                // Retornar la menú anterior
                case "1" -> {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                <--- <--- <--- R E T U R N <--- <--- <---");
                    break;
                }
                // Buscar en el conjunto 1
                case "2" -> {

                    // Verificar que el conjunto 1 tenga datos
                    if (lenSetOne > 0) {

                        // Variable para almacenar la posición del dato buscado
                        int index = -1;

                        // Pedir y almacenar dato a buscar
                        number = returnNumber("Enter number");

                        // Ciclo para buscar el dato ingresado
                        for (int i = 0; i < lenSetOne; i++) {

                            // Verificar si el dato buscado existe
                            if (setOne[i] == number) {

                                // Actualizar el valor de index con la posición del dato buscado
                                index = i;
                                break;
                            }
                        }

                        // Si index es diferente de -1 el dato existe 
                        if (index > -1) {
                            
                            // Imprimir el dato con su posición dentro del conjunto 1
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("|Datum: [" + number + "] index: [" + index + "]|");
                        } else {
                            
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                   D A T A   D O E S N ' T   E X I S T");
                        }
                    } else {
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                  S E T   O N E   H A S E N ' T   D A T A");
                    }
                }
                // El conjunto 2 no tiene comentarios porque es lo mismo que el conjunto 1
                // Buscar dato existente en el conjunto 2
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
                            
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("|Datum: [" + number + "] index: [" + index + "]|");
                        } else {
                            
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                   D A T A   D O E S N ' T   E X I S T");
                        }
                    } else {
                        
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                  S E T   O N E   H A S E N ' T   D A T A");
                    }
                }
                // Permite mostrarle al usuairo que la opción ingresa es incorrecta
                default -> {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                       I N V A L I D   O P T I O N");
                    break;
                }
            }
        } while (!option.equals("1"));
    }

    public static void modifySet() {

        // Variable para almacenar la opción escogida
        String option;

        // Ciclo para controlar el menú de acciones
        do {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                     1. Return");
            System.out.println("2. Modify set one                                           3. Modify set two");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();
            
            // Ciclo para controlar las opciones
            switch (option) {
                
                // Salir del programa desde este punto
                case "0" -> {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.exit(0);
                }
                // Retornar al menú anterior
                case "1" -> {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                <--- <--- <--- R E T U R N <--- <--- <---");
                    break;
                }
                // Modificar dato en el conjunto 1
                case "2" -> {
                    
                    // Verifica si el conjunto tiene datos
                    if (lenSetOne > 0) {

                        // Variable para almacenar la posición del dato buscado
                        int index = -1;

                        // Pide y almacena el dato a buscar
                        number = returnNumber("Enter number");

                        // Ciclo para buscar el dato
                        for (int i = 0; i < lenSetOne; i++) {
                            
                            // Verifica si el dato existe
                            if (setOne[i] == number) {
                                
                                // Actualiza el valor de index con la posición del dato buscado
                                index = i;
                                break;
                            }
                        }

                        // Si index es diferente de -1 el dato existe
                        if (index > -1) {

                            // Variable lógica para controlar y salir del ciclo
                            boolean sw = true;

                            // Ciclo para pedir el nuevo dato para modificar el anterior
                            while (true) {
                                
                                // Pide y almacena el nuevo dato
                                number = returnNumber("Enter new number");
                                
                                // Ciclo para verificar si el dato ingresado ya existe en el conjutno
                                for (int datum : setOne) {
                                    
                                    // Verifica si el dato ya existe en el conjunto
                                    if (datum == number) {
                                        
                                        // Si el dato existe actualiza el valor de sw a false
                                        sw = false;
                                        break;
                                    }
                                }

                                // Si sw = true actualiza el nuevo dato
                                if (sw) {
                                    
                                    System.out.println("-----------------------------------------------------------------------------");
                                    System.out.println("                        N E W   N U M B E R   A D D");
                                    setOne[index] = number;
                                    break;
                                // Sino, el dato ya existe y debe ingresar un nuevo dato
                                } else {
                                    
                                    System.out.println("-----------------------------------------------------------------------------");
                                    System.out.println("                  D A T A   A L R E A D Y   E X I S T S");
                                    sw = true;
                                }
                            }
                        } else {
                            
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                   D A T A   D O E S N ' T   E X I S T");
                        }
                    } else {
                        
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                  S E T   O N E   H A S E N ' T   D A T A");
                    }
                }
                // El conjunto 2 no tiene comentarios porque es lo mismo que el conjunto 1
                // Modificar dato en el conjunto 2
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

                            boolean sw = true;

                            while (true) {
                                
                                number = returnNumber("Enter new number");
                                
                                for (int datum : setTwo) {
                                    
                                    if (datum == number) {
                                        
                                        sw = false;
                                        break;
                                    }
                                }

                                if (sw) {
                                    
                                    System.out.println("-----------------------------------------------------------------------------");
                                    System.out.println("                        N E W   N U M B E R   A D D");
                                    setTwo[index] = number;
                                    break;
                                } else {
                                    
                                    System.out.println("-----------------------------------------------------------------------------");
                                    System.out.println("                  D A T A   A L R E A D Y   E X I S T S");
                                    sw = true;
                                }
                            }
                        } else {
                            
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("                   D A T A   D O E S N ' T   E X I S T");
                        }
                    } else {
                        
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                  S E T   T W O   H A S E N ' T   D A T A");
                    }
                }
                // Permite mostrarle al usuairo que la opción ingresa es incorrecta
                default -> {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                       I N V A L I D   O P T I O N");
                    break;
                }
            }
            
        } while (!option.equals("1"));
    }

    public static void unionSet() {
        
        if (lenSetOne > 0 && lenSetTwo > 0) {
            
            for (int i = 0; i < lenSetOne; i++) {
                
                setUnion[i] = setOne[i];
            }
            
            int lenSetUnion = setUnion.length;
            
            for (int i = lenSetUnion; i < (lenSetOne + lenSetTwo); i++) {
                
                for (int datum : setUnion) {
                    
                    if (datum == setTwo[i]) {
                        
                        break;
                    }
                }
            }
        }
    }

    public static void intersectionSet() {
    }

    public static void differenceSet() {
    }

    public static void complementSet() {
    }
}
