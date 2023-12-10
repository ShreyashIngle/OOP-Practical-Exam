package Polymorphism;

import java.util.Scanner;

class Polymorphism_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        Magazine magazine = new Magazine();

        while (true) {
            System.out.println("\n-----MENU-----\n1.Book\n2.Magazine\n3.Total Revenue\nEnter the choice:");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("\n1.Read Book\n2.Display\n3.sell book\n4.order copies:");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        book.read_book();
                        break;
                    case 2:
                        book.display_book();
                        break;
                    case 3:
                        System.out.println("\nEnter the copies to sell:");
                        int n = sc.nextInt();
                        book.sellCopy(n);
                        break;

                    case 4:
                        System.out.println("\nEnter the copies to order:");
                        int o = sc.nextInt();
                        book.orderCopies(o);
                        break;

                    default:
                        System.out.println("invalid");
                }
            }
            if (choice == 2) {
                System.out.println("\n1.Read Magazine\n2.Display\n3.sell magazine\n4.recieve new issue:");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        magazine.readMag();
                        break;
                    case 2:
                        magazine.display_book();
                        break;
                    case 3:
                        System.out.println("\nEnter the copies to sell:");
                        int n = sc.nextInt();
                        magazine.sellCopy(n);
                        break;

                    case 4:
                        System.out.println("\nEnter the IssueDate:");
                        String o = sc.nextLine();
                        magazine.receive_Issue(o);
                        break;

                    default:
                        System.out.println("invalid");
                }
            }

            if (choice == 3) {
                System.out.println("Total Revenue is :"
                        + (book.getCopies() * book.getPrice() + magazine.getCopies() * magazine.getPrice()));
            }

        }
    }
}