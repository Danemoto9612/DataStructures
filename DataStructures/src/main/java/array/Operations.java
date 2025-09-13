package array;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    static int[] vector = new int[20];
    static int lenVector = 0;

    public static void fill() {

        boolean sw = true;

        // Pedir tamaño del vector y verificar que sea un tamaño y tipo válido.
        while (sw) {
            try {
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter vector length: ");
                lenVector = sc.nextInt();
                sc.nextLine();
                if (lenVector > 0 && lenVector < 20) {
                    sw = false;
                } else {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("           S I Z E   V E C T O R   L E S S   2 0");
                }
            } catch (Exception e) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("                  I N V A L I D   T Y P E");
                sc.nextLine();
            }
        }

        // LLenado autónomo del vector
        for (int i = 0; i < lenVector; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }

    public static void show() {

        // Verificar que el vector tenga datos antes de mostrar
        if (lenVector > 0) {
            // Bucle para mostrar el vector separado por "|"
            System.out.println("-----------------------------------------------------------");
            System.out.print("Vector: |");
            for (int i = 0; i < lenVector; i++) {
                System.out.print(vector[i] + "|");
            }
            System.out.println();
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Vector don't have data");
        }
    }

    public static void search() {

        boolean sw = true;
        int search = 0;
        int index = -1;

        // Verificar que el vector tenga datos antes de buscar
        if (lenVector > 0) {
            // Pedir y verificar tipo válido
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Enter search number: ");
                    search = sc.nextInt();
                    sc.nextLine();
                    sw = false;
                } catch (Exception e) {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                 I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Buscar dato ingresado
            for (int i = 0; i < lenVector; i++) {
                if (vector[i] == search) {
                    index = i;
                }
            }

            // Definir si el dato existe o no
            if (index >= 0) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("|Datum: [" + search + "] index: [" + index + "]|");
            } else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Datum don't exist");
            }
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Vector don't have data");
        }
    }

    public static void modify() {

        boolean sw = true;
        int search = 0;
        int index = -1;

        // Verificar que el vector tenga datos antes de modificar
        if (lenVector > 0) {
            // Pedir y verificar tipo válido
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Enter search number: ");
                    search = sc.nextInt();
                    sc.nextLine();
                    sw = false;
                } catch (Exception e) {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                  I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Buscar dato ingresado
            for (int i = 0; i < lenVector; i++) {
                if (vector[i] == search) {
                    index = i;
                }
            }

            // Definir si el dato existe o no y agregar nuevo dato
            if (index >= 0) {
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter new number: ");
                vector[index] = sc.nextInt();
                sc.nextLine();
                System.out.println("-----------------------------------------------------------");
                System.out.println("New number add");
            } else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Datum don't exist");
            }
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Vector don't have data");
        }
    }

    public static void insert() {

        boolean sw = true;
        int search = 0;
        int index = -1;

        // Verificar que el vector tenga datos antes de insertar
        if (lenVector > 0) {
            // Pedir y verificar tipo válido
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Enter insert number: ");
                    search = sc.nextInt();
                    sc.nextLine();
                    sw = false;
                } catch (Exception e) {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                  I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Buscar dato ingresado
            for (int i = 0; i < lenVector; i++) {
                if (vector[i] == search) {
                    index = i;
                }
            }

            // Definir si el dato existe o no e insertar nuevo dato en posicion index
            if (index >= 0) {
                for (int i = lenVector; i > index; i--) {
                    vector[i] = vector[i - 1];
                }
                System.out.println("-----------------------------------------------------------");
                System.out.print("Enter new number: ");
                vector[index] = sc.nextInt();
                sc.nextLine();
                System.out.println("-----------------------------------------------------------");
                System.out.println("New number insert");
                lenVector++;
            } else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Datum don't exist");
            }
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Vector don't have data");
        }
    }

    public static void delete() {

        boolean sw = true;
        int search = 0;
        int index = -1;

        // Verificar que el vector tenga datos antes de borrar
        if (lenVector > 0) {
            // Pedir y verificar tipo válido
            while (sw) {
                try {
                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Enter delete number: ");
                    search = sc.nextInt();
                    sc.nextLine();
                    sw = false;
                } catch (Exception e) {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                 I N V A L I D   T Y P E");
                    sc.nextLine();
                }
            }

            // Buscar dato ingresado
            for (int i = 0; i < lenVector; i++) {
                if (vector[i] == search) {
                    index = i;
                }
            }

            // Definir si el dato existe o no y eliminar dato en posicion index
            if (index >= 0) {
                for (int i = index; i < lenVector - 1; i++) {
                    vector[i] = vector[i + 1];
                }
                System.out.println("-----------------------------------------------------------");
                System.out.println("Delete number");
                lenVector--;
            } else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Datum don't exist");
            }
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Vector don't have data");
        }
    }

    public static void bubbleSort(String option) {

        int auxiliar;

        // Verificar que el vector tenga datos antes de ordenar
        if (lenVector > 0) {
            switch (option) {
                case "1" -> {
                    // Orden ascendente
                    for (int i = 0; i < lenVector - 1; i++) {
                        for (int j = i + 1; j < lenVector; j++) {
                            if (vector[i] > vector[j]) {
                                auxiliar = vector[i];
                                vector[i] = vector[j];
                                vector[j] = auxiliar;
                            }
                        }
                    }
                }
                case "2" -> {
                    // Orden descendente
                    for (int i = 0; i < lenVector - 1; i++) {
                        for (int j = i + 1; j < lenVector; j++) {
                            if (vector[i] < vector[j]) {
                                auxiliar = vector[i];
                                vector[i] = vector[j];
                                vector[j] = auxiliar;
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Vector don't have data");
        }
    }

    public static String chooseOpt() {

        boolean sw = true;
        String datum = "";

        while (sw) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("1. Ascending                                  2. Descending");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Enter option: ");
            datum = sc.nextLine();
            if (datum.equals("1") || datum.equals("2")) {
                sw = false;
            } else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Enter 1 or 2");
            }
        }
        return datum;

    }

}
