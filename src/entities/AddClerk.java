package entities;

import java.util.Scanner;

public class AddClerk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean escSystemContinue = true;

        System.out.printf("\nEnter number of clerks: ");
        int AddNumberOfClerks = sc.nextInt();

        while (escSystemContinue) {
            for (int i = 1; i <= AddNumberOfClerks; i++) {

                System.out.println("\nEnter your name:");
                String name = sc.next();

                System.out.println("\nEnter your Phone number:");
                int tel = sc.nextInt();

                System.out.println("\nEnter your salary:");
                int salary = sc.nextInt();

                System.out.println("\nClerk with name " + name + " has created successfully");

                System.out.println("\nYour ID is: " + i);
                System.out.println("\nYour Password is: " + i);
            }

            System.out.println("\nPress any key to continue...");
            sc.nextLine();

            return;
        }
    }
}
