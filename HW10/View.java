package HW9;

import java.util.Scanner;


public class View {
    public static void main(String[] args) {
        System.out.println("Welcome to the geekFactory. \n" +
                "We creating two type of geeks: \n" +
                "If you need javaGeek - write: java \n" +
                "If you need c++Geek  - write: c++");
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
        System.out.println(Controller.checkInput(input));
    }
}
