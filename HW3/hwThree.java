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
        taskThree(lst);
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


    static void showMeList(List lst){
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + "!");
        }
        System.out.println();
    }
}
