 package src.main.java.Workbooks.Workbooks_7_7;
 
 public class Main {
  
    public static void main(String[] args) {
 
 
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
 
        if (person.applyPassport() == true) {
            person.setPassport();
        }

            System.out.println(person);
        
    }
  
}
