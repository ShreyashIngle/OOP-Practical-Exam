import java.util.Scanner;

//        Design a class ‘Complex ‘with data members for real and imaginary part.
//        Provide default and Parameterized constructors. Write a program to perform arithmetic operations of
//        two complex numbers.
class Complex{
    float real;
    float imaginary;

    Complex(float r ,float i){
        this.real = r;
        this.imaginary= i;
    }

    public void showC(){
        System.out.println("("+ this.real + " + "+ this.imaginary +"i" +")");
    }

    public static Complex add(Complex n1,Complex n2){
        Complex res = new Complex(0,0);
        res.real = n1.real + n2.real;
        res.imaginary = n1.imaginary + n2.imaginary;
        return res;
    }
    public static Complex sub(Complex n1,Complex n2){
        Complex res = new Complex(0,0);
        res.real = n1.real - n2.real;
        res.imaginary = n1.imaginary - n2.imaginary;
        return res;
    }

    public static Complex mul(Complex n1,Complex n2){
        Complex res = new Complex(0,0);
        res.real = n1.real * n2.real - n1.imaginary*n2.imaginary;
        res.imaginary = n1.real* n2.imaginary+n2.real*n1.imaginary;
        return res;
    }

    public static Complex div(Complex n1,Complex n2){
        Complex res = new Complex(0,0);
        res.real = (n1.real * n2.real + n1.imaginary*n2.imaginary)
                /(n2.real * n2.real + n2.imaginary*n2.imaginary);

        res.imaginary = (n1.imaginary*n2.real - n1.real*n2.imaginary)
                /(n2.real * n2.real + n2.imaginary*n2.imaginary);
        return res;
    }


}

public class Complex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Real part 1: ");
        int r1 = sc.nextInt();

        System.out.println("Enter Imaginary part 1: ");
        int i1 = sc.nextInt();

        System.out.println("Enter Real part 2: ");
        int r2 = sc.nextInt();

        System.out.println("Enter Imaginary part 2 : ");
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1,i1);
        Complex c2 = new Complex(r2,i2);

        System.out.println("You entered.");
        c1.showC();
        c2.showC();

        while (true){
            System.out.println("\n1. Addition\n2. Substraction\n2. Multiplication\n 3. Division\n5. Exit\n Enter the choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    Complex Addition = Complex.add(c1,c2);
                    Addition.showC();
                    break;

                case 2:
                    Complex Subtraction  = Complex.sub(c1,c2);
                    Subtraction.showC();
                    break;

                case 3:
                    Complex Multiplication  = Complex.mul(c1,c2);
                    Multiplication.showC();
                    break;

                case 4:
                    Complex Division  = Complex.div(c1,c2);
                    Division.showC();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid!!!");


            }
        }
    }
}