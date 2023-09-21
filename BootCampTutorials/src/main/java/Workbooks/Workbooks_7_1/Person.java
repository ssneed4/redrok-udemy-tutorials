package src.main.java.Workbooks.Workbooks_7_1;

public class Person {

    String name;
    int age;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public Person() {
    }


    public Person(String name, int age, String nationality, String dateOfBirth, String[] passport, int seatNumber) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.seatNumber = seatNumber;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
}

