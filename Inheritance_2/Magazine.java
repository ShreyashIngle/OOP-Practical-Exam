package Inheritance_2;

public class Magazine extends Publication{
    private int orderQty;
    private String issueDate;

    public void receive_Issue(String new_issue){
        System.out.println("\nEnter new copies ordered:");
        orderQty = sc.nextInt();

        setCopies(orderQty);

        issueDate = new_issue;
        System.out.println("\nThe magazine with "+issueDate+" is available");


    }
    public void readMag(){
        read_publ();
        System.out.print("\nEnter the issue:[dd/mm/yyyy]:");
        issueDate = sc.next();
    }

    public void display_book(){
        System.out.println("title\tprice\tcopies\tdate");
        display();
        System.out.println("\t"+issueDate);
    }


}
