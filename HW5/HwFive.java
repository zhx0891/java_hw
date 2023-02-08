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

//        giveMeNums(phoneBook, "Иванов" );
//        giveMyRowers(employees);
        giveMeRomeNum(5);




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
        TreeMap<String, Integer> sortedMap = new TreeMap<>(listNames);





    }


    static void giveMeRomeNum(int num) {
        HashMap<Integer, String> romNums = new HashMap<>();
        romNums.put(1, "I");
        romNums.put(2, "II");
        romNums.put(3, "III");
        romNums.put(4, "IV");
        romNums.put(5, "V");
        romNums.put(6, "VI");
        romNums.put(7, "VII");
        romNums.put(8, "VIII");
        romNums.put(9, "IX");
        romNums.put(10, "X");
        romNums.put(50, "L");
        romNums.put(90, "XC");
        romNums.put(100, "C");
        romNums.put(500, "D");
        romNums.put(1000, "M");


        String res;
        StringBuilder numStr = new StringBuilder();
        int lenNum = numStr.append(num).length();
        rm(romNums, 456);
//        System.out.println(romNums.get(num));


//        switch (lenNum) {
//            case 1:
//                System.out.println(romNums.get(0));
//                break;
//
//            case 2:
//                System.out.println();
//                break;
//    }
//            case 3:
//                System.out.println();
//                break;
//            case 4:
//                System.out.println();
//                break;
//        }




    }
    static void rm(HashMap romNums, int num){
        String numStr = "" + num;
        String [] numInt = numStr.split("");
        String res = "";

//        for (int i = 0; i < numInt.length; i++) {
//            if (numInt[i]. != 0){
//                if (numInt.length == 1){
//                    res = res + romNums.get(numInt[i]);
//                    System.out.println(res);
//                    break;
//                }
//                if (numInt.length == 2){
//                    if (i == 0){
//                        for (int j = 0; j < numInt[i]; j++) {
//
//                        }
////                        res = res + (numInt[i] * romNums.get(numInt[i]));
//                    }
//                }
//            }
////            res = res + romNums.get(numInt[i]);
//
//            }

        }


        static int [] intToArr(int num){
            String numStr = "" + num;
        int[] res = new int[numStr.length()];
            for (int i = 0; i < res.length; i++) {

            }
        return res;
        }

    }
//}
