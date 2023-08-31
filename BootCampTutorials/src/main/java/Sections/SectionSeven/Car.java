package src.main.java.Sections.SectionSeven;

public class Car {
    
    String make;
    String price;
    int year;
    String color;

    public Car(String make, String price, int year, String color){

        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
