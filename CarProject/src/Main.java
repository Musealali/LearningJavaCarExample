import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
	    Garage garage = new Garage();
	    GasolineCar mercedes = new GasolineCar("AB2712", "Mercedes",2019,5,200,22);
        DieselCar toyota = new DieselCar("ZD2322", "Toyota", 2018, 5,false, 20.1);
	    ElectricCar tesla = new ElectricCar("TR3232", "Tesla", 2020, 5, 5000, 120,500);

	    garage.addCarsToList(mercedes);
        garage.addCarsToList(toyota);
        garage.addCarsToList(tesla);

        for(Car car: garage.cars){
            System.out.println(car);
        }

        System.out.println();
        System.out.println("The sum of the Green Tax value of every car is: " + garage.calculateGreenTaxForCarPark());



    }
}
