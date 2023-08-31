package src.main.java.Sections.SectionFour;

public class Chorus {
    public static void main(String[] args) {
        // Chorus needs to be sung 5 times
         

        for(int i=1; i<=5; i++){
            System.out.println("Count: " + i);
            System.out.println();
            
            singChorus();
         
        }
    }
     public static void singChorus(){

        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");

    }
}
