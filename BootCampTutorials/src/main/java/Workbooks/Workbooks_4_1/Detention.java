package src.main.java.Workbooks.Workbooks_4_1;

public class Detention {
    public static void main(String[] args) {

         

        // Task 2 – call the function 6 times. 
      int counter=1;

        for(int i=1;i<=6;i++){
          System.out.println("The COUNTER is: " + counter++);
          printLines();
        }
   }



    //Task 1 - Make a function here. See the doc comment for details. 

    /**    
      * Funtion name: printLines
      *
      * Inside the function:
      *   1. prints the four lines       
      */
      public static void printLines(){
        int count=1;

        for(int i=1;i<=4;i++){
          System.out.println(count++);
        
        //what Bart did so far
        System.out.println("I will not copy and paste code.");
        System.out.println("I will use Camel Case when writing class names.");
        System.out.println("I will use lower Camel Case when writing function names.");
        System.out.println("I will use lower Camel Case when writing variables names.\n");
        }

      }


}
