package TaskFromSeminar;

import java.util.HashMap;
import java.util.Map;

public class S5 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
//        db.putIfAbsent(1, "один");
        db.put(61234,"Иванов");
        db.put(42234, "Петров");
        db.put(63536, "Сидоров");
        db.put(81234,"Иванов");
        System.out.println(db);
        for (var item: db.entrySet()){
            if(item.getValue().equals("Иванов")){
                System.out.println(item.getKey()  + "   " + item.getValue());

            }

        }
//        Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//        Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//
//        1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//        2. буква может не меняться, а остаться такой же. (Например, note - code)
//
//        Пример 1:
//
//        Input: s = "foo", t = "bar"
//
//        Output: false
        System.out.println(areYouIso("foooooq", "faaooob"));

    }
    static boolean areYouIso(String a, String b){

        Boolean res = true;
//        System.out.println(a.charAt(0) == b.charAt(0));

        if(a.length() != b.length()){
            System.out.println("не изоморфны");
            return false;
        }
        else
        {
            for (int i = 0; i < (a.length() - 1); i++) {
//                if(i <= a.length()-1){
                    if (a.charAt(i) == a.charAt(i + 1)){
                        if ( b.charAt(i) == b.charAt(i+1)){
                        continue;
                        }
                        else
                        {
                            System.out.println("не изоморфны");
                            return false;
                        }
                    }
//                    else
//                    {
//                        continue;
//                    }
//                }
            }
        }
        System.out.println("изоморфны");
        return res;
    }
}
