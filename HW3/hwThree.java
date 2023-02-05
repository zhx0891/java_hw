package HW3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class hwThree {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        Random rand = new Random();
        int len = rand.nextInt(5, 10);
        for (int i = 0; i < len; i++) {
            lst.add(rand.nextInt(10));
        }
        showMeList(lst);
//        taskTwo(lst);
//        taskThree(lst);
        taskOne(lst);
    }


    static void taskTwo(List<Integer> lst){
        for (int i = 0; i < lst.size(); i++) {
            if (((lst.get(i) % 2) == 0) && (lst.get(i) != 0) ){
                lst.remove(i);
                i--;
            }
        }
        showMeList(lst);
    }


    static void taskThree(List<Integer> lst){
        int min = lst.get(0);
        int max = lst.get(0);
        int medium = 0;

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) < min){
                min = lst.get(i);
            }
            if(lst.get(i) > max){
                max = lst.get(i);
            }
            medium = medium + lst.get(i);
        }
        System.out.println("min = " + min + "\n" + "max = " + max + "\n" + "medium = " + (medium/lst.size()));
    }


    static void taskOne(List lst){
        int len = lst.size();
//        LinkedList<LinkedList<Integer>> lists = new LinkedList<>(); //создаю лист листов
        List<List<Integer>> lists = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            lists.add(new LinkedList<>());
            lists.get(i).add((Integer) lst.get(i));  //заполняю его значениями из сортируемого массива
        }
        showMeList(lists);
        mergeIt(lists);
    }


    static void mergeIt(List lists){
        for (int i = 0; i < lists.size(); i = i + 2) {
            System.out.println();

//            for (int j = 0; j < lists.get(i) ; j++) {
//
//                int a = lists.get(i).hashCode();
//                int b = lists.get(i + 1).hashCode();
//
//                if (a < b) {
//
//
//                }
//
//            }


        }
    }
    static void showMeList(List lst){
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + "!");
        }
        System.out.println();
    }
}
