
import java.util.Scanner;


public class FirstAssignment {

    private final String carsModel;
    private final String carsMake;
    private final double carPrice;
    public int whichcar;
    Scanner scanner = new Scanner(System.in);

    public FirstAssignment(){

        System.out.println("Please put car model");
        this.carsModel = scanner.nextLine();
        System.out.println("Please put car make");
        this.carsMake = scanner.nextLine();
        System.out.println("Please put car price");
        this.carPrice = scanner.nextDouble();
        System.out.println("NextCar");
        printDetails();

    }

    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        FirstAssignment car1 = new FirstAssignment();
        FirstAssignment car2 = new FirstAssignment();
        FirstAssignment car3 = new FirstAssignment();
        double total = (car1.carPrice + car2.carPrice + car3.carPrice)/3;
        System.out.printf("Average prices of cars = RM %.2f%n", total);


        System.out.println("Choose 1 for car1");
        System.out.println("Choose 2 for car2");
        System.out.println("Choose 3 for car3");

        int whichCar = scanner.nextInt();

        switch (whichCar) {
            case 1:
            System.out.printf("The %s %s car price is = RM%.2f%n ",
            car1.carsMake, car1.carsModel, car1.carPrice);
            isVIP(car1.carPrice);
                break;
            case 2:
            System.out.printf("The %s %s car price is = RM%.2f%n",
            car2.carsMake, car2.carsModel, car2.carPrice);
            isVIP(car2.carPrice);
                break;
            case 3:
            System.out.printf("The %s %s car price is = RM%.2f%n",
            car3.carsMake, car3.carsModel, car3.carPrice);
            isVIP(car3.carPrice);
                break;
            default:
                System.out.println("Invalid");
        }


    }
    public void printDetails(){
        System.out.println("Car Model = " + carsModel);
        System.out.println("Car Make = " + carsMake);
        System.out.println("Car Price = RM" + carPrice);
    }

    public static void isVIP(double carPrice){
        if(carPrice >= 100000){
            System.out.println("The user is VIP"); 
        }
        System.out.println("Nah, the user is just normal person");

    }


    
}

