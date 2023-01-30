import java.util.Scanner;

public class CalcWithLogger {
    public static void main(String[] args) {
        secondTask();
    }
    static void secondTask() {

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
}
