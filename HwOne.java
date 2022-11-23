import java.util.Scanner;

public class HwOne {
    public static void main(String[] args) {
//        firstTask();
//        secondTask(100);
        thirdTask();
    }


    static void firstTask() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Хочу треугольное число, пиши :  ");
        int num = scan.nextInt();
        num++;
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < num; i++) {
            sum = sum + i;
            if (i > 0) {
                mult = mult * i;
            }
        }
        System.out.println("Сумма равна " + sum + "; Произведение равно " + mult);
    }


    static void secondTask(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }


    static boolean check(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void thirdTask() {
        System.out.println("Введите выражение вида 'int' 'действие' 'int'\nнапример  2 + 2  между символами обязателен пробел\nДоступные операции - сложение, умножение, деление, произведение ");
        Scanner str = new Scanner(System.in);
        String expr = str.nextLine();
        String[] strSplit = expr.split(" ");
        if (strSplit.length != 3) {System.out.println("Некорректный ввод");}
        else {
            int  a = Integer.parseInt(strSplit[0]);
            int  b = Integer.parseInt(strSplit[2]);
            switch (strSplit[1]){
                case ("+"):
                    System.out.println(expr  + " = " + (a+b));
                    break;
                case ("-"):
                    System.out.println(expr  + " = " + (a-b));
                    break;
                case ("*"):
                    System.out.println(expr  + " = " + (a*b));
                    break;
                case ("/"):
                    System.out.println(expr  + " = " + (a/b));
                    break;
                default:
                    System.out.println("что то пошло не так  ;) ");

            }

        }
    }
}

