package src.main.java.Challenges.ExPracticePt1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {
    
    private String name;
    private String phoneNumber;
    private String birthdate;
    private int age;
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy mm dd");


    public Contact(String name, String phoneNumber, String birthdate, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        //this.age = age;
    }

    public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthdate = source.birthdate;
        this.age = source.toAge(birthdate);
         
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int toAge(String birthdate){
        //System.out.println(birthdate);
       LocalDate parsedBirthdate = LocalDate.parse(birthdate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
       LocalDate currDate = LocalDate.now();
        Period period = Period.between(parsedBirthdate, currDate);
        System.out.println(period);
        System.out.println( period.getYears());
        return period.getYears();

    }


}
