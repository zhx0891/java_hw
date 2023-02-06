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
    }
}
