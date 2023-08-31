package src.main.java.Workbooks.Workbooks_6_4;

import java.util.Scanner;

public class Grocer {
       

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);

        String[] aisles = {"Apples", "Bananas", "Candy","Chocolate", "Coffee", "Tea"};
         
        System.out.println("Welcome to SuperJava Grocers");
        System.out.println("What can I help you find?  ");
        
        String item = scan.next();

        int location = findItem(aisles, item);

        System.out.println("Your " + item + " is in aisle " + location );

        scan.close();
         
    }
     
    public static int findItem(String[] aisles,String item){
        int loc=0;
        
        for(int i=0;i<aisles.length;i++){

             System.out.println("Items: " + i);

                if(aisles[i].equals(item)){
                     
                     loc = i;
                     break;
                }
                 
        }


        return loc;
    }
}
