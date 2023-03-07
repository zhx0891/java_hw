package GENERICS;

import java.util.List;
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
    public static <U> U getElementFromUCollection(List<U> col, int index) {
        return col.get(index);
    }


    // #endregion

    //#region

    public static <T1, T2> T2 put(T1 arg1, T2 arg2) {
        // Map<Integer,String> hm = new HashMap<>();
        // hm.put(key, value)
        return arg2;
    }
}
