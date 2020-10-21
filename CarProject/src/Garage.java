import java.util.ArrayList;

public class Garage {
    ArrayList<Car> cars = new ArrayList<>();

    public void addCarsToList(Car car){
        cars.add(car);
    }

    @Override
    public String toString(){
        for (Car car : cars)
        {
            return String.format(car.toString());
        }
        return "No Cars";
    }

    public double calculateGreenTaxForCarPark(){
        double GreenTaxForAllCars = 0;
        for (Car car : cars)
        {
            GreenTaxForAllCars += car.CalculateGreenTax();
        }
        return GreenTaxForAllCars;
    }
}
