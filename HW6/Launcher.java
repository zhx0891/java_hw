package HW6;

import java.util.*;

public class Launcher {
    public static void main(String[] args) {

        Notebook note1 = new Notebook();
        note1.setTradeMark("MSI");
        note1.setColor("black");
        note1.setCpu("intel");
        note1.setHddSize("1000");
        note1.setRamSize("16");
        note1.setIsOs("да");

        Notebook note2 = new Notebook();
        note2.setTradeMark("ACER");
        note2.setColor("white");
        note2.setCpu("AMD");
        note2.setHddSize("5000");
        note2.setRamSize("8");
        note2.setIsOs("да");

        Notebook note3 = new Notebook();
        note3.setTradeMark("HP");
        note3.setColor("white");
        note3.setCpu("intel");
        note3.setHddSize("2000");
        note3.setRamSize("16");
        note3.setIsOs("да");

        Notebook note4 = new Notebook();
        note1.setTradeMark("ASUS");
        note1.setColor("white");
        note1.setCpu("AMD");
        note1.setHddSize("3000");
        note1.setRamSize("4");
        note1.setIsOs("нет");

        Notebook note5 = new Notebook();
        note5.setTradeMark("HP");
        note5.setColor("white");
        note5.setCpu("intel");
        note5.setHddSize("3000");
        note5.setRamSize("32");
        note5.setIsOs("нет");

        List<Notebook> notebooks = new ArrayList<>(Arrays.asList(note1, note2, note3, note4, note5));

        OrderNotebook orderNotebook = buyerDialog();
        System.out.println(notebooks.get(0).getMark());
        findIt(orderNotebook, notebooks);



    }
    static void findIt(OrderNotebook ord, List<Notebook> notes) {

        int count = 0;
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).getMark().equals(ord.tradeMark) || ord.tradeMark.equals("*")) {
                if (notes.get(i).getColor().equals(ord.color) || ord.color.equals("*")) {
                    if (notes.get(i).getCpu().equals(ord.cpu) || ord.cpu.equals("*")) {
                        if (notes.get(i).getHddSize().equals(ord.hddSize) || ord.hddSize.equals("*")) {
                            if (notes.get(i).getRamSize().equals(ord.ramSize) || ord.ramSize.equals("*")) {
                                if (notes.get(i).getIsOs().equals(ord.isOs) || ord.isOs.equals("*")) {
                                    count++;
                                    notes.get(i).showParam();
                                }
                            }
                        }
                    }
                }
            }
//            if (count == 0) {
//                System.out.println("Сожалеем но ноутбука с такими  параметрами у нас нет.");
//            } else {
//                System.out.println("Найдено " + count + " совпадений. ");
//            }
        }
        if (count == 0) {
            System.out.println("Сожалеем но ноутбука с такими  параметрами у нас нет.");
        } else {
            System.out.println("Найдено " + count + " совпадений. ");
        }
    }

    static OrderNotebook buyerDialog(){
        Scanner scan = new Scanner(System.in);
        OrderNotebook orderNotebook = new OrderNotebook();

        System.out.println("Добро пожаловать в наш магазин." +
                " Давайте зададим критерии вашего нового ноутбука. " +
                "Продолжить? да\\нет");

        String begin = scan.nextLine();

        if(begin.equals("да")){
            System.out.println();
        }
        else {
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
