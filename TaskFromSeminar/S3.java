package TaskFromSeminar;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class S3 {
    public static void main(String[] args) {
//        taskOne(10);
        taskTwo();

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
    }


    static void showMeList(List lst){
        for (int i = 0; i < lst.size(); i++) {

            System.out.print(lst.get(i) + "!");
        }
    }
}
