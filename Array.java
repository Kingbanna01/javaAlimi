public class Array {



    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0] = "Honda BRV"; cars[0][1] = "Honda CRV"; cars[0][2] = "Honda Civic"; 
        cars[1][0] = "Toyota Unser"; cars[1][1] = "Toyota Harrier"; cars[1][2] = "Toyota Camry"; 
        cars[2][0] = "Mercedes benz"; cars[2][1] = "Mercedes CLS450"; cars[2][2] = "Mercedes AMG"; 

        int[][] carPrice = new int[3][3];

        carPrice[0][0] = 100000; carPrice[0][1] = 70000; carPrice[0][2] = 80000;
        carPrice[1][0] = 30000; carPrice[1][1] = 200000; carPrice[1][2] = 80000;
        carPrice[2][0] = 200000; carPrice[2][1] = 400000; carPrice[2][2] = 500000;

        printInt(carPrice);
        printString(cars);
        check(carPrice, cars);

    }

    public static  void printInt(int[][] array){
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.print("RM" + array[i][j] + "|");
            }
            System.out.println();
        }
    }
    public static void printString(String[][] array){
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void check(int[][] price, String[][] cars){

        for (int i=0; i<price.length; i++) {
            for (int j=0; j<price[i].length; j++) {
                if (price[i][j] >= 50000){
                    System.out.println(cars[i][j] + " = " + "RM" + price[i][j] + "|");
                }
                
            }
            System.out.println();
        }

    }
}
