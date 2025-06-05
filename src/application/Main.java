package application;

import entities.AddClerk;
import entities.AddLibrarian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean escSystemContinue = true;
        Scanner sc = new Scanner(System.in);

        while (escSystemContinue) {
            System.out.printf("-----------------------------------");
            System.out.println("\n    Welcome to Admin's Portal");
            System.out.printf("-----------------------------------");
            System.out.print("\nFollow the instructions below to access the menu:");

            System.out.printf("\n1- Add Clerk");
            System.out.printf("\n2- Add Librarian");
            System.out.printf("\n3- View history of issued books");
            System.out.printf("\n4- View all books in the library");
            System.out.printf("\n5- Log out\n");

            System.out.printf("\nEnter your choice: ");
            int escSystemChoice = sc.nextInt();

            switch (escSystemChoice) {
                case 1:
                    AddClerk addClerk = new AddClerk();
                    addClerk.start();
                    break;
                case 2:
                    AddLibrarian addLibrarian = new AddLibrarian();
                    addLibrarian.start();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Log out...");
                    System.out.println("Press any key to continue...");
                    escSystemContinue = false;
                    break;
            }
        }


    }
}