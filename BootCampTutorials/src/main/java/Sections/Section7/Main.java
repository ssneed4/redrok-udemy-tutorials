package src.main.java.Sections.Section7;

public class Main {

    public static void main(String[] args) {
        
      String[] spareParts ={"Tires","Keys"};
      String[] newParts= {"tires", "filter", "transmission"};

        //  Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
        //  Car dodge = new Car("Dodge", 11000, 2020, "Blue", spareParts);
        //  Car nissan2 = new Car(nissan);
        // System.out.println(nissan);
        // System.out.println(dodge);
        // System.out.println(nissan2);
        // 

        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", spareParts),
            new Car("Dodge", 8500, 2019, "blue", spareParts),
            new Car("Nissan", 5000, 2017, "yellow", spareParts),
            new Car("Honda", 7000, 2019, "orange", spareParts),
            new Car("Mercedes", 12000, 2015, "jet black", newParts)
        };
        
        Dealership dealership = new Dealership(cars);

        cars[3].setColor("Blue");
        
          


    }
    
}
