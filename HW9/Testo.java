package HW9;

import java.util.ArrayList;
import java.util.List;

public class Testo {
    public static void main(String []args){
        List<Test> testList = new ArrayList<>();
        Test test = new Test(2);
        testList.add(new Test(1));
        testList.add(test);
        System.out.println(testList.get(0));
        System.out.println(testList.get(1));
    }
}

