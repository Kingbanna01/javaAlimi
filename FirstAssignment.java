public class FirstAssignment {

    private String carsModel;
    private String carsMake;
    private int  carPrice;

    public FirstAssignment(String carsModel, String carsMake, int carPrice ){

        this.carsModel = carsModel;
        this.carsMake = carsMake;
        this.carPrice = carPrice;

    }

    
    
    public static void main(String[] args) {
        FirstAssignment car = new FirstAssignment("Preve", "Proton", 65000);
        System.out.println("Car Model = " + car.carsModel);
        System.out.println("Car Make = " + car.carsMake);
        System.out.println("Car Price = RM" + car.carPrice);
    }
}
