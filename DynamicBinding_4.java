import java.util.Scanner;

//        Design a base class shape with two double type values and member
//        functions to input the data and compute_area() for calculating area of figure. Derive two classes’
//        triangle and rectangle. Make compute_area() as abstract function and redefine this function in the
//        derived class to suit their requirements. Write a program that accepts dimensions of
//        triangle/rectangle and display calculated area. Implement dynamic binding for given case study.
abstract class Shape{
    double length;
    double breadth;
    abstract void compute_area();

    abstract void get_Data();
}

class Triangle extends Shape{
    @Override
    public void get_Data(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Lenght: ");
         length = sc.nextDouble();

         System.out.println("Enter the Breadth: ");
         breadth = sc.nextDouble();
    }

   public void compute_area(){

        double result = 0.5*length*breadth;
        System.out.println("The Area of Triangle is : "+result);
    }
}

class Rectangle extends Shape{
    @Override

    public void get_Data(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Length: ");
        length = sc.nextDouble();

        System.out.println("Enter the Breadth: ");
        breadth = sc.nextDouble();
    }

    public void compute_area(){
        double result = length * breadth;
        System.out.println("The Area of Rectangle is : "+result);
    }
}

public class DynamicBinding_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n----MENU-----\n1.Triangle\n2.Rectangle\nEnter the choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    Shape obj = new Triangle();
                    obj.get_Data();
                    obj.compute_area();
                    break;

                case 2:
                    Shape obj1 = new Rectangle();
                    obj1.get_Data();
                    obj1.compute_area();
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid!!");

            }

        }
    }
}
