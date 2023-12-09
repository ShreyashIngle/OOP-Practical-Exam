import java.util.Scanner;

interface  PaymentStrategy{
    void payment (Order order);
}
class BitcoinPayment implements PaymentStrategy{
    private String bitcoinAddress;
    private String transactionId;

    public BitcoinPayment(String bitcoinAddress,String transactionId){
        this.bitcoinAddress = bitcoinAddress;
        this.transactionId = transactionId;
    }

    @Override
    public  void payment(Order order){
        System.out.println("Payment done for the order: " + "\nOrder Details = "+order+"\nPayment Details: "+this);
    }

    @Override
    public String toString(){
        return "BitcoinPayment { "+"BitcoinAddress = " +bitcoinAddress +" TransactionId = "+transactionId;
    }
}

class CreditCardPayment implements PaymentStrategy{
    private long cardNumber;
    private String cardHolderName;

    public CreditCardPayment(long cardNumber,String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public  void payment(Order order){
        System.out.println("Payment done for the order: "+"\nOrder Details = "+order+"\nPayment Details: "+this);
    }

    @Override
    public String toString(){
        return "CreditCardPayment { "+"CardNumber = " +cardNumber +" CardHolderName = "+cardHolderName;
    }
}

class PayPalPayment implements PaymentStrategy{
    private String name;
    private String email;

    public PayPalPayment(String name,String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public  void payment(Order order){
        System.out.println("Payment done for the order: "+"\nOrder Details = "+order+"\nPayment Details: "+this);
    }

    @Override
    public String toString(){
        return "PayPalPayment { "+"Name = " +name +" Email = "+email;
    }
}

class ShoppingCart{
    private  PaymentStrategy paymentstrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentstrategy = paymentStrategy;
    }

    public void checkout(Order order){
        paymentstrategy.payment(order);
    }

}
class Order{
    private String itemName;
    private int itemQty;
    private double price;

    public Order(String itemName,int itemQty,double price){
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.price = price;
    }


    @Override
    public String toString(){
        return "Order { " +"itemName = "+itemName +" itemQty = "+itemQty +" Price = "+price +" }";
    }

}

public class Strategy_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order ord1 = new Order("Laptop",1,90000);

        ShoppingCart cart = new ShoppingCart();

        System.out.println("\nEnter the Payment Method: \n1.BitCoin\n2.CreditCard\n3.PayPal\n4.Exit\nEnter the choice: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                cart.setPaymentStrategy(new BitcoinPayment("Shreyash","41444214241"));
                break;

            case 2:
                System.out.println("\nEnter the CardNumber:");
                long cardnumber = sc.nextInt();
                System.out.println("\nEnter the CardHolderName:");
                String cardholder = sc.next();

                cart.setPaymentStrategy(new CreditCardPayment(cardnumber,cardholder));
                break;

            case 3:
                System.out.println("\nEnter the Name:");
                String name = sc.next();
                System.out.println("\nEnter the Email:");
                String email = sc.next();

                cart.setPaymentStrategy(new PayPalPayment(name,email));
                break;

            case 4:
                System.exit(0);

            default:
                System.out.println("Invalid input...");



        }

        cart.checkout(ord1);


    }
}



