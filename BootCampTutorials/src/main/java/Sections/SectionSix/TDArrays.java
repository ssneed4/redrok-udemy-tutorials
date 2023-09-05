package src.main.java.Sections.SectionSix;

public class TDArrays {

    public static void main(String[] args) {
        // 2 Demional array
    int[][] grades={
        {74,76,78,79},
        {75,76,77,79},
        {79,78,79,80}
        };

        for(int i=0; i<grades.length;i++){
            
            switch(i){
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;   
            }

            for(int j=0; j<grades[i].length;j++){
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n ");
        }
    }
     

     

}
