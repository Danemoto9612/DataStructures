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
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter raw length: ");
                lenRow = sc.nextInt();
                sc.nextLine();
                if (lenRow > 0 && lenRow < 20) {
                    swRaw = false;
                } else {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("              S I Z E   R A W   L E S S   2 0");
                }
            } catch (Exception e) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("                  I N V A L I D   T Y P E");
                sc.nextLine();
            }
        }

        // Pedir tamaño de las columnas y verificar que sea un tamaño y tipo válido.
        while (swColumn) {
            try {
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter column length: ");
                lenColumn = sc.nextInt();
                sc.nextLine();
                if (lenColumn > 0 && lenColumn < 20) {
                    swColumn = false;
                } else {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("           S I Z E   C O L U M N   L E S S   2 0");
                }
            } catch (Exception e) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("                  I N V A L I D   T Y P E");
                sc.nextLine();
            }
        }

        // LLenado autónomo de la matriz
        for (int i = 0; i < lenRow; i++) {
            for (int j = 0; j < lenColumn; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void show() {

        if (lenRow > 0 && lenColumn > 0) {
            // Bucle para mostrar la matriz
            System.out.println("-----------------------------------------------------------");
            for (int i = 0; i < lenRow; i++) {
                for (int j = 0; j < lenColumn; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Matrix don't have data");
        }
    }

    public static void search() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void modify() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void insert() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void delete() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void insertRaw() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void insertColumn() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void deleteRaw() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void deleteColumn() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void printRaw() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void printColumn() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void printMainDiagonal() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
        }
    }

    public static void printSecondaryDiagonal() {
        
        if (lenRow > 0 && lenColumn > 0) {
        } else {
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
