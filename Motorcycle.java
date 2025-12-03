public class Motorcycle extends Vehicle {
    protected int engineCC;
    protected boolean hasSidecar;

    public Motorcycle(double price,int year,String model,String brand, int engineCC, boolean hasSidecar){
        super(price,year,model,brand);
        this.engineCC= engineCC;
        this.hasSidecar=hasSidecar;
        System.out.println("Motorcycle constructor called");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Has Sidecar: " + hasSidecar);
        System.out.println("Vehicle Type: " + getVehicleType());
    }

    @Override
    public double calculateInsurance() {
        double baseInsurance = super.calculateInsurance() * 0.8;
        if (hasSidecar) baseInsurance *= 1.2;
        return baseInsurance;
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }

    public void revEngine() {
        System.out.println("VROOOOOM! ");
    }

    public int getEngineCC() {
        return engineCC;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}
