
import java.util.*;

class Bank {
    private String accName;
    private String accNo;
    private double balance;
    private double dailyLimit;
    private double totalwithdrawday;
    private Date lastwithdrawdate;

    public Bank(String accName, String accNo, double dailyLimit) {
        this.accName = accName;
        this.accNo = accNo;
        this.dailyLimit = dailyLimit;
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited amount:" + amount);
        System.out.println("Balance :" + amount);
    }

    public boolean withdraw(int amount) {
        if (amount > dailyLimit) {
            System.out.println("You have reached daily limit..");
            return false;
        } else if (amount > balance) {
            System.out.println("Insuffitient balance..");
            return false;
        }
        else if((totalwithdrawday+amount)>dailyLimit){
            System.out.println("today limit reached...");
            return false;
        }

        else if (amount <= balance) {
            balance = balance - amount;
            totalwithdrawday += amount;
            lastwithdrawdate = new Date();
            System.out.println("withdraw=" + amount);
            System.out.println("Total balance=" + balance);
        }
        return true;

    }

    public double getbalace() {
        return balance;
    }

    public void display() {
        System.out.println("Account Holder Name: " + accName);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance : " + balance);
        System.out.println("Daily Limit: " + dailyLimit);
        System.out.println("Total withdraw today=" + totalwithdrawday);
        System.out.println("Last withdraw date=" + lastwithdrawdate);
    }

}

public class CaseStudy_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Account Holder: ");
        String name = sc.nextLine();
        System.out.println("Enter the Account No: ");
        String accNo = sc.nextLine();
        System.out.println("Enter the Daily Limit: ");
        int limit = sc.nextInt();

        Bank bank = new Bank(name, accNo, limit);

        while (true) {
            System.out.println(
                    "\n1.Deposit Money\n2.Withdraw Money\n3.Check Balance\n4.Display account Details\n5.Exit\nEnter the choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to Deposit");
                    int damount = sc.nextInt();
                    bank.deposit(damount);
                    break;
                case 2:
                    System.out.println("Enter the amount to Withdraw");
                    int wamount = sc.nextInt();
                    bank.withdraw(wamount);
                    break;
                case 3:
                    System.out.println("Current balance: $" + bank.getbalace());
                    break;
                case 4:
                    bank.display();
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid input....");
                    break;
            }
        }

    }
}

