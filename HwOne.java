import java.util.Scanner;

public class HwOne {
    public static void main(String[] args) {
        firstTask();







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


}}

