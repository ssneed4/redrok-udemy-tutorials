package src.main.java.Sections.Section7;

import java.util.Arrays;

public class Dealership {
    
    private Car[] cars;


    public Dealership(Car[] cars) {
        this.cars = Arrays.copyOf(cars,cars.length);

        for(int i=0; i < this.cars.length; i++){

            this.cars[i] = new Car(cars[i]);
        }
    }

}
