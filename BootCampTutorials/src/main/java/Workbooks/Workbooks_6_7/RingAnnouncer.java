package src.main.java.Workbooks.Workbooks_6_7;


public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
      

        // Instructions for this workbook are on Learn the Part (Workbook 6.7).
            try {
                if(record != null){
                     getScore(record);

                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("There was a issue with RingAnnouncer class\n " + "\t" + e);
            }
        


    }

    public static void getScore(String[] record){
            int wins = 0;
            int losses = 0;
            String win = "WIN";
            String loss = "LOSS";

                for(int i=0;i<record.length;i++){
                    if(record[i].equals(win)){
                        wins++;
                    } else { 
                        losses++;
                    }
                }

        System.out.println("\nWith a professional record of " + wins + " Wins and \n" + losses + " Losses.");
        System.out.println("He is the pride of oracle: Java Fury!");
       
    }
}
