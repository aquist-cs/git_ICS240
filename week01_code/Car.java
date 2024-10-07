public class Car {
    private String vin;
    private String color;

    public Car() {
        vin = "";
    }

    public Car(String vin, String color) {
        this.vin = vin;
        this.color = color;
    }

    public static void main(String[] args) {
        Car[] dealerCars = new Car[40];
        dealerCars[0] = new Car("1345", "blue");
        dealerCars[1] = new Car("5789", "green"); 
        dealerCars[2] = new Car("0987", "red"); 

        // for(int i = 0; i < dealerCars.length; i++) {
        //     System.out.println(dealerCars[i]);
        // }

        for(int i = 0; i < dealerCars.length - 1; i++) {
            dealerCars[i] = dealerCars[i + 1];
        }

        for(int i = 0; i < dealerCars.length; i++) {
            System.out.println(dealerCars[i]);
        }

        dealerCars[0] = new Car("1334445", "orange");

    }
}