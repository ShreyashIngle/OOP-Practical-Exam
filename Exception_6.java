import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//        Implement a program to handle Arithmetic exception, Array Index Out Of Bounds. The
//        user enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2
//        were not integers, the program would throw a Number Format Exception. If Num2 were zero, the program
//        would throw an Arithmetic Exception. Display the exception.
public class Exception_6 {
    public static void main(String[] args) {
        try{
            int Num1;
            int Num2;

            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter the Number1: ");
            Num1 = Integer.parseInt(br.readLine());

            System.out.println("Enter the Number2: ");
            Num2 = Integer.parseInt(br.readLine());

            if (Num2 ==0){
                throw new ArithmeticException();
            }

            int result = Num1/Num2;

            System.out.println("The Division of Number is: "+result);

            int[] a = new int[4];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("Enter Index of element to access:");
            int access = Integer.parseInt(br.readLine());
            System.out.println(a[access]);

        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } catch (NumberFormatException e ){
            System.out.println("Please Enter integers only");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
