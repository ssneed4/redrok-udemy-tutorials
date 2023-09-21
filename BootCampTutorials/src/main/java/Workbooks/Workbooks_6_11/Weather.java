package src.main.java.Workbooks.Workbooks_6_11;

import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);
        String celsType = "Celsius";
        String fahtType = "Fahrenheit";

        printTempatures(celsius, celsType);
        printTempatures( fahrenheit, fahtType);
         

    }

    public static void printTempatures(double[] temp, String tempType){

     System.out.println("The type is: " + tempType);
     
     for(int i=0;i<temp.length;i++){
        System.out.print(temp[i] + " ");       
     }

     System.out.print("\n");
    }

    public static double[] celciusToFahrenheit(double[] celsius){
        double[] fahrenheit = new double[celsius.length];
         for(int i=0; i<celsius.length;i++){
            fahrenheit[i] = (celsius[i]/5 * 9) + 32;
             
         }
         //    System.out.println(Arrays.toString(fahrenheit));
        return fahrenheit;

    }

}
