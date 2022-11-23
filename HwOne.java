import java.util.Scanner;

public class HwOne {
    public static void main(String[] args) {
//        firstTask();
        secondTask(10);
    }
    static void firstTask(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Хочу треугольное число, пиши :  ");
        int num = scan.nextInt();
        num ++;
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < num; i++) {
            sum = sum + i;
            if (i > 0) {
                mult = mult * i;
            };
    }
        System.out.println("Сумма равна " + sum + "; Произведение равно " + mult);
    }

    static void secondTask(int num){
        for (int i = 2; i < num; i++) {
            Boolean simple = True;
            for (int j = 2; j < (i-1); j++) {
                if (i % j == 0) {
                    simple = False;
                }
            if (simple){
                System.out.println(i);
            }

        }

    }


}


