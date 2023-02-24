package HW7;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AutomatOfDrinks {
    ArrayList<HotDrink> drinks = null;

    public AutomatOfDrinks(ArrayList<HotDrink> listProduct) {

        this.drinks = listProduct;
    }
    abstract void getProduct(String tm, double vol, int tempr);

}
