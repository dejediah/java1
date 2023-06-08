/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asdfkljalksdfj;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author armin
 */

public class maribel {

    static void bubbleSort(int[] arr, String[] arr2, int length) {
        int n = length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swaps string elements whenever a comparison is made
                    String temp2 = arr2[j - 1];
                    arr2[j - 1] = arr2[j];
                    arr2[j] = temp2;
                    //swaps integer elements whenever a comparison is made
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }

            }
        }
    }






    static void usersearch(String[] arr2, String search, int[] arr, int length) {
        int output = StringSearch(arr2, search, length);

        if (output < 0) {
            System.out.println(search + " is not in inventory");
        } else {
            System.out.println("The product " + search + " is in the inventory, containing " + arr[output] + " items");
        }

    }

    public static int StringSearch(String[] arr, String target, int length) {
        int n = length;
        for (int i = 0; i < n; i++) {
            if (arr[i].equalsIgnoreCase(target)) {
                return i;

            }


        }
        return -1;

    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nHello! Welcome to BCS Product Inventory!\n");
        System.out.println("Group Members: \nBORILLO, RAPHAEL JEDIDIAH" + "\nFEIRRERA, JESSICA ALEN \nMALATAG, ALEX KENNETH \nSAN JOSE, JANN NICOLE \nSICAD, TIMOTHY ALLEN  \nVARIAS, AIVEE JEAN\n");
        int[] arr = new int[64];
        //use *STRING* arr2[] for the product name input
        String[] arr2 = new String[64];
        int n = 0, addRun = 1;
        String code = "";


        //add user input for ASCENDING, DESCENDING, and SEARCH
                /*
                Menu should look like:
                Hello! What would you like to do with the inventory?
                1. Search for specific product.
                2. Sort inventory in ascending order.
                3. Sort inventory in descending order.
                */
        Scanner am = new Scanner(System.in);
        Scanner prod = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("To begin, please input your product and its amount.");
        System.out.println("===================[MAIN MENU]====================\n");

        while (addRun == 1) {
            System.out.print("Enter product: ");
            arr2[n] = prod.nextLine();

            System.out.print("Enter amount: ");
            arr[n] = am.nextInt();

            n++;

            System.out.println("Do you want to add another product? (Enter the *NUMBER* of your chosen option.)\n" +
                    "1. Yes.\n" +
                    "2. No.");
            addRun = sc.nextInt();

            while (!(addRun == 1) && !(addRun == 2)) {
                System.out.println("Please input a valid option!");
                System.out.println("Do you want to add another product? (Enter the *NUMBER* of your chosen option.)\n" +
                        "1. Yes.\n" +
                        "2. No.");
                addRun = sc.nextInt();
        }
    }
            int killswitch = 0;
            int subex = 0;
            Scanner userin = new Scanner(System.in);
            System.out.println("To know your inventory, please input your name: ");
            String name = userin.next();

            do {
            System.out.println("Hello " + name +"!" + " What would you like to do with the inventory?");
            System.out.println("Codes: \n 1: Unsorted Products \n 2: Sorted Products (Ascending) \n 3: Sorted Products (Descending) \n 4: Searching \n E: Exit Program");
            System.out.println("Input: ");

            code = userin.next();
            switch (code.toLowerCase()) {
                case "1":

                    do {
                        System.out.println("================================================ ");
                        System.out.println("Unsorted Products");
                        for (int i = 0; i < n; i++) {
                            System.out.print("Product name: " + arr2[i] + " | " + "Product amount: " + arr[i] + "\n");
                            System.out.println("-----------");
                        }
                        System.out.println("================================================ ");
                    } while (subex == 2);
                    break;

                case "2":

                    do {
                        bubbleSort(arr, arr2, n);//sorting array elements using bubble sort
                        System.out.println("================================================ ");
                        System.out.println("Sorted Products (Ascending)");
                        for (int i = 0; i < n; i++) {
                            System.out.println("Product name: " + arr2[i] + " " + "\nProduct amount: " + arr[i]);
                            System.out.println("-----------");
                        }
                        System.out.println("================================================ ");
                    } while (subex == 2);
                    break;
                case "3":

                    do {
                        bubbleSort(arr, arr2, n);//sorting array elements using bubble sort
                        System.out.println("================================================ ");
                        System.out.println("Sorted Products (Descending)");
                        for (int i = (n - 1); i > -1; i--) {
                            System.out.println("Product name: " + arr2[i] + " " + "\nProduct amount: " + arr[i]);
                            System.out.println("-----------");
                        }
                        System.out.println("================================================ ");
                    } while (subex == 2);
                    break;

                case "4":
                    do {
                        Scanner searcher = new Scanner(System.in);
                        System.out.println("Please input product to search: ");
                        String search = searcher.next();
                        System.out.println("================================================ ");
                        System.out.println("Searching");
                        usersearch(arr2, search, arr, n);
                        System.out.println("================================================ ");
                    } while (subex == 2);
                    break;
                case "e":
                    do {
                        System.out.println("User "+ name+ " now exiting...");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("Program exited!");
                        killswitch++;
                    } while (subex == 2);
            }
        } while (killswitch != 1);
    }
}
