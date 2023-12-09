package Inheritance_2;

import java.awt.*;
import java.util.Scanner;

public class Publication {
    private String title;
    private double price;
    private int copies;
    private double total;

    Scanner sc = new Scanner(System.in);
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public void setCopies(int copies){
        this.copies = copies;
    }

    public int getCopies(){
        return copies;
    }

    public double getPrice(){
        return price;
    }

    public double getTotal(){
        return total;
    }



    public void read_publ(){

        System.out.println("Enter the title: ");
        title = sc.nextLine();
        System.out.println("Enter the price: ");
        price = sc.nextDouble();
        System.out.println("Enter the copies: ");
        copies = sc.nextInt();
    }

    public void display(){
        System.out.println(title+"\t"+price+"\t"+copies);
    }
    public void sellCopy(int number){
        if (number<=copies){
            copies = copies + number;
            total = total +number*price;
            System.out.println("\nYou have purchased "+copies+" copies of "+(price*number)+"$");
        }
        else {
            System.out.println("Insufficient stock");
        }
    }
}
