import TaskFromSeminar.S3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class hwTwo {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(S3.CalcWithLogger.class.getName());
        FileHandler  fh = new FileHandler();

        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.WARNING, "!!!!!!!!!");
        logger.info("???????????????????");

        int[] firstArr = {3, 5, 6, 8, 0};
        firstTaskHw(firstArr);
//        TaskFromSeminar.S3.CalcWithLogger.secondTask();
//        secondTask();

    }

    static void firstTaskHw(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                    try (FileWriter writer = new FileWriter("logFirstTask.txt")) {
                        writer.append(Arrays.toString(arr));
                        writer.append('\n');
                        writer.flush();
                    } catch (Exception exception) {
                    }
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }


//    static void secondTask() {
//
//        System.out.println("Введите выражение вида 'int' 'действие' 'int'\nнапример  2 + 2 " +
//                " между символами обязателен пробел\n" +
//                "Доступные операции - сложение, умножение, деление, произведение ");
//        Scanner str = new Scanner(System.in);
//        String expr = str.nextLine();
//        String[] strSplit = expr.split(" ");
//        if (strSplit.length != 3) {
//            System.out.println("Некорректный ввод");
//        } else {
//            int a = Integer.parseInt(strSplit[0]);
//            int b = Integer.parseInt(strSplit[2]);
//            switch (strSplit[1]) {
//                case ("+"):
//                    System.out.println(expr + " = " + (a + b));
//                    break;
//                case ("-"):
//                    System.out.println(expr + " = " + (a - b));
//                    break;
//                case ("*"):
//                    System.out.println(expr + " = " + (a * b));
//                    break;
//                case ("/"):
//                    System.out.println(expr + " = " + (a / b));
//                    break;
//                default:
//                    System.out.println("что то пошло не так  ;) ");
//            }
//        }
//    }



}


//import java.io.FileWriter;
//        import java.io.IOException;
//        import java.util.logging.Logger;
//
//public class Program {
//
//    public static void main(String[] args) {
//
//
//        try (FileWriter writer = new FileWriter("hello")){
//
//
//// запись всей строки
//            String text = "withput wlush";
//            writer.write(text);
//// запись по символам
//            writer.append('\n');
//            writer.append('E');
//
//
//        }catch (Exception exception){}
//        Logger logger = Logger.getAnonymousLogger();
//        logger.warning("We wrote a file");
