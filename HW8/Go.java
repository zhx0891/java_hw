package HW8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Go {
    public static void main(String[] args) {

        List <Auto> garage = new ArrayList<>();
        Random rand = new Random();
        int size = rand.nextInt(10, 20);
        for (int i = 0; i < size ; i++) {
            garage.add(MakeAuto.getCar());

        }
        System.out.println(garage.get(1));



    }


}
