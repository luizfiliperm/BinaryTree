package app;

import tree.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        UI.printMenu();

        int option = sc.nextInt();
        sc.nextLine();

        while (option != 5) {
            switch (option) {
                case 1 -> {
                    UI.printInsert();
                    int num = sc.nextInt();
                    sc.nextLine();
                    tree.insert(num);
                    System.out.println("Inserted Successfully");
                }
                case 2 -> {
                    UI.printRemove();
                    int num = sc.nextInt();
                    sc.nextLine();
                    tree.remove(num);
                    System.out.println("Removed Successfully");
                }
                case 3 -> {
                    UI.printSearch();
                    int num = sc.nextInt();
                    sc.nextLine();
                    tree.find(num);
                    if(tree.find(num) == null){
                        System.out.printf("The number %d is not in the tree\n", num);
                        break;
                    }
                    System.out.printf("The number %d is in the tree\n", num);
                }
                case 4 -> {
                    UI.printPrint();
                    int order = sc.nextInt();
                    sc.nextLine();
                    tree.print(order);
                }
                default -> System.out.println("Invalid option");
            }
            UI.waitEnter(sc);
            UI.printMenu();
            option = sc.nextInt();
        }
        System.out.println("Thank you for using this system");
        sc.close();
    }
}