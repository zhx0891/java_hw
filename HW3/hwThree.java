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
        taskOne(lst);

    }


    static void taskOne(List<Integer> lst){
        for (int i = 0; i < lst.size(); i++) {
            if (((lst.get(i) % 2) == 0) && (lst.get(i) != 0) ){
                lst.remove(i);
                i--;
            }
        }
        showMeList(lst);
    }


    static void showMeList(List lst){
        for (int i = 0; i < lst.size(); i++) {

            System.out.print(lst.get(i) + "!");
        }
        System.out.println();
    }
}
