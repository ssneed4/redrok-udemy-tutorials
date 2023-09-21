package src.main.java.Workbooks.Workbooks_6_12;


import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (workbook 6.12)
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;

         


        System.out.print("Ticket 1 numbers: ");
        //Task 3 - Call printTicketNumbers for int[] ticket.   
        printNumbers(ticket);

        System.out.print("Ticket 2 numbers: ");
        //Task 3 - Call printTicketNumbers for int[] ticket2.   
        printNumbers(ticket2);
    } 

    public static void printNumbers(int[] ticket){

        for(int i=0; i<ticket.length;i++){
            System.out.print(i + ". " + ticket[i]);
            System.out.print(" ");
        }
         System.out.print("\n");

    }
    
}

