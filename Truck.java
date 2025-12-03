public class Truck extends Vehicle {
    private double cargoCapacity;
    private int numberOfAxles;

    public Truck(String brand, String model, int year, double price, double cargoCapacity, int numberOfAxles) {
        super(price, year, model, brand);
        this.cargoCapacity = cargoCapacity;
        this.numberOfAxles = numberOfAxles;
        System.out.println("Truck constructor called");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Number of Axles: " + numberOfAxles);
        System.out.println("Vehicle Type: " + getVehicleType());
    }

    @Override
    public double calculateInsurance() {
        double baseInsurance = super.calculateInsurance();
        return baseInsurance * (1.0 + cargoCapacity * 0.1);
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }

    public void loadCargo(double weight) {
        if (weight <= cargoCapacity) {
            System.out.println("Cargo loaded successfully: " + weight + " tons");
        } else {
            System.out.println("Error: Cargo exceeds capacity!");
        }
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }
}