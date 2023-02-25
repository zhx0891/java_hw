package HW7;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AutomatOfDrinks {
    ArrayList<Drink> drinks = null;

    public AutomatOfDrinks(ArrayList<Drink> listProduct) {

        this.drinks = listProduct;
    }
     public void userChoice(){


     }
     public Drink getProduct(String tm, double vol, int tmpr) {
         for (int i = 0; i < this.drinks.size(); i++) {
             Drink drink = this.drinks.get(i);
             Iterator<String> components = drink;

             while (components.hasNext()) {
                 int count = 0;
                 if (drink.next().equals(tm) || count == 0) {
                     count++;
                 }
                 if (drink.next().equals(Double.toString(vol)) || count == 1) {
                     count++;
                 }
                 if (drink.next().equals(Integer.toString(tmpr)) || count == 2) {
                     return drink;
                 }
                 else {
                     count = 0;
                 }
             }
         }
     }
}
