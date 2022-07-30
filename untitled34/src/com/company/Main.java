package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        

        class App {
            public static void main(String[] args) throws Exception {
                Scanner console = new Scanner(System.in);
                Object Operations;
                Operations.showOptions();

                while (true) {
                    System.out.println("Operation: ");
                    String operation = console.nextLine();

                    if (operation.matches("(?i)a|b|c|d")) {
                        System.out.println("Enter number of operands:");
                        int size = console.nextInt();

                        System.out.printf("Please enter %d numbers to be operated on:\n", size);
                        double[] operands = new double[size];

                        switch (operation) {
                            case "a":
                                Object Calculate;
                                System.out.println(Calculate.sumOf(operands));
                                break;
                            case "b":
                                System.out.println(Calculate.differenceOf(operands));
                                break;
                            case "c":
                                System.out.println(Calculate.productOf(operands));
                                break;
                            case "d":
                                System.out.println(Calculate.quotientOf(operands));
                                break;
                        }
                        break;
                    }
                }
                console.close();
            }
        }
    }
}
