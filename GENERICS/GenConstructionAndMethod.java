package GENERICS;

import java.util.Map;

public class GenConstructionAndMethod {
    public static void main(String[] args) {
        Short ar [] = {1, 2, 3, 5};
        Short val = 3;
        System.out.println(Math.isIn(val,ar));
    }

}
class Math{
    public static <T> boolean isIn(T val, T [] ar) {//Обобщённый метод
        for (T v: ar)
            if (v.equals(val)) return true;
        return false;
    }
}
class Digit{
    public double value;
    <T extends Number>Digit(T value){//Обобщённый конструктор
        this.value = value.doubleValue();
    }

}
