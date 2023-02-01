package TaskFromSeminar;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class S3 {
    public static void main(String[] args) {
        taskOne(10);
    }

    static void taskOne(int len){
        Random rand = new Random();

        ArrayList <Integer> taskList = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            taskList.add(rand.nextInt(10) );
        }
        Collections.sort(taskList);
        for (Integer i:taskList){
            System.out.print(i + " ");
        }

    }
}
