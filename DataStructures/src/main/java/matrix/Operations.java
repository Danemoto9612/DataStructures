package matrix;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    static int[][] matrix = new int[20][20];
    static int lenRow = 0, lenColumn = 0;

    // LLenar la matriz
    public static void fill() {

        boolean swRaw = true;
        boolean swColumn = true;

        // Pedir tamaño de las filas y verificar que sea un tamaño y tipo válido.
        while (swRaw) {
            
            // Captura la excepción cuando el dato ingresado no sea del tipo válido
            try {
                
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter raw length: ");
                lenRow = sc.nextInt();
                sc.nextLine();
                
                if (lenRow > 0 && lenRow < 20) {
                    
                    // Si el tamaño de las filas es válido sale del ciclo
                    swRaw = false;
                } else {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                      S I Z E   R A W   L E S S   2 0");
                }
            } catch (Exception e) {
                
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                         I N V A L I D   T Y P E");
                sc.nextLine();
            }
        }

        // Pedir tamaño de las columnas y verificar que sea un tamaño y tipo válido.
        while (swColumn) {
            
            // Captura la excepción cuando el dato ingresado no sea del tipo válido
            try {
                
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter column length: ");
                lenColumn = sc.nextInt();
                sc.nextLine();
                
                if (lenColumn > 0 && lenColumn < 20) {
                    
                    // Si el tamaño de las columnas es válido sale del ciclo
                    swColumn = false;
                } else {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                    S I Z E   C O L U M N   L E S S   2 0");
                }
            } catch (Exception e) {
                
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                         I N V A L I D   T Y P E");
                sc.nextLine();
            }
        }

        // LLenado autónomo de la matriz
        for (int i = 0; i < lenRow; i++) {
            
            for (int j = 0; j < lenColumn; j++) {
                
                // Usa el random para ingresar un valor entre 0 - 100 a las posiciones de la matriz
                matrix[i][j] = (int) (Math.random() * 101);
            }
        }
    }

    // Mostrar los datos existentes en la matriz
    public static void show() {

        // Verificar que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {
            
            // Bucle para mostrar la matriz
            System.out.println("-----------------------------------------------------------------------------");
            for (int i = 0; i < lenRow; i++) {
                
                for (int j = 0; j < lenColumn; j++) {
                    
                    // Muestra cada uno de los datos de la matriz organizados con espacios
                    System.out.print(matrix[i][j] + " ");
                }
                
                System.out.println();
            }
            
            System.out.println();
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    // Buscar un dato existente en la matriz
    public static void search() {

        // Variable lógica usada para controlar y parar el ciclo
        boolean sw = true;
        // Variable para almacenar el dato buscado
        int search = 0;
        // Variable para almacenar la posicion del dato en las filas
        int indexRaw = -1;
        // Variable para almacenar la posicion del dato en las columnas
        int indexColumn = -1;

        // Verifica que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {
            
            // Pedir y verificar tipo válido
            while (sw) {
                
                // Captura la excepción cuando el dato ingresado no sea del tipo válido
                try {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter search number: ");
                    search = sc.nextInt();
                    sc.nextLine();
                    // Sale del ciclo cuando el tipo de dato sea correcto
                    sw = false;
                } catch (Exception e) {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Recorres las filas
            for (int i = 0; i < lenRow; i++) {
                
                // Recorre las columnas
                for (int j = 0; j < lenColumn; j++) {
                    
                    // Verifica si es el dato buscado
                    if (matrix[i][j] == search) {
                        
                        // Cuando lo encuentra agrega la posición de fila y columna respectivamente
                        indexRaw = i;
                        indexColumn = j;
                    }
                }
            }

            // Definir si el dato existe o no
            if (indexRaw > -1 && indexColumn > -1) {
                
                // Mostrado del dato con sus respectivas posciones en fila y columna 
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("|Datum: [" + search + "] index: [" + indexRaw + "][" + indexColumn + "] |");
            } else {
                
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                   D A T A   D O E S N ' T   E X I S T");
            }
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    // Buscar y modifica un dato existente
    public static void modify() {

        // Variable lógica usada para controlar y parar el ciclo
        boolean sw = true;
        // Variable para almacenar el dato buscado
        int search = 0;
        // Variable para almacenar la posicion del dato en las filas
        int indexRaw = -1;
        // Variable para almacenar la posicion del dato en las columnas
        int indexColumn = -1;

        // Verifica que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {
            
            // Pedir y verificar tipo válido
            while (sw) {
                
                // Captura la excepción cuando el dato ingresado no sea del tipo válido
                try {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter search number: ");
                    search = sc.nextInt();
                    sc.nextLine();
                    // Sale del ciclo cuando el tipo de dato sea correcto
                    sw = false;
                } catch (Exception e) {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Recorres las filas
            for (int i = 0; i < lenRow; i++) {
                
                // Recorres las columnas
                for (int j = 0; j < lenColumn; j++) {
                    
                    // Verifica si es el dato buscado
                    if (matrix[i][j] == search) {
                        
                        // Cuando lo encuentra agrega la posición de fila y columna respectivamente
                        indexRaw = i;
                        indexColumn = j;
                    }
                }
            }

            // Definir si el dato existe o no
            if (indexRaw > -1 && indexColumn > -1) {
                
                // Pide el nuevo dato
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter new number: ");
                // Lo actualiza en la matriz en la posición de fila y columna del viejo dato
                matrix[indexRaw][indexColumn] = sc.nextInt();
                sc.nextLine();
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                        N E W   N U M B E R   A D D");
            } else {
                
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                   D A T A   D O E S N ' T   E X I S T");
            }
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    // Insertar una fila entre medio de otras
    public static void insertRaw() {

        // Verifica que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {

            // Variable lógica para controlar y salir del ciclo
            boolean sw = true;
            // Variable para almacenar la fila de referencia
            int insertRaw = 0;

            //Pedir y verificar fila para insertar
            while (sw) {
                
                // Captura la excepción cuando el dato ingresado no sea del tipo correcto
                try {
                    
                    // Pide el número de la fila como refencia para insertar una nueva
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter raw to insert: ");
                    insertRaw = sc.nextInt();
                    sc.nextLine();
                    
                    if (insertRaw < lenRow) {
                        
                        // Sale del ciclo cuando el número de la fila sea válido
                        sw = false;
                    } else {
                        
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                       I N D E X   R A W   E R R O R");
                    }
                } catch (Exception e) {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            //Mover fila y agregar nueva
            for (int i = lenRow; i > insertRaw; i--) {
                
                // Mueve las filas para hacer espacio para la nueva
                for (int j = 0; j < lenColumn; j++) {
                    
                    matrix[i][j] = matrix[i - 1][j];
                }
            }
            
            // Suma una fila extra a la matriz
            lenRow++;

            // Agregar valores a la nueva fila
            for (int j = 0; j < lenColumn; j++) {
                
                matrix[insertRaw][j] = (int) (Math.random() * 101);
            }
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    // Insertar una columna entre medio de otras
    public static void insertColumn() {

        // Verifica que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {

            // Variable lógica para controlar y salir del ciclo
            boolean sw = true;
            // Variable para almacenar la columna de referencia
            int insertColumn = 0;

            //Pedir y verificar columna para insertar
            while (sw) {
                
                // Captura la excepción cuando el dato ingresado no sea del tipo válido
                try {
                    
                    // Pide la columna de referencia
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter column to insert: ");
                    insertColumn = sc.nextInt();
                    sc.nextLine();
                    
                    if (insertColumn < lenColumn) {
                        
                        // Sale del ciclo cuando el número de la columna sea válido
                        sw = false;
                    } else {
                        
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                    I N D E X   C O L U M N   E R R O R");
                    }
                } catch (Exception e) {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            //Mover columna y agregar nueva
            for (int i = 0; i < lenRow; i++) {
                
                // Mueve las columnas para hacer espacio para la nueva
                for (int j = lenColumn; j > insertColumn; j--) {
                    
                    matrix[i][j] = matrix[i][j - 1];
                }
            }
            
            // Suma una columna extra a la matriz
            lenColumn++;

            // Agregar valores a la nueva columna
            for (int i = 0; i < lenRow; i++) {
                
                matrix[i][insertColumn] = (int) (Math.random() * 101);
            }
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    // Borrar una fila
    public static void deleteRaw() {

        // Verificar que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {

            // Variable lógica para controlar y salir del ciclo
            boolean sw = true;
            // Variable para guardar la fila de referencia
            int deleteRaw = 0;

            //Pedir y verificar fila para borrar
            while (sw) {
                
                // Captura la excepción cuando el dato ingresado no sea del tipo válido
                try {
                    
                    // Pide la columna para borrar
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter raw to delete: ");
                    deleteRaw = sc.nextInt();
                    sc.nextLine();
                    
                    if (deleteRaw < lenRow) {
                        
                        // Si la fila ingresada es válida sale del ciclo
                        sw = false;
                    } else {
                        
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                       I N D E X   R A W   E R R O R");
                    }
                } catch (Exception e) {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Borrar fila
            for (int i = deleteRaw; i < lenRow - 1; i++) {
                
                // Mueve las filas para eliminar la fila deseada
                for (int j = 0; j < lenColumn; j++) {
                    
                    matrix[i][j] = matrix[i + 1][j];
                }
            }
            
            // Resta una fila a la matriz
            lenRow--;
            
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    // Borrar una columna
    public static void deleteColumn() {

        // Verifica que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {

            // Variable lógica para controlar y salir del ciclo
            boolean sw = true;
            // Variable para almacenar la columna de referencia
            int deleteColumn = 0;

            //Pedir y verificar fila para borrar
            while (sw) {
                
                // Captura la excepción cuando el dato ingresado no sea del tipo válido
                try {
                    
                    // Pide la columna
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter column to delete: ");
                    deleteColumn = sc.nextInt();
                    sc.nextLine();
                    
                    if (deleteColumn < lenColumn) {
                        
                        // Si la columna ingresada es válida sale del ciclo
                        sw = false;
                    } else {
                        
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                    I N D E X   C O L U M N   E R R O R");
                    }
                } catch (Exception e) {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Borrar columna
            for (int i = 0; i < lenRow; i++) {
                
                // Mueve las columnas para eliminar la columna deseada
                for (int j = deleteColumn; j < lenColumn - 1; j++) {
                    
                    matrix[i][j] = matrix[i][j + 1];
                }
            }
            
            // Resta una columna a la matriz
            lenColumn--;
            
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    // Imprimir una fila específica
    public static void printRaw() {

        // Verificar que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {

            // Variable lógica para controlar y salir del ciclo
            boolean sw = true;
            // variable para almacenar la fila de referencia
            int printRaw = 0;

            // Pedir y verificar fila para imprimir
            while (sw) {
                
                // Captura la excepción cuando el dato ingresado no sea del tipo válido
                try {
                    
                    // Pide la fila de referencia
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter raw to print: ");
                    printRaw = sc.nextInt();
                    sc.nextLine();
                    
                    if (printRaw < lenRow) {
                        
                        // Si la fila es válida sale del ciclo
                        sw = false;
                    } else {
                        
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                       I N D E X   R A W   E R R O R");
                    }
                } catch (Exception e) {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Imprimir fila
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Raw: |");
            for (int j = 0; j < lenColumn; j++) {
                
                System.out.print(matrix[printRaw][j] + "|");
            }
            
            System.out.println();
            
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    // Imprimir una columna específica
    public static void printColumn() {

        // Verifica que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {
            
            // Variable lógica para controlar y salir del ciclo
            boolean sw = true;
            // variable para almacenar la columna de referencia
            int printColumn = 0;

            // Pedir y verificar fila para imprimir
            while (sw) {
                
                // Captura la excepción cuando el dato ingresado no es del tipo válido
                try {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter column to print: ");
                    printColumn = sc.nextInt();
                    sc.nextLine();
                    
                    if (printColumn < lenColumn) {
                        
                        // Si la fila ingresada es válida sale del ciclo
                        sw = false;
                    } else {
                        
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                    I N D E X   C O L U M N   E R R O R");
                    }
                } catch (Exception e) {
                    
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Imprimir fila
            System.out.println("-----------------------------------------------------------------------------");
            for (int i = 0; i < lenRow; i++) {
                
                System.out.println(matrix[i][printColumn]);
            }
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    // Imprimir la diagonal principal
    public static void printMainDiagonal() {

        // Verifica que la matriz tenga datos y que sea cuadrada m = n
        if (lenRow > 0 && lenColumn > 0 && lenRow == lenColumn) {

            // Variable para controlar la posición de la siguiente impresión
            String space = "";

            // Imprimir diagonal principal
            System.out.println("-----------------------------------------------------------------------------");
            for (int i = 0; i < lenRow; i++) {
                
                // Imprime el dato de la diagonal principal
                System.out.println(space + matrix[i][i]);
                // Suma un espacio extra a la siguiente impresión
                space += "   ";
            }
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
            System.out.println("                                     O R");
            System.out.println("                  M A T R I X   I S N ' T   S Q U E A R E");
        }
    }

    // Imprimir la diagonal secundaria
    public static void printSecondaryDiagonal() {

        // Verifica que la matriz tenga datos y que sea cuadrada m = n
        if (lenRow > 0 && lenColumn > 0 && lenRow == lenColumn) {

            // Imprimir diagonal secundaria
            System.out.println("-----------------------------------------------------------------------------");
            for (int i = 0; i < lenRow; i++) {
                
                // Resta espacios a la próxima impresión para hacer la diagonal inversa
                String space = "   ".repeat(lenRow - i - 1);
                System.out.println(space + matrix[i][lenRow - i - 1]);
            }
        } else {
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
            System.out.println("                                     O R");
            System.out.println("                  M A T R I X   I S N ' T   S Q U E A R E");
        }
    }

    // Imprimir triángulo por encima de la diagonal principal
    public static void printUpperTriangle() {

        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    // Imprimir triángulo por debajo de la diagonal principal
    public static void printLowerTriangle() {

        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }
}
