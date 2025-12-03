public class VehicleDemo {
    public static void main(String[] args) {
        // 1. Create a generic Vehicle
        Vehicle vehicle = new Vehicle(15000, 2020, "Model X", "Generic");
        vehicle.displayInfo();
        System.out.println("Insurance: $" + vehicle.calculateInsurance());

        // 2. Create a Car
        Car car = new Car("Toyota", "Camry", 2023, 28000, 4, "Gasoline"); // Car נשאר כמו שהוא
        car.displayInfo();
        System.out.println("Insurance: $" + car.calculateInsurance());
        car.honk();

        // 3. Create a Motorcycle
        Motorcycle bike = new Motorcycle(12000, 2022, "Iron 883", "Harley", 883, false); // שונה לפי הסדר החדש
        bike.displayInfo();
        System.out.println("Insurance: $" + bike.calculateInsurance());
        bike.revEngine();

        // 4. Create a Truck
        Truck truck = new Truck("Ford", "F-150", 2023, 45000, 2.5, 2); // Truck נשאר כמו שהוא
        truck.displayInfo();
        System.out.println("Insurance: $" + truck.calculateInsurance());
        truck.loadCargo(2.0); // Should succeed
        truck.loadCargo(3.0); // Should fail

        // 5. Demonstrate Polymorphism
        System.out.println("\n=== POLYMORPHISM DEMO ===");
        Vehicle[] vehicles = {vehicle, car, bike, truck};

        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleType() + ": $" + v.calculateInsurance());
        }
    }
}
