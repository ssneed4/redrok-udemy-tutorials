package src.main.java.Workbooks.Workbooks_8_1.Equals;

import src.main.java.Workbooks.Workbooks_7_1.Person;

public class Equals {
    public static void main(String[] args) {
        Person person = new Person("john", 30);

        boolean isEqual = person.equals(new Person("John", 30)); // false
        System.out.println();
    }
}
