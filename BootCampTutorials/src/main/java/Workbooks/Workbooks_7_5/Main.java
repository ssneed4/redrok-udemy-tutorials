 package src.main.java.Workbooks.Workbooks_7_5;

 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 

         
        person.chooseSeat();

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
             
        
        if(person.applyPassport()){

            System.out.println("You are approved");

        } else {

            System.out.println("you are NOT approved");

        }


    }
  
  
}
