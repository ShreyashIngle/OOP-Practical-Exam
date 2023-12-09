import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Template {
    public static <T extends Number> void count(List<T> numbers) {
        int evencount = 0;
        int oddcount = 0;
        int prime = 0;
        int palindrome = 0;

        for (T number : numbers) {
            if (isEven(number)) {
                evencount++;
            }
            if (isOdd(number)) {
                oddcount++;
            }
            if (isPrime(number)) {
                prime++;
            }
            if (isPalindrome(number)) {
                palindrome++;
            }
        }

        System.out.println("Number");
        System.out.println("Even: " + evencount);
        System.out.println("Odd: " + oddcount);
        System.out.println("Prime: " + prime);
        System.out.println("Palindrome: " + palindrome);
    }

    public static <T extends Number> boolean isEven(T number) {
        return number.intValue() % 2 == 0;
    }

    public static <T extends Number> boolean isOdd(T number) {
        return number.intValue() % 2 == 1;
    }

    public static <T extends Number> boolean isPalindrome(T number) {
        int original = number.intValue();
        int reversed = 0;
        int temp = original;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return original == reversed;
    }

    public static <T extends Number> boolean isPrime(T number) {
        if (number.intValue() <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number.intValue()); i++) {
            if (number.intValue() % i == 0) {
                return false;
            }
        }

        return true;
    }
}

class Generic_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for integers
        List<Integer> intList = new ArrayList<>();
        System.out.println("Enter the number of integers: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            intList.add(number);
        }

        // Get user input for doubles
        List<Double> doubleList = new ArrayList<>();
        System.out.println("Enter the number of doubles: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter double " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            doubleList.add(number);
        }

        // Count and display results
        System.out.println("\nIntegers:");
        Template.count(intList);

        System.out.println("\nDoubles:");
        Template.count(doubleList);

        scanner.close();
    }
}
