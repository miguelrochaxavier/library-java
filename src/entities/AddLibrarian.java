package entities;

import java.util.Scanner;

public class AddLibrarian {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean escSystemContinue = true;

        System.out.printf("\nEnter number of librarian: ");
        int AddNumberOfLibrarians = sc.nextInt();

        while (escSystemContinue) {
            for (int i = 1; i <= AddNumberOfLibrarians; i++) {

                System.out.println("\nEnter your name:");
                String name_librarian = sc.next();

                System.out.println("\nEnter your Phone number:");
                int tel_librarian = sc.nextInt();

                System.out.println("\nEnter your salary:");
                int salary_librarian = sc.nextInt();

                System.out.println("\nClerk with name " + name_librarian + " has created successfully");

                System.out.println("\nYour ID is: " + i);
                System.out.println("\nYour Password is: " + i);
            }

            System.out.println("\nPress any key to continue...");
            sc.nextLine();

            return;
        }
    }
}
