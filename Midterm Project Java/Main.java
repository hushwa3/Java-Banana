/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidtermProject;

/**
 *
 * @author joshua
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("1ST QUADRATIC EQUATION");
        int a1 = readInt(scanf, "Enter coefficient a for Quadratic 1: ");
        int b1 = readInt(scanf, "Enter coefficient b for Quadratic 1: ");
        int c1 = readInt(scanf, "Enter coefficient c for Quadratic 1: ");
        Quadratic quadratic1 = new Quadratic(a1, b1, c1);

        System.out.println("2ND QUADRATIC EQUATION");
        int a2 = readInt(scanf, "Enter coefficient a for Quadratic 2: ");
        int b2 = readInt(scanf, "Enter coefficient b for Quadratic 2: ");
        int c2 = readInt(scanf, "Enter coefficient c for Quadratic 2: ");
        Quadratic quadratic2 = new Quadratic(a2, b2, c2);

        int choice;
        do {
            System.out.println();
            System.out.println("******Menu******");
            System.out.println("1. Display Quadratic 1");
            System.out.println("2. Display Quadratic 2");
            System.out.println("3. Display Discriminant for Quadratic 1");
            System.out.println("4. Display Discriminant for Quadratic 2");
            System.out.println("5. Check Roots for Quadratic 1");
            System.out.println("6. Check Roots for Quadratic 2");
            System.out.println("7. Check if Quadratic 1 is a Perfect Square");
            System.out.println("8. Check if Quadratic 2 is a Perfect Square");
            System.out.println("9. Add Quadratic 1 and Quadratic 2");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = readInt(scanf, "");

            switch (choice) {
                case 1:
                    quadratic1.displayQuadratic("The first equation: ");
                    break;
                case 2:
                    quadratic2.displayQuadratic("The second equation: ");
                    break;
                case 3:
                    System.out.println("Discriminant for Quadratic 1: " + quadratic1.getDiscriminant());
                    break;
                case 4:
                    System.out.println("Discriminant for Quadratic 2: " + quadratic2.getDiscriminant());
                    break;
                case 5:
                    quadratic1.checkRoots();
                    break;
                case 6:
                    quadratic2.checkRoots();
                    break;
                case 7:
                    if (quadratic1.isPerfectSquare()) {
                        System.out.println("Quadratic 1 is a perfect square");
                    } else {
                        System.out.println("Quadratic 1 is not a perfect square");
                    }
                    break;
                case 8:
                    if (quadratic2.isPerfectSquare()) {
                        System.out.println("Quadratic 2 is a perfect square");
                    } else {
                        System.out.println("Quadratic 2 is not a perfect square");
                    }
                    break;
                case 9:
                    Quadratic sum = quadratic1.add(quadratic2);
                    sum.displayQuadratic("Sum of the Quadratic equations");
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }

            System.out.println();
        } while (choice != 0);

        scanf.close();
    }

    private static int readInt(Scanner scanner, String message) {
        int value = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(message);
                value = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("ERROR! Please enter an integer value.");
                scanner.next(); // Consume invalid input to avoid an infinite loop
            }
        }

        return value;
    }
}