public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(String brand, String model, int year, double price, int numberOfDoors, String fuelType) {
        super(price,year,model,brand);
        this.fuelType=fuelType;
        this.numberOfDoors=numberOfDoors;
        System.out.println("Car constructor called");

    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("FuelType: " + fuelType);
        System.out.println("Vehicle Type: " + getVehicleType());
    }
    @Override
    public double calculateInsurance(){
        double baseInsurance = super.calculateInsurance();
        if (numberOfDoors > 2) return baseInsurance * 1.1;
        else return baseInsurance * 1.2;
    }
    @Override
    public String getVehicleType(){
        return "Car";
    }
    public void honk(){
        System.out.println("Beep Beep! ");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getFuelType() {
        return fuelType;
    }
}