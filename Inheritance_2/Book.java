package Inheritance_2;

public class Book extends Publication{
    private String author;

    public void orderCopies(int number){
        int x = getCopies() + number;
        setCopies(getCopies()+number);
        System.out.println("\nORDER Successfully");
        System.out.println("\nTotal copies"+x);
    }

    void read_book() {
        read_publ();
        System.out.print("enter author book: ");
        author = sc.next();
    }

    void display_book() {
        System.out.println("title \tprice \tcopy \tauthor");
        display();
        System.out.println("\t" + author);
    }
}
