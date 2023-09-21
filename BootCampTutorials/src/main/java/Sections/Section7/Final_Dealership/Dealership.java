package src.main.java.Sections.Section7.Final_Dealership;


import java.util.Arrays;

public class Dealership {
    
    private Car[] cars;


    public Dealership(Car[] cars) {
        this.cars = Arrays.copyOf(cars,cars.length);

        for(int i=0; i < this.cars.length; i++){

            this.cars[i] = new Car(cars[i]);
        }
    }

    public void sell(int index){

        this.cars[index].drive();

    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }

}
