package src.main.java.Workbooks.Workbooks_6_9;

import src.main.java.Helper.Helpers;

public class Tax {
    public static void main(String[] args) {

        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];
        String priceMessage = "The original prices are: ";
        String afterTaxMessage = "The prices after tax are: ";

            try {
                    if (price != null || afterTax != null){
                        afterTax = calcTax(price, afterTax);
                        Helpers.printOutput(price, afterTax, priceMessage, afterTaxMessage);
                    } 
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Issue with Tax.java");
                }
         
    }

    public static double[] calcTax(double[] price, double[] afterTax){
        double newPrice = 0.0;
        double tRate = 1.13;

        for(int i=0;i<price.length; i++){     
             newPrice = price[i]*tRate;
             afterTax[i] =  price[i]+newPrice;
        }
        return afterTax;
    }
}
