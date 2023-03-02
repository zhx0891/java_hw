package HW6;

import java.util.Scanner;

public class Viewer {
    static OrderNotebook buyerDialog() {
        Scanner scan = new Scanner(System.in);

        OrderNotebook orderNotebook = new OrderNotebook();


        System.out.println("Добро пожаловать в наш магазин." +
                " Давайте зададим критерии вашего нового ноутбука. " +
                "Продолжить? да\\нет");

        String begin = scan.nextLine();

        if (begin.equals("да")) {
            System.out.println();
        } else {
            System.exit(0);
        }

        orderNotebook.viewOrder(orderNotebook.tradeMark, orderNotebook.color, orderNotebook.cpu,
                orderNotebook.hddSize, orderNotebook.ramSize, orderNotebook.isOs);


        System.out.println("Начнём с торговой марки. " +
                "В продаже ноутбуки четырёх вендоров: MSI, ASUS, ACER, HP.\n" +
                " Если это не важно нажмите ENTER  или впишите название и нажмите ENTER ");

        String vendor = scan.nextLine();
        orderNotebook.tradeMark = checkAnswer(vendor);
        orderNotebook.viewOrder(orderNotebook.tradeMark, orderNotebook.color, orderNotebook.cpu,
                orderNotebook.hddSize, orderNotebook.ramSize, orderNotebook.isOs);

        System.out.println("Выберите объём жёсткого диска. " +
                "В продаже ноутбуки  с дисками размером: 500, 1000, 2000, 3000  гигабайт \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String hdd = scan.nextLine();
        orderNotebook.hddSize = checkAnswer(hdd);
        orderNotebook.viewOrder(orderNotebook.tradeMark, orderNotebook.color, orderNotebook.cpu,
                orderNotebook.hddSize, orderNotebook.ramSize, orderNotebook.isOs);

        System.out.println("Выберите объём оперативной памяти. " +
                "В продаже ноутбуки с установленными объёмами ОЗУ: 4, 8, 16, 32  гигабайта \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String ram = scan.nextLine();
        orderNotebook.ramSize = checkAnswer(ram);
        orderNotebook.viewOrder(orderNotebook.tradeMark, orderNotebook.color, orderNotebook.cpu,
                orderNotebook.hddSize, orderNotebook.ramSize, orderNotebook.isOs);

        System.out.println("Выберите процессор. " +
                "В продаже ноутбуки с установленными процессорами: intel и  AMD  \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String cpu = scan.nextLine();
        orderNotebook.cpu = checkAnswer(cpu);
        orderNotebook.viewOrder(orderNotebook.tradeMark, orderNotebook.color, orderNotebook.cpu,
                orderNotebook.hddSize, orderNotebook.ramSize, orderNotebook.isOs);

        System.out.println("Наличие предустановленной ОС " +
                "да - если нужна, нет - если не нужна  \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String os = scan.nextLine();
        orderNotebook.isOs = checkAnswer(os);
        orderNotebook.viewOrder(orderNotebook.tradeMark, orderNotebook.color, orderNotebook.cpu,
                orderNotebook.hddSize, orderNotebook.ramSize, orderNotebook.isOs);

        System.out.println("И самое важное в финале, выберите цвет " +
                "К сожалению розовые закончились, в наличии только чёрные и белые  \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String color = scan.nextLine();
        orderNotebook.color = checkAnswer(color);
        orderNotebook.viewOrder(orderNotebook.tradeMark, orderNotebook.color, orderNotebook.cpu,
                orderNotebook.hddSize, orderNotebook.ramSize, orderNotebook.isOs);
        return orderNotebook;
    }


    static String checkAnswer(String answ){
        if(answ.length() != 0){
            return answ;
        }
        else {
            return "*";
        }
    }
}