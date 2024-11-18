
import java.util.Scanner;


public class FirstAssignment {

    private String carsModel;
    private String carsMake;
    private int  carPrice;
    Scanner scanner = new Scanner(System.in);

    public FirstAssignment(){

        System.out.println("Please put car model");
        this.carsModel = scanner.nextLine();
        System.out.println("Please put car make");
        this.carsMake = scanner.nextLine();
        System.out.println("Please put car price");
        this.carPrice = scanner.nextInt();
        System.out.println("NextCar");

    }

    
    
    public static void main(String[] args) {
        
        
        FirstAssignment car1 = new FirstAssignment();
        FirstAssignment car2 = new FirstAssignment();
        FirstAssignment car3 = new FirstAssignment();
        car1.printDetails();
        car2.printDetails();
        car3.printDetails();
        System.out.println("Average prices of cars = RM" + (car1.carPrice + car2.carPrice + car3.carPrice)/3);

    }
    public void printDetails(){
        System.out.println("Car Model = " + carsModel);
        System.out.println("Car Make = " + carsMake);
        System.out.println("Car Price = RM" + carPrice);
    }
}
