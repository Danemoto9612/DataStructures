package tree;

import java.util.Scanner;

public class TreeMenu {

    static Scanner sc = new Scanner(System.in);

    static String option;

    public static void operationsMenu() {

        do {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                                  T R E E ");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("0. Exit                                                       1. Return");
            System.out.println("2. Load                                                       3. Inorder");
            System.out.println("4. Preorder                                                   5. Postorder");
            System.out.println("6. Count nodes                                                7. Count leaves");
            System.out.println("8. Count middle nodes                                         9. Max node");
            System.out.println("10. Min node");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sc.nextLine();

            switch (option) {

                case "0" -> {

                    // Permite salir de programa desde este punto
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                          S E E   Y O U   L A T E R");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.exit(0);
                }
                case "1" -> {

                    // Permite regresar al menú principal
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                <--- <--- <--- R E T U R N <--- <--- <---");
                    break;
                }
                case "2" -> {

                    Operations.root = new NodeTree();
                    Operations.loadNode(Operations.root);
                    break;
                }
                case "3" -> {

                    if (Operations.root != null) {

                        Operations.inorder(Operations.root);
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                            E M P T Y   T R E E");
                    }

                    System.out.println();
                    break;
                }
                case "4" -> {

                    if (Operations.root != null) {

                        Operations.preorder(Operations.root);
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                            E M P T Y   T R E E");
                    }

                    System.out.println();
                    break;
                }
                case "5" -> {

                    if (Operations.root != null) {

                        Operations.postorder(Operations.root);
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                            E M P T Y   T R E E");
                    }

                    System.out.println();
                    break;
                }
                case "6" -> {

                    if (Operations.root != null) {

                        System.out.println("Total Nodes: " + Operations.counterNode(Operations.root));
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                            E M P T Y   T R E E");
                    }

                    System.out.println();
                    break;
                }
                case "7" -> {

                    if (Operations.root != null) {

                        Operations.counterLeaves(Operations.root);
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                            E M P T Y   T R E E");
                    }

                    System.out.println();
                    break;
                }
                case "8" -> {

                    if (Operations.root != null) {

                        System.out.println("Total middle nodes: " + Operations.counterMiddleNode(Operations.root));
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                            E M P T Y   T R E E");
                    }

                    System.out.println();
                    break;
                }
                case "9" -> {

                    if (Operations.root != null) {

                        System.out.println("Max node: " + Operations.maxNode(Operations.root));
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                            E M P T Y   T R E E");
                    }

                    System.out.println();
                    break;
                }
                case "10" -> {

                    if (Operations.root != null) {

                        System.out.println("Min node: " + Operations.minNode(Operations.root));
                    } else {

                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                            E M P T Y   T R E E");
                    }

                    System.out.println();
                    break;
                }
                case "11" -> {

                    // Permite mostrar un huevo de pascua en el programa
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                        CREATED BY D4N13L M0R4L35");
                    break;
                }
                default -> {

                    // Permite mostrarle al usuario que la opción escogida no es válida
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                       I N V A L I D   O P T I O N");
                    break;
                }
            }
        } while (!option.equals("1"));
    }

}
