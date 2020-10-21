public class DieselCar extends Car{

    private boolean HaveParticleFilter;
    private double KmPrL;

    public DieselCar(String regNr, String brand, int modelYear, int numberOfDoors, boolean haveParticleFilter, double kmPrL) {
        super(regNr, brand, modelYear, numberOfDoors);
        setHaveParticleFilter(haveParticleFilter);
        setKmPrL(kmPrL);
    }

    public boolean getHaveParticleFilter(){
        return HaveParticleFilter;
    }

    public double getKmPrL(){
        return KmPrL;
    }

    public void setHaveParticleFilter(boolean haveParticleFilter){
        this.HaveParticleFilter = haveParticleFilter;
    }

    public void setKmPrL(double kmPrL){
        this.KmPrL = kmPrL;
    }

    @Override
    public String toString(){
        return String.format("Registration number is: " + getRegNr() + ", Brand is: " + getBrand() + ", The model of year is: " + getModelYear() +
                ", Number of doors the car have is: " + getNumberOfDoors() + ", The car has particle filter: " + getHaveParticleFilter() + ", Kilometer Per Mile is: " + getKmPrL());
    }

    @Override
    public double CalculateGreenTax() {
        double taxToReturn = 0;

        if(getKmPrL() >= 20 && getKmPrL() <= 50){
            taxToReturn += 330 + 130;
        }else if(getKmPrL() >= 15 && getKmPrL() <= 20){
            taxToReturn += 1050 + 1390;
        }else if(getKmPrL() >= 10 && getKmPrL() <= 15){
            taxToReturn += 2340 + 1850;
        }else if(getKmPrL() >= 5 && getKmPrL() <= 10){
            taxToReturn += 5500 + 2770;
        }else if(getKmPrL() < 5){
            taxToReturn += 10470 + 15260;
        }

        if(!getHaveParticleFilter()){
            taxToReturn += 1000;
        }

        return taxToReturn;
    }
}
