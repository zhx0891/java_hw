package HW7;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        ArrayList<Drink> drinks = new ArrayList<>();

        HotDrink drink1 = new HotDrink("coffee_1", "0.5" , "60");
        drinks.add(drink1);
        HotDrink drink2 = new HotDrink("coffee_1", "0.33", "40");
        drinks.add(drink2);
        HotDrink drink3 = new HotDrink("coffee_3", "0.5", "50");
        drinks.add(drink3);
        HotDrink drink4 = new HotDrink("tea", "0.5", "50");

        drinks.add(drink4);
        AutomatOfDrinks automat1 = new AutomatHotDrinks(drinks);
        automat1.userChoice();
    }
}
////    Создать наследника реализованного класса ГорячийНапиток с дополнительным
////    полем int температура.
////    Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
////    реализовать перегруженный метод
////    getProduct(int name, int volume, int temperature)
////    выдающий продукт соответствующий имени, объему и температуре
////    В main проинициализировать несколько ГорячихНапитков и
////    ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
////    Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
////
////
