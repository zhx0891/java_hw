package HW5;

import java.util.HashMap;
import java.util.Map;

public class HwFive {
    public static void main(String[] args) {
// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
        HashMap<Integer, String> phoneBook = new HashMap<>();

        phoneBook.put(61234,"Иванов");
        phoneBook.put(42234, "Петров");
        phoneBook.put(63536, "Сидоров");
        phoneBook.put(81234,"Иванов");

        giveMeNums(phoneBook, "Иванов" );



    }
    static void giveMeNums(HashMap <Integer, String> pb, String name){
        for (var item: pb.entrySet()){
            if(item.getValue().equals(name)){
                System.out.println(item.getKey()  + "   " + item.getValue());

            }
        }

    }
}
