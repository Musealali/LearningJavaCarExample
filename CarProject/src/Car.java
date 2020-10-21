public abstract class Car {
    private String RegNr;
    private String Brand;
    private int ModelYear;
    private int NumberOfDoors;

    public abstract double CalculateGreenTax();

    public Car(String regNr, String brand, int modelYear, int numberOfDoors){
        setRegNr(regNr);
        setBrand(brand);
        setModelYear(modelYear);
        setNumberOfDoors(numberOfDoors);
    }

    public String getRegNr()
    {
        return RegNr;
    }

    public String getBrand(){
        return Brand;
    }

    public int getModelYear(){
        return ModelYear;
    }

    public int getNumberOfDoors(){
        return NumberOfDoors;
    }

    public void setRegNr(String regNr){
        this.RegNr = regNr;
    }

    public void setBrand(String brand){
        this.Brand = brand;
    }

    public void setModelYear(int modelYear){
        this.ModelYear = modelYear;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.NumberOfDoors = numberOfDoors;
    }


}
