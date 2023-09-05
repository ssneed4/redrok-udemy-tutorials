package src.main.java.Workbooks.Workbooks_7_3;

 public class Main {
  
    public static void main(String[] args) {
        
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 
        person.setSeatNumber(10);
        person.setDateOfBirth("07/30/1970");
        System.out.println("Name: " + person.getName()+ "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n ");

    }
  
  
}
