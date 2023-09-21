package src.main.java.Helper;

import java.util.Arrays;

public interface Helpers {
    
    // Takes 4 parameters  2 double arrays and 2 Strings message than prints the output. 
    public static void printOutput(double[] arrayOne, double[] arrayTwo,String messageOne, String messageTwo ){
        // Method to just for print output.
        System.out.println(messageOne + Arrays.toString(arrayOne));
        System.out.println(messageTwo +  Arrays.toString(arrayTwo));
    }

    public static double getRandomNumber() {

        return (int) (Math.random());
    }

    public static int getRandomNumber(int numberOne, int numberTwo) {
        int range=0;
        int counter=0;
        int outputValue=0;

            try {
                if(range != 0 || counter != 0){
                    outputValue= (int) (Math.random() * range) + counter;
                } else {
                    System.out.println();
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Something has gone wrong with src.main.java.Helper.Helpers.java class" + e);
            }
        return outputValue;
    }

    // Generate a random number passing in a range returning a integer. 
    public static int randomNumber(int rangeNumber){
         
        double rNumber = Math.random() * rangeNumber;
        
        return (int)rNumber;

    }
    public static int randomNumber(){

        double rNumber = Math.random() * 50000;
        //rNumber += 1;
        return (int)rNumber;

    }
    

}
