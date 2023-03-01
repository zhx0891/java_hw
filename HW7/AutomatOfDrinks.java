package HW7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


 abstract class AutomatOfDrinks {
     ArrayList<Drink> drinks = null;

     public AutomatOfDrinks(ArrayList<Drink> listProduct) {
         this.drinks = listProduct;
     }
     public Drink getProduct (String tm, String vol, String tmpr){
         for (int i = 0; i < this.drinks.size(); i++) {
             Drink drink = this.drinks.get(i);
             Iterator<String> components = drink;
             int ind = 0;
             while (components.hasNext()) {
//                 System.out.println(components.next());


                 if (components.next().equals(tm)) {
                     ind++;
                 }
                 if (components.next().equals(vol) && ind == 1) {
                     ind++;
                 }
                 if (components.next().equals(tmpr) && ind == 2) {
                     return drink;
                 }
             }
         }
         return null;
     }


     public void userChoice() {
         System.out.println("Выерите продукт: \n");
         for (int i = 0; i < this.drinks.size(); i++) {
             System.out.println("" + (i + 1) + " " + this.drinks.get(i).getTradeMark() + " "
                     + this.drinks.get(i).getVolume() + " " + this.drinks.get(i).getTemperature());

//             Drink drink = this.drinks.get(i);
//             Iterator<String> components = drink;
//
//             System.out.print((i+1) + " ");
//             while (components.hasNext()) {
//                 System.out.print(drink.hasNext()+ " ");
//             }
//         }
         }
         Scanner scan = new Scanner(System.in);
         int usrChoice = scan.nextInt();
         getProduct(this.drinks.get(usrChoice - 1).getTradeMark(),
                 this.drinks.get(usrChoice - 1).getVolume(),
                 this.drinks.get(usrChoice - 1).getTemperature()).showParam();

     }
 }