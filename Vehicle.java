
public class Vehicle{

    protected double price;
    protected int year;
    protected String model;
    protected String brand;

    public Vehicle(double price,int year,String model,String brand){
        this.price= price;
        this.year=year;
        this.brand=brand;
        this.model=model;
        System.out.println("Vehicle constructor called");

    }
    public void displayInfo(){
        System.out.println("=== Vehicle Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    public double calculateInsurance(){
        return price*0.05;
    }
    public String getVehicleType(){
            return "Generic Vehicle";
    }
    public final void startEngine() {
        System.out.println("Engine started!");
    }
}
