import java.util.Arrays;
import java.util.Scanner;

public class HwOne {
    public static void main(String[] args) {
//        firstTask();
//        secondTask(1000);
//        thirdTask();
        fourthTask("2? + ?5 = 69");
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
        System.out.println("Введите выражение вида 'int' 'действие' 'int'\nнапример  2 + 2 " +
                " между символами обязателен пробел\n" +
                "Доступные операции - сложение, умножение, деление, произведение ");
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


    static void fourthTask(String expr) {
        String[] expr_spl = expr.split(" ");
        System.out.println(Arrays.toString(expr_spl));
        char[] var1 = expr_spl[0].toCharArray();
        char[] var2 = expr_spl[2].toCharArray();
        int var3 = Integer.parseInt(expr_spl[4]);
        String act = expr_spl[3];
        int unkVar1 = getUnknown(var1);
        int unkVar2 = getUnknown(var2);
//        String num1 = new String(var1);
//        String num2 = new String(var2);

//
        for (int i = 0; i < 10; i++) {
            int num1 = varToNum(var1, i, unkVar1);
            for (int j = 0; j < 10; j++) {
                int num2 =varToNum(var2, j, unkVar2);


        }
      }
    }


    static int varToNum(char[] var, int i, int unk){
        char e = (char)(i +'0');
        var[unk] = e;
        String strNum1 = new String(var);
        int num1 = Integer.parseInt(strNum1);
        return num1;
    }


    static int getUnknown(char[] var) {
        int res = 0;
        for (int i = 0; i < var.length; i++) {
            if (!Character.isDigit(var[i])) {
                res = i;
                return res;
            }
        }
        return res;
    }
}



