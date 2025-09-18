package matrix;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    static int[][] matrix = new int[20][20];
    static int lenRow = 0, lenColumn = 0;

    public static void fill() {

        boolean swRaw = true;
        boolean swColumn = true;

        // Pedir tamaño de las filas y verificar que sea un tamaño y tipo válido.
        while (swRaw) {
            try {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter raw length: ");
                lenRow = sc.nextInt();
                sc.nextLine();
                if (lenRow > 0 && lenRow < 20) {
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
            try {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter column length: ");
                lenColumn = sc.nextInt();
                sc.nextLine();
                if (lenColumn > 0 && lenColumn < 20) {
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
                matrix[i][j] = (int) (Math.random() * 101);
            }
        }
    }

    public static void show() {

        // Verificar que la matriz tenga datos
        if (lenRow > 0 && lenColumn > 0) {
            // Bucle para mostrar la matriz
            System.out.println("-----------------------------------------------------------------------------");
            for (int i = 0; i < lenRow; i++) {
                for (int j = 0; j < lenColumn; j++) {
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

    public static void search() {

        boolean sw = true;
        int search = 0;
        int indexRaw = -1;
        int indexColumn = -1;

        if (lenRow > 0 && lenColumn > 0) {
            // Pedir y verificar tipo válido
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter search number: ");
                    search = sc.nextInt();
                    sc.nextLine();
                    sw = false;
                } catch (Exception e) {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Buscar dato ingresado
            for (int i = 0; i < lenRow; i++) {
                for (int j = 0; j < lenColumn; j++) {
                    if (matrix[i][j] == search) {
                        indexRaw = i;
                        indexColumn = j;
                    }
                }
            }

            // Definir si el dato existe o no
            if (indexRaw >= 0 && indexColumn >= 0) {
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

    public static void modify() {

        boolean sw = true;
        int search = 0;
        int indexRaw = -1;
        int indexColumn = -1;

        if (lenRow > 0 && lenColumn > 0) {
            // Pedir y verificar tipo válido
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter search number: ");
                    search = sc.nextInt();
                    sc.nextLine();
                    sw = false;
                } catch (Exception e) {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                         I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Buscar dato ingresado
            for (int i = 0; i < lenRow; i++) {
                for (int j = 0; j < lenColumn; j++) {
                    if (matrix[i][j] == search) {
                        indexRaw = i;
                        indexColumn = j;
                    }
                }
            }

            // Definir si el dato existe o no
            if (indexRaw >= 0 && indexColumn >= 0) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Enter new number: ");
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

    public static void insertRaw() {

        if (lenRow > 0 && lenColumn > 0) {

            boolean sw = true;
            int insertRaw = 0;

            //Pedir y verificar fila para insertar
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter raw to insert: ");
                    insertRaw = sc.nextInt();
                    sc.nextLine();
                    if (insertRaw < lenRow) {
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
                for (int j = 0; j < lenColumn; j++) {
                    matrix[i][j] = matrix[i - 1][j];
                }
            }
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

    public static void insertColumn() {

        if (lenRow > 0 && lenColumn > 0) {

            boolean sw = true;
            int insertColumn = 0;

            //Pedir y verificar columna para insertar
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter column to insert: ");
                    insertColumn = sc.nextInt();
                    sc.nextLine();
                    if (insertColumn < lenColumn) {
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
                for (int j = lenColumn; j > insertColumn; j--) {
                    matrix[i][j] = matrix[i][j - 1];
                }
            }
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

    public static void deleteRaw() {

        if (lenRow > 0 && lenColumn > 0) {

            boolean sw = true;
            int deleteRaw = 0;

            //Pedir y verificar fila para borrar
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter raw to delete: ");
                    deleteRaw = sc.nextInt();
                    sc.nextLine();
                    if (deleteRaw < lenRow) {
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
                for (int j = 0; j < lenColumn; j++) {
                    matrix[i][j] = matrix[i + 1][j];
                }
            }
            lenRow--;
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    public static void deleteColumn() {

        if (lenRow > 0 && lenColumn > 0) {

            boolean sw = true;
            int deleteColumn = 0;

            //Pedir y verificar fila para borrar
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter column to delete: ");
                    deleteColumn = sc.nextInt();
                    sc.nextLine();
                    if (deleteColumn < lenColumn) {
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

            // Borrar fila
            for (int i = 0; i < lenRow; i++) {
                for (int j = deleteColumn; j < lenColumn - 1; j++) {
                    matrix[i][j] = matrix[i][j + 1];
                }
            }
            lenColumn--;
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
        }
    }

    public static void printRaw() {

        if (lenRow > 0 && lenColumn > 0) {

            boolean sw = true;
            int printRaw = 0;

            // Pedir y verificar fila para imprimir
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter raw to print: ");
                    printRaw = sc.nextInt();
                    sc.nextLine();
                    if (printRaw < lenRow) {
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

    public static void printColumn() {

        if (lenRow > 0 && lenColumn > 0) {
            boolean sw = true;
            int printColumn = 0;

            // Pedir y verificar fila para imprimir
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.print("Enter column to print: ");
                    printColumn = sc.nextInt();
                    sc.nextLine();
                    if (printColumn < lenColumn) {
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

    public static void printMainDiagonal() {

        if (lenRow > 0 && lenColumn > 0 && lenRow == lenColumn) {

            String space = "";

            // Imprimir diagonal principal
            System.out.println("-----------------------------------------------------------------------------");
            for (int i = 0; i < lenRow; i++) {
                System.out.println(space + matrix[i][i]);
                space += "   ";
            }
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                   M A T R I X   H A S E N ' T   D A T A");
            System.out.println("                                     O R");
            System.out.println("                  M A T R I X   I S N ' T   S Q U E A R E");
        }
    }

    public static void printSecondaryDiagonal() {

        if (lenRow > 0 && lenColumn > 0 && lenRow == lenColumn) {

            // Imprimir diagonal secundaria
            System.out.println("-----------------------------------------------------------------------------");
            for (int i = 0; i < lenRow; i++) {
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

    public static void printUpperTriangle() {

        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void printLowerTriangle() {

        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void other() {

        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

}
