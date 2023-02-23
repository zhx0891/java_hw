package HW7;

import java.util.ArrayList;
import java.util.Iterator;

public class AutomatHotDrinks extends AutomatOfDrinks {
    public AutomatHotDrinks(ArrayList<HotDrink> listProduct) {
        super(listProduct);
    }

    @Override
    Drink getProduct(String tm, double vol, int tempr) {
        Iterator<String> components = worker;

        while (components.hasNext()) {
            System.out.println(worker.next());
        }
        return null;
    }
    int count;

    @Override
    public boolean hasNext() {
        return count++ < 3;
    }

    @Override
    public String next() {
        switch (count){
            case 1:
                System.out.println("Название: %s", firstName);
            case 2:
                System.out.println("Объём: %s", lastName);
            case 3:
                System.out.println("Температура: %d", age);
            default:
                System.out.println("Не корректный ввод");
        }

        return null;
    }
}


//    public void getProduct(String name, double volume, int temperature) {
//
//        for (int i = 0; i < hotDrinks.size(); i++) {
//            if (hotDrinks.get(i).getTradeMark().equals(name)) {
//                if (hotDrinks.get(i).getVolume() == volume) {
//                    if (hotDrinks.get(i).getTemperature() == temperature) {
//                        hotDrinks.get(i).showParam();
//                    }
//                }
//            }
//        }
//    }
}