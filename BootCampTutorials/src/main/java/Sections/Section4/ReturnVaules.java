package src.main.java.Sections.Section4;

public class ReturnVaules {
    
    public static void main(String[] args) {
        
        double bill1 = 53.5;
        double bill2 = 76.5;
        double bill3 = -1.00; 
        double tip = 0.0;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
    
        //Task 2: Call a function that tips the waiter.
        double newTip1 = tipTheWaiter(bill1,tip);
        double newTip2 = tipTheWaiter(bill2,tip);
        double newTip3 = tipTheWaiter(bill3,tip);

        System.out.println("Your service was wonderful! Please, accept this tip: $" + newTip1);
        System.out.println("Your service was wonderful! Please, accept this tip: $" + newTip2);
        System.out.println("Your service was wonderful! Please, accept this tip: $" + newTip3);

        String englishExplanation = explainArea("English");
        String spainishExplanation = explainArea("Spainish");
        String frenchExplanation = explainArea("French");
        String italianExplanation = explainArea("Italian");
    }

    public static double tipTheWaiter(double bill, double tip){
        if(bill < 0){
            System.out.println("INVALID BILL");
            System.exit(0);

        }
        tip = bill * 0.15;
        //System.out.println("Your service was wonderful! Please, accept this tip: $" + tip)

        return tip;
    }

    public static String explainArea(String language){
        switch (language){
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spainish": return "area es igual a largo * ancho";
            default: return "Language not available";
        }
         
    }

    // English "Area equals length * width"

    // French "La surface est egale a la longueur * la largeur"

    // Spanish "area es igual a largo * ancho"
}
