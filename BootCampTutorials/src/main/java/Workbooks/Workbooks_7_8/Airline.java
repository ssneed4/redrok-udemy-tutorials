package src.main.java.Workbooks.Workbooks_7_8;

public class Airline {
    
    Person[] people; //array that stores Person objects...

    public Airline() {
        this.people = new Person[11];
    }
     
    public Person getPerson(int index){

        Person copy = new Person(this.people[index]);
        return copy;

    }

    public void setPerson(Person person){

        int index = person.getSeatNumber()-1;
        this.people[index] = new Person(person);

    }

}
