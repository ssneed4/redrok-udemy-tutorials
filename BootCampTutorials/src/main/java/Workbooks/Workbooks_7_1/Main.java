package src.main.java.Workbooks.Workbooks_7_1;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Scooby Doo";
        one.nationality = "Brown";
        one.dateOfBirth = "07/30/1969";
        one.seatNumber = 30;
        one.passport = new String[] {"Name: " + one.name,one.nationality,one.dateOfBirth};


         System.out.println("Name: " + one.name);
         System.out.println("Nationality: " + one.nationality);
         System.out.println("Birthdate: " + one.dateOfBirth);
         System.out.println("Seat: " + one.seatNumber);
         System.out.println(Arrays.toString(one.passport));


    }
}
