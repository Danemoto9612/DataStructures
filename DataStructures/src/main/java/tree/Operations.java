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

    public static int counterNode(NodeTree seed) {

        if (seed != null) {

            return 1 + counterNode(seed.lb) + counterNode(seed.rb);
        } else {
            return 0;
        }
    }

    public static void counterLeaves(NodeTree seed) {
    }

    public static int counterMiddleNode(NodeTree seed) {

        return 0;
    }

    public static int maxNode(NodeTree seed) {

        int m, mLeft, mRight;
        m = mLeft = mRight = Integer.MIN_VALUE;

        if (seed != null) {

            if (seed.lb != null) {

                mLeft = maxNode(seed.lb);
            }
            if (seed.rb != null) {

                mRight = maxNode(seed.rb);
            }

            m = mLeft > mRight ? mLeft : mRight;

            if (seed.info > m) {

                m = seed.info;
            }
        }

        return m;
    }

    public static int minNode(NodeTree seed) {

        int m, mLeft, mRight;
        m = mLeft = mRight = Integer.MAX_VALUE;

        if (seed != null) {

            if (seed.lb != null) {

                mLeft = minNode(seed.lb);
            }
            if (seed.rb != null) {

                mRight = minNode(seed.rb);
            }

            m = mLeft < mRight ? mLeft : mRight;

            if (seed.info < m) {

                m = seed.info;
            }
        }

        return m;
    }
}
