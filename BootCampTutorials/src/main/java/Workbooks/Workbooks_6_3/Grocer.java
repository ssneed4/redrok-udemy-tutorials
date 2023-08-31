package src.main.java.Workbooks.Workbooks_6_3;

public class Grocer {
    
    public static void main(String[] args) {
        
        String[] aisles = {"Apples", "Bananas", "Candy","Chocolate", "Coffee", "Tea"};
        String item = "Coffee";

        System.out.println("Do you have " + item + "?" );
        

        for(int i=0;i<aisles.length;i++){

             //System.out.println("Items: " + aisles[i]);
                if(item == aisles[i]){
                    System.out.println(item + " is on aisle " + i);
                }
        }



    }
}
