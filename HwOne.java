import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HwOne {
    public static void main(String[] args) {
        int [] fifth = {5, 6, 2, 6, 9, 1};
//        firstTask(5);
//        secondTask(1000);
//        thirdTask();
//        fourthTask("2? + ?5 = 69");
        fifthTask(fifth, 6);
    }


    static void firstTask(int num) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Хочу треугольное число, пиши :  ");
//        int num = scan.nextInt();
//        num++;
        int sum = 0;
        int mult = 1;
        for (int i = 0; i <= num; i++) {
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
        if (strSplit.length != 3) {
            System.out.println("Некорректный ввод");
        } else {
            int a = Integer.parseInt(strSplit[0]);
            int b = Integer.parseInt(strSplit[2]);
            switch (strSplit[1]) {
                case ("+"):
                    System.out.println(expr + " = " + (a + b));
                    break;
                case ("-"):
                    System.out.println(expr + " = " + (a - b));
                    break;
                case ("*"):
                    System.out.println(expr + " = " + (a * b));
                    break;
                case ("/"):
                    System.out.println(expr + " = " + (a / b));
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
        int num3 = Integer.parseInt(expr_spl[4]);
        String act = expr_spl[1];
        int unkVar1 = getUnknown(var1);
        int unkVar2 = getUnknown(var2);
        int ind1;
        int ind2;
        if (unkVar1 == 0){ind1 = 1;} else {ind1 = 0;}
        if (unkVar2 == 0){ind2 = 1;} else {ind2 = 0;}

        for ( int i = 4 ; i < 10; i++) {
            int num1 = varToNum(var1, i, unkVar1);
            for (int j = ind2; j < 10; j++) {
                int num2 = varToNum(var2, j, unkVar2);
                if (act.equals("+")){if ((num1 + num2) == num3){System.out.println(num1+ " + "+num2+" = "+num3);}}
                if (act.equals("-")){if ((num1 - num2) == num3){System.out.println(num1+ " - "+num2+" = "+num3);}}
        }
      }
    }


    static int varToNum(char[] var, int ind, int unk){
        char e = (char)(ind +'0');
        var[unk] = e;
        String strNum = new String(var);
        int num = Integer.parseInt(strNum);
        return num;
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
    static void fifthTask(int [] arr, int val){





//        for (int i = 0; i < arrStr.length; i++) {
//            if (arrStr[i] == val) {
//
//            }
//
//        }
//    return resArr;
    }
}



