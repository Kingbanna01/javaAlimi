
import java.util.Scanner;


public class FirstAssignment {

    private String carsModel;
    private String carsMake;
    private double carPrice;
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
        
        
        FirstAssignment car1 = new FirstAssignment();
        FirstAssignment car2 = new FirstAssignment();
        FirstAssignment car3 = new FirstAssignment();
        double total = (car1.carPrice + car2.carPrice + car3.carPrice)/3;
        System.out.printf("Average prices of cars = RM %.2f", total);

    }
    public void printDetails(){
        System.out.println("Car Model = " + carsModel);
        System.out.println("Car Make = " + carsMake);
        System.out.println("Car Price = RM" + carPrice);
    }
}
