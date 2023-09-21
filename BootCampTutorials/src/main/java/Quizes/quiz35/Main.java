package src.main.java.Quizes.quiz35;

public class Main {
    public static void main(String[] args) {
         Dessert cake = new Dessert(4.99);
         Dessert pie = new Dessert(cake);
         String[] ingredients = new String[] {"Eggs", "Flower", "Baking Powder"};
         pie.setIngredients(ingredients);

         ingredients[2] = "Filling";
         //cake.setIngredients(new String[] {"Eggs", "Flower", "Baking Powder"});

         //Dessert pie = new Dessert(cake);
         //String[] randomArray = cake.getIngredients();
         //randomArray[2]="Filling";
         //pie.setIngredients(ingredients);
         
         
        //ingredients[2] = "Filling";
       //*** BREAKPOINT 1 ***
 
         
        //Dessert pie = new Dessert(cake);
 
       //*** BREAKPOINT 2 ***
    }
    
}
