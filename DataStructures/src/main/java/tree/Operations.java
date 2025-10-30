package tree;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    static NodeTree root = null;
    static String option;

    public static void loadNode(NodeTree seed) {

        NodeTree newNode;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Enter data: ");
        seed.info = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                                  NODE: " + seed.info);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("1. Add left node                                                  2. Continue");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Enter option: ");
        option = sc.nextLine();

        if (option.equals("1")) {

            newNode = new NodeTree();
            seed.lb = newNode;
            loadNode(newNode);
        } else {

            seed.lb = null;
        }

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                                  NODE: " + seed.info);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("1. Add right node                                                 2. Continue");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Enter option: ");
        option = sc.nextLine();

        if (option.equals("1")) {

            newNode = new NodeTree();
            seed.rb = newNode;
            loadNode(newNode);
        } else {

            seed.rb = null;
        }
    }

    public static void inorder(NodeTree seed) {

        if (seed != null) {

            inorder(seed.lb);
            System.out.print(seed.info + ", ");
            inorder(seed.rb);
        }
    }

    public static void preorder(NodeTree seed) {

        if (seed != null) {

            System.out.print(seed.info + ", ");
            preorder(seed.lb);
            preorder(seed.rb);
        }
    }

    public static void postorder(NodeTree seed) {

        if (seed != null) {

            postorder(seed.lb);
            postorder(seed.rb);
            System.out.print(seed.info + ", ");
        }
    }
    
    public static void counterNode() {}
    
    public static void counterLeaves() {}
    
    public static void maxNode() {}
    
    public static void minNode() {}
}
