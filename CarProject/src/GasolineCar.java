public class GasolineCar extends Car {

    private int OctaneRating;
    private double KmPrL;

    public GasolineCar(String regNr, String brand, int modelYear, int numberOfDoors, int octaneRating, double kmPrL) {
        super(regNr, brand, modelYear, numberOfDoors);
        setOctaneRating(octaneRating);
        setKmPrL(kmPrL);
    }

    public int getOctaneRating(){
        return OctaneRating;
    }

    public double getKmPrL(){
        return KmPrL;
    }


    public void setOctaneRating(int octaneRating){
        this.OctaneRating = octaneRating;
    }

    public void setKmPrL(double kmPrL){
        this.KmPrL = kmPrL;
    }

    @Override
    public String toString(){
        return String.format("Registration number is: " + getRegNr() + ", Brand is: " + getBrand() + ", The model of year is: " + getModelYear() +
                ", Number of doors the car have is: " + getNumberOfDoors() + ", Octane rating for the car is: " + getOctaneRating() + ", Kilometer Per Mile is: " + getKmPrL());
    }


    @Override
    public double CalculateGreenTax() {
        if(getKmPrL() >= 20 && getKmPrL() <= 50){
            return 330;
        }else if(getKmPrL() >= 15 && getKmPrL() <= 20){
            return 1050;
        }else if(getKmPrL() >= 10 && getKmPrL() <= 15){
            return 2340;
        }else if(getKmPrL() >= 5 && getKmPrL() <= 10){
            return 5500;
        }else if(getKmPrL() < 5){
            return 10470;
        }
        return 0;
    }
}
