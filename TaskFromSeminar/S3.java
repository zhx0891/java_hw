package TaskFromSeminar;

import java.util.*;
import java.util.List;

public class S3 {
    public static void main(String[] args) {
//        taskOne(10);
//        taskTwo();
//        taskThree();

    }

    static void taskOne(int len){
        Random rand = new Random();

        ArrayList <Integer> taskList = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            taskList.add(rand.nextInt(10) );
        }
        Collections.sort(taskList);
        showMeList(taskList);
//        for (Integer i:taskList){
//            System.out.print(i + " ");
//        }

    }

    static void taskTwo(){
        String [] planets = {"Юпитер", "Марс", "Земля", "Венера", "Меркурий", "Плутон", "Нептун", "Уран", "Сатурн" };
        Random planet = new Random();
        ArrayList <String> listPlanets = new ArrayList<>();
        for (int i = 0; i <planets.length ; i++) {
            listPlanets.add(planets[planet.nextInt(9)]);
        }
        showMeList(listPlanets);
        System.out.println();
        int countName = 0;
        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < listPlanets.size(); j++) {
                if (planets[i].equals(listPlanets.get(j))){
                    countName ++;
                }
            }
            if (countName > 0){
                System.out.println(planets[i]+ " = " + countName);
                countName = 0;
            }
        }
//        for (int i = 0; i < listPlanets.size() ; i++) {
//            for (int j = i + 1; j < listPlanets.size() ; j++) {
//                if (listPlanets.get(i).equals(listPlanets.get(j)) ){
//                    listPlanets.remove(j);
//                    j--;
//                }
//            }
//        }
    }


//    static void taskThree(){
//        ArrayList<String> lst = new ArrayList<String>();
//        lst.add(6);
//    }

    static void showMeList(List lst){
        for (int i = 0; i < lst.size(); i++) {

            System.out.print(lst.get(i) + "!");
        }
    }

    public static class CalcWithLogger {
        public static void main(String[] args) {
            secondTask();
        }
        static void secondTask() {

            System.out.println("Введите выражение вида 'int' 'действие' 'int'\nнапример  2 + 2 " +
                    " между символами обязателен пробел\n" +
                    "Доступные операции - сложение, умножение, деление, произведение ");
            Scanner str = new Scanner(System.in);
            String expr = str.nextLine();
            String[] strSplit = expr.split(" ");
            if (strSplit.length != 3) {
                System.out.println("Некорректный ввод");
            } else {
                int a = Integer.parseInt(strSplit[0]);
                int b = Integer.parseInt(strSplit[2]);
                switch (strSplit[1]) {
                    case ("+"):
                        System.out.println(expr + " = " + (a + b));
                        break;
                    case ("-"):
                        System.out.println(expr + " = " + (a - b));
                        break;
                    case ("*"):
                        System.out.println(expr + " = " + (a * b));
                        break;
                    case ("/"):
                        System.out.println(expr + " = " + (a / b));
                        break;
                    default:
                        System.out.println("что то пошло не так  ;) ");
                }
            }
        }
    }
}
