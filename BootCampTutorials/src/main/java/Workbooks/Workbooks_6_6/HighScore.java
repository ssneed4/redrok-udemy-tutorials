package src.main.java.Workbooks.Workbooks_6_6;

public class HighScore {
    public static void main(String[] args) {
        int ScoresList[] = new int[10];
        int[] scores = generateScores(ScoresList);

            try {
                    if(scores != null){
                        printScores(scores);
                        printHighScore(scores);
                        printSeatNumber(scores);
                    }

                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("There was an issue! ");
                 }
        
    }  

    public static void printSeatNumber(int[]scores){
        int highScore = 0;
        int seat =0;

        for(int i=0;i<scores.length;i++){

            if(scores[i]>highScore){
                
                highScore = scores[i];
                seat = i;
            }

        }

        // TODO : See instructions on Learn the Part (Workbook 6.6)
        System.out.println("It's the gentleman in seat: " + seat +". Give that man a cookie!");
    }

    public static void printHighScore(int[]scores){
        int highScore = 0;

        for(int i=0;i<scores.length;i++){

            if(scores[i]>highScore){
                highScore = scores[i];
            }

        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    }

    public static void printScores(int[] Scores){
            
        System.out.print("Here are the scores:" );

        for(int i=0; i<Scores.length;i++){

            System.out.print(Scores[i] + " ");
        }
    }
    
     public static int[] generateScores(int[]ScoresList){
         
        int score = 0;

        for(int i=0; i <ScoresList.length; i++){
            score = randomNumber();
            ScoresList[i] = i + score;
        }

        return ScoresList;
    }


    public static int randomNumber(){

        double rNumber = Math.random() * 50000;
        //rNumber += 1;
        return (int)rNumber;

    }
}
