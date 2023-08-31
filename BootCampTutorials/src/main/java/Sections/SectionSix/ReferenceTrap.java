package src.main.java.Sections.SectionSix;

import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear =  Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1]= "Scooby";
         

        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));

    }
}
