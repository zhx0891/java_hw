package HW5;

import java.lang.reflect.Array;
import java.util.*;

public class HwFive {
    public static void main(String[] args) {
// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
        HashMap<Integer, String> phoneBook = new HashMap<>();
        String employees = "Иван Иванов\n" +
                "\n" +
                "Светлана Петрова\n" +
                "\n" +
                "Кристина Белова\n" +
                "\n" +
                "Анна Мусина\n" +
                "\n" +
                "Анна Крутова\n" +
                "\n" +
                "Иван Юрин\n" +
                "\n" +
                "Петр Лыков\n" +
                "\n" +
                "Павел Чернов\n" +
                "\n" +
                "Петр Чернышов\n" +
                "\n" +
                "Мария Федорова\n" +
                "\n" +
                "Марина Светлова\n" +
                "\n" +
                "Мария Савина\n" +
                "\n" +
                "Мария Рыкова\n" +
                "\n" +
                "Марина Лугова\n" +
                "\n" +
                "Анна Владимирова\n" +
                "\n" +
                "Иван Мечников\n" +
                "\n" +
                "Петр Петин\n" +
                "\n" +
                "Иван Ежов";

        phoneBook.put(61234,"Иванов");
        phoneBook.put(42234, "Петров");
        phoneBook.put(63536, "Сидоров");
        phoneBook.put(81234,"Иванов");

        giveMeNums(phoneBook, "Иванов" );
        giveMyRowers(employees);




    }
    static void giveMeNums(HashMap <Integer, String> pb, String name){
        for (var item: pb.entrySet()){
            if(item.getValue().equals(name)){
//                System.out.println(item);
                System.out.println(item.getKey()  + "   " + item.getValue());

            }
        }

    }


    static void giveMyRowers(String rowers){
        String[] arrEmp = rowers.split("\n\n");
        HashMap<String, Integer> listNames = new HashMap<>();
        for (int i = 0; i <arrEmp.length ; i++) {
            String name = arrEmp[i].split(" ")[0];
            int countName =0;
            for (int j = 0; j < arrEmp.length; j++) {
                if(name.equals((arrEmp[j].split(" ")[0]))){
                    countName++;
                }
            }
            if(!listNames.containsKey(name)){
                listNames.put(name, countName);
            }
        }
        System.out.println(listNames);

    }
}
