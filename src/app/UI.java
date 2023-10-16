package app;

import java.util.Scanner;

public class UI {

    public static void printMenu(){
        System.out.println("====================================================");
        System.out.println("This is a binary tree system");
        System.out.println("1. Insert");
        System.out.println("2. Remove");
        System.out.println("3. Search");
        System.out.println("4. Print");
        System.out.println("5. Exit");
        System.out.print("Please select an option: ");
    }

    public static void printInsert(){
        System.out.print("Please enter a number to insert: ");
    }

    public static void printRemove(){
        System.out.print("Please enter a number to remove: ");
    }

    public static void printSearch(){
        System.out.print("Please enter a number to search: ");
    }

    public static void printPrint(){
        System.out.println("1. Pre-order");
        System.out.println("2. In-order");
        System.out.println("3. Post-order");
        System.out.print("Please select an order: ");
    }

    public static void waitEnter(Scanner sc){
        System.out.println("Press enter to continue...");
        sc.nextLine();
    }
}
