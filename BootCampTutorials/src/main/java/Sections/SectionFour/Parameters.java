package src.main.java.Sections.SectionFour;

public class Parameters {
    public static void main(String[] args) {
        calcArea(2.3,3.6);
        calcArea(1.6,2.4);
        calcArea(2.6,4.2);

    }

    public static void calcArea(double length, double width){
        double area = length * width;
    System.out.println("Area: " + area);


    }
}
