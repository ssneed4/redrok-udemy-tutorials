package src.main.java.Workbooks.Workbooks_6_8;

public class Receipt {
    public static void main(String[] args) {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        String[] price = {"1.99", "1.49", "1.29"};

        System.out.println("Here's your receipt:\n");

        for(int i=0; i<apples.length;i++){
     
            System.out.println("\t"+ apples[i] + ":" + "  $" + price[i] );

        }

         
        
        // See instructions on Learn the Part (Workbook 6.8)
        
        //System.out.println("\t<apple i >: $<price i >"); // to be used in for loop.
    }
}
