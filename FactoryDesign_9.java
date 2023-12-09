//        Design and implement Factory design pattern for the given context. Consider Car building
//        process, which requires many steps from allocating accessories to final makeup. These steps
//        should be written as methods and should be called while creating an instance of a specific car type.
//        Hatchback, Sedan, SUV could be the subclasses of Car class. Car class and its subclasses,
//        CarFactory and TestFactoryPattern should be implemented.

import java.util.Scanner;

interface Car1{
    void allocateAccessories();
    void assembleParts();
    void paint();
    void applyLogo();
}

class Hatchback implements Car1{
    @Override
    public void allocateAccessories(){
        System.out.println("The Accessories of Hatchback is Allocating.....");
    }
    @Override
    public void assembleParts(){
        System.out.println("The Parts of Hatchback is Assembling.....");
    }
    @Override
    public void paint(){
        System.out.println("The Hatchback is being painted.....");
    }
    @Override
    public void applyLogo(){
        System.out.println("The Logo of Hatchback is being applied.....");
    }
}

class Sedan implements Car1{
    @Override
    public void allocateAccessories(){
        System.out.println("The Accessories of Sedan is Allocating.....");
    }
    @Override
    public void assembleParts(){
        System.out.println("The Parts of Sedan is Assembling.....");
    }
    @Override
    public void paint(){
        System.out.println("The Sedan is being painted.....");
    }
    @Override
    public void applyLogo(){
        System.out.println("The Logo of Sedan is being applied.....");
    }
}
class SUV implements Car1{
    @Override
    public void allocateAccessories(){
        System.out.println("The Accessories of SUV is Allocating.....");
    }
    @Override
    public void assembleParts(){
        System.out.println("The Parts of SUV is Assembling.....");
    }
    @Override
    public void paint(){
        System.out.println("The SUV is being painted.....");
    }
    @Override
    public void applyLogo(){
        System.out.println("The Logo of SUV is being applied.....");
    }
}

class CarFactory{
    public static Car1 createCar(String cartype){
        switch (cartype.toLowerCase()){
            case "hatchback":
                return  new Hatchback();

            case "sedan":
                return new Sedan();

            case "suv":
                return new SUV();
            default:
                return null;

        }
    }
}


public class FactoryDesign_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-----MENU-----\nEnter Car-type\n1. Hatchback\n2. Sedan\n3. SUV\n4. Exit\nEnter the choice: ");
        String choice = sc.nextLine();

        Car1 car = CarFactory.createCar(choice);

        if (car!=null){
            car.allocateAccessories();
            car.assembleParts();
            car.paint();
            car.applyLogo();
        }
        else {
            System.out.println("Invalid Input....");
        }


    }
}
