public class ElectricCar extends Car {

    private double BatteryCapacityKWh;
    private double MaxKm;
    private double WhPrkM;


    public ElectricCar(String regNr, String brand, int modelYear, int numberOfDoors, double batteryCapacityKWh, double maxKm, double whPrkM) {
        super(regNr, brand, modelYear, numberOfDoors);
        setBatteryCapacityKWh(batteryCapacityKWh);
        setMaxKm(maxKm);
        setWhPrkM(whPrkM);
    }

    public double getBatteryCapacityKWh(){
        return BatteryCapacityKWh;
    }

    public double getMaxKm(){
        return MaxKm;
    }

    public double getWhPrkM(){
        return WhPrkM;
    }

    public void setBatteryCapacityKWh(double batteryCapacityKWh){
        this.BatteryCapacityKWh = batteryCapacityKWh;
    }

    public void setMaxKm(double maxKm){
        this.MaxKm = maxKm;
    }

    public void setWhPrkM(double whPrkM){
        this.WhPrkM = whPrkM;
    }

    @Override
    public String toString(){
        return String.format("Registration number is: " + getRegNr() + ", " + "Brand is: " + getBrand() + ", " + "The model of year is: " + getModelYear() + ", " +
                "Number of doors the car have is: " + getNumberOfDoors() + ", " + "Battery Capacity is: " + getBatteryCapacityKWh() + ", " + "Max Kilometer is: " + getMaxKm() + ", Watt Per Kilometer is: " + getWhPrkM());
    }

    @Override
    public double CalculateGreenTax() {
        double calculateToKmPrL;

        calculateToKmPrL = getWhPrkM() / 91.25;

        double kmPrL = 100 / calculateToKmPrL;

        if(kmPrL >= 20 && kmPrL <= 50){
            return 330;
        }else if(kmPrL >= 15 && kmPrL <= 20){
            return 1050;
        }else if(kmPrL >= 10 && kmPrL <= 15){
            return 2340;
        }else if(kmPrL >= 5 && kmPrL <= 10){
            return 5500;
        }else if(kmPrL < 5){
            return 10470;
        }
        return 0;
    }
}
