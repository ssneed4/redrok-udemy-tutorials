package src.main.java.Workbooks.Workbooks_6_2;

public class Exam {
    public static void main(String[] args) {
        
        String[] students = {"Malfoy","Crabbe","Goyle","Pansy","Dean"};

        System.out.println("It's time to take your 5th year exams. Please, take your seats");
            for(int i =0; i < students.length;i++){

                System.out.println(students[i]+", you will take seat " + i);
            }

        //It's time to take your 5th year exams. Please, take your seats.
        // >>: Malfoy, you will take seat 0
        // >>: Crabbe, you will take seat 1
        // >>: Goyle, you will take seat 2
        // >>: Pansy, you will take seat 3
        // >>: Dean, you will take seat 4
 
    }
}
