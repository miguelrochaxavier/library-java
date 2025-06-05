package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Librarian {
    public String name;
    public int tel;
    public int salary;

    public Librarian(String name, int tel, int salary) {
        this.name = name;
        this.tel = tel;
        this.salary = salary;
    }
}

public class AddLibrarian {

    public String name;
    public int tel;
    public int salary;
    public int AddNumberOfClerks;

    public List<Clerk> clerks = new ArrayList<>();

    public void start() {

        Scanner sc = new Scanner(System.in);
        boolean escSystemContinue = true;

        System.out.printf("\nEnter number of clerks: ");
        AddNumberOfClerks = sc.nextInt();

        while (escSystemContinue) {
            for (int i = 1; i <= AddNumberOfClerks; i++) {

                System.out.println("\nEnter your name:");
                name = sc.next();

                System.out.println("\nEnter your Phone number:");
                tel = sc.nextInt();

                System.out.println("\nEnter your salary:");
                salary = sc.nextInt();

                Clerk clerk = new Clerk(name, tel, salary);
                clerks.add(clerk);

                System.out.println("\nClerk with name " + name + " has created successfully");

                System.out.println("\nYour ID is: " + i);
                System.out.println("\nYour Password is: " + i);
            }

            System.out.println("\nPress any key to continue...");
            sc.nextLine();
            sc.nextLine();
            return;
        }
    }
    public void viewAllClerks() {
        if (clerks.isEmpty()) {
            System.out.println("\nNo clerks found.");
        } else {
            System.out.println("\nList All Clerks:");
            int index = 1;
            for (Clerk c : clerks) {
                System.out.println("\nID: " + index++);
                System.out.println("Name: " + c.name);
                System.out.println("Phone: " + c.tel);
                System.out.println("Salary: " + c.salary);
            }
        }
    }
}


