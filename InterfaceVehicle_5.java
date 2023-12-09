package OOP5;

import java.util.*;

/**
 * InnerVehicle
 */
interface Vehicle {
    public void changeGear(int a);

    public void speedUp(int a);

    public void applyBrakes();

    public void display();
}

/**
 * Bicycle
 */
class Bicycle implements Vehicle {

    int gear;
    int speed;
    final int maxSpeed = 50;

    @Override
    public void changeGear(int a) {
        if (a <= 7) {
            gear = a;
        } else {
            System.out.println("Cant increase Gear....");

        }
    }

    @Override
    public void speedUp(int a) {
        if (speed + a <= maxSpeed) {
            speed = speed + a;
        } else {
            System.out.println("Maximum Speed of Bicycle is " + maxSpeed);
        }
    }

    @Override
    public void applyBrakes() {
        speed = 0;
    }

    @Override
    public void display() {
        System.out.println("Speed of Bicycle :" + speed);
        System.out.println("Gear of Bicycle  :" + gear);
    }
}

class Car implements Vehicle {

    int gear;
    int speed;
    final int maxSpeed = 240;

    @Override
    public void changeGear(int a) {
        if (a <= 5) {
            gear = a;
        } else {
            System.out.println("Cant increase Gear....");

        }
    }

    @Override
    public void speedUp(int a) {
        if (speed + a <= maxSpeed) {
            speed = speed + a;
        }
        else{
            System.out.println("Maximum Speed of Car is " + maxSpeed);
        }
    }

    @Override
    public void applyBrakes() {
        speed = 0;
    }

    @Override
    public void display() {
        System.out.println("Speed of Car :" + speed);
        System.out.println("Gear of Car  :" + gear);
    }
}

class Bike implements Vehicle {

    int gear;
    int speed;
    final int maxSpeed = 180;

    @Override
    public void changeGear(int a) {
        if (a <= 5) {
            gear = a;
        } else {
            System.out.println("Cant increase Gear....");

        }
    }

    @Override
    public void speedUp(int a) {
        if (speed + a <= maxSpeed) {
            speed = speed + a;
        }
        else{
            System.out.println("Maximum Speed of Bike is " + maxSpeed);
        }
    }

    @Override
    public void applyBrakes() {
        speed = 0;
    }

    @Override
    public void display() {
        System.out.println("Speed of Bike :" + speed);
        System.out.println("Gear of Bike  :" + gear);
    }
}

public class InterfaceVehicle_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize vehicle object based on user input
        Vehicle vehicle;
        while (true) {
            System.out.println("\nSelect Vehicle:");
            System.out.println("1. Bicycle");
            System.out.println("2. Bike");
            System.out.println("3. Car\n");

            int vehicleChoice;
            System.out.print("Enter Your Vehicle Choice : ");
            vehicleChoice = sc.nextInt();

            switch (vehicleChoice) {
                case 1:
                    vehicle = new Bicycle();
                    break;
                case 2:
                    vehicle = new Bike();
                    break;
                case 3:
                    vehicle = new Car();
                    break;
                default:
                    System.out.println("Invalid Vehicle Choice!");
                    continue;
            }

            // Handle common operations using the chosen vehicle object
            while (true) {
                System.out.println("\nSelect Operation:");
                System.out.println("1. Change Gear");
                System.out.println("2. Speed Up");
                System.out.println("3. Apply Break");
                System.out.println("4. Display Speed and Gear");
                System.out.println("5. Exit\n");

                int choice;
                System.out.print("Enter Your Choice : ");
                choice = sc.nextInt();
                System.out.println("");
                switch (choice) {
                    case 1:
                        int tempGear;
                        System.out.print("Enter the Gear That You Want to Change to: ");
                        tempGear = sc.nextInt();
                        vehicle.changeGear(tempGear);
                        break;
                    case 2:
                        int tempSpeed;
                        System.out.print("Enter The Value of Speed: ");
                        tempSpeed = sc.nextInt();
                        vehicle.speedUp(tempSpeed);
                        break;
                    case 3:
                        vehicle.applyBrakes();
                        break;
                    case 4:
                        vehicle.display();
                        break;
                    case 5:
                        System.out.println("Exiting The Program..");
                        System.exit(0);

                    default:
                        System.out.println("invalid input...");
                        break;
                }
            }
        }
    }
}


