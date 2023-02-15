package HW6;

import java.util.*;

public class Launcher {
    public static void main(String[] args) {

        Notebook note1 = new Notebook();
        note1.tradeMark = "MSI";
        note1.color = "black";
        note1.cpu = "intel";
        note1.hddSize = "1000";
        note1.ramSize = "16";
        note1.isOs = "да";

        Notebook note2 = new Notebook();
        note1.tradeMark = "ASUS";
        note1.color = "white";
        note1.cpu = "intel";
        note1.hddSize = "500";
        note1.ramSize = "4";
        note1.isOs = "нет";

        Notebook note3 = new Notebook();
        note1.tradeMark = "HP";
        note1.color = "white";
        note1.cpu = "i6";
        note1.hddSize = "2000";
        note1.ramSize = "16";
        note1.isOs = "да";

        Notebook note4 = new Notebook();
        note1.tradeMark = "MSI";
        note1.color = "black";
        note1.cpu = "i5";
        note1.hddSize = "1000";
        note1.ramSize = "16";
        note1.isOs = "да";

        Notebook note5 = new Notebook();
        note1.tradeMark = "MSI";
        note1.color = "white";
        note1.cpu = "AMD";
        note1.hddSize = "500";
        note1.ramSize = "4";
        note1.isOs = "да";

        Notebook note6 = new Notebook();
        note1.tradeMark = "ACER";
        note1.color = "black";
        note1.cpu = "intel";
        note1.hddSize = "2000";
        note1.ramSize = "8";
        note1.isOs = "да";

        Notebook note7 = new Notebook();
        note1.tradeMark = "ASUS";
        note1.color = "white";
        note1.cpu = "intel";
        note1.hddSize = "500";
        note1.ramSize = "8";
        note1.isOs = "нет";

        Notebook note8 = new Notebook();
        note1.tradeMark = "HP";
        note1.color = "white";
        note1.cpu = "intel";
        note1.hddSize = "3000";
        note1.ramSize = "32";
        note1.isOs = "да";

        Notebook note9 = new Notebook();
        note1.tradeMark = "MSI";
        note1.color = "white";
        note1.cpu = "AMD";
        note1.hddSize = "1000";
        note1.ramSize = "8";
        note1.isOs = "нет";

        Notebook note10 = new Notebook();
        note1.tradeMark = "ASUS";
        note1.color = "black";
        note1.cpu = "intel";
        note1.hddSize = "1000";
        note1.ramSize = "32";
        note1.isOs = "да";

//        Set<Notebook> notebooks = new HashSet<Notebook>(Arrays.asList(note1, note2, note3,
//                note4, note5, note6, note7, note8, note9, note10));
        List<Notebook> notebooks = new ArrayList<>(Arrays.asList(note1, note2, note3,
                note4, note5, note6, note7, note8, note9));
        Order order = buyerDialog();
        findIt(order, notebooks);


    }
    static void findIt(Order ord, List<Notebook> notes){

        int count = 0;
        for (int i = 0; i <notes.size() ; i++) {
            if(notes.get(i).tradeMark.equals(ord.tradeMark) || ord.tradeMark.equals("*")){
                if (notes.get(i).color.equals(ord.color) || ord.color.equals("*")){
                    if(notes.get(i).cpu.equals(ord.cpu) || ord.cpu.equals("*")){
                        if(notes.get(i).hddSize.equals(ord.hddSize) || ord.hddSize.equals("*")){
                            if (notes.get(i).ramSize.equals(ord.ramSize) || ord.ramSize.equals("*")){
                                if(notes.get(i).isOs.equals(ord.isOs) || ord.isOs.equals("*")){
                                    count++;
                                    notes.get(i).showParam();
                                }
                                }
                            }
                        }
                    }
                }
            }
        if (count == 0){
            System.out.println("Сожалеем но ноутбука с такими  параметрами у нас нет.");
        }
        else {
            System.out.println("Найдено " + count + " совпадений. ");
        }
        }
//    }
    static Order buyerDialog(){
        Scanner scan = new Scanner(System.in);
        Order order = new Order();

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

        order.viewOrder(order.tradeMark, order.color, order.cpu,
                order.hddSize, order.ramSize, order.isOs);


        System.out.println("Начнём с торговой марки. " +
                "В продаже ноутбуки четырёх вендоров: MSI, ASUS, ACER, HP.\n" +
                " Если это не важно нажмите ENTER  или впишите название и нажмите ENTER ");

        String vendor = scan.nextLine();
        order.tradeMark = checkAnswer(vendor);
        order.viewOrder(order.tradeMark, order.color, order.cpu,
                order.hddSize, order.ramSize, order.isOs);

        System.out.println("Выберите объём жёсткого диска. " +
                "В продаже ноутбуки  с дисками размером: 500, 1000, 2000, 3000  гигабайт \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String hdd = scan.nextLine();
        order.hddSize = checkAnswer(hdd);
        order.viewOrder(order.tradeMark, order.color, order.cpu,
                order.hddSize, order.ramSize, order.isOs);

        System.out.println("Выберите объём оперативной памяти. " +
                "В продаже ноутбуки с установленными объёмами ОЗУ: 4, 8, 16, 32  гигабайта \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String ram = scan.nextLine();
        order.ramSize = checkAnswer(ram);
        order.viewOrder(order.tradeMark, order.color, order.cpu,
                order.hddSize, order.ramSize, order.isOs);

        System.out.println("Выберите процессор. " +
                "В продаже ноутбуки с установленными процессорами: intel и  AMD  \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String cpu = scan.nextLine();
        order.cpu = checkAnswer(cpu);
        order.viewOrder(order.tradeMark, order.color, order.cpu,
                order.hddSize, order.ramSize, order.isOs);

        System.out.println("Наличие предустановленной ОС " +
                "да - если нужна, нет - если не нужна  \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String os = scan.nextLine();
        order.isOs = checkAnswer(os);
        order.viewOrder(order.tradeMark, order.color, order.cpu,
                order.hddSize, order.ramSize, order.isOs);

        System.out.println("И самое важное в финале, выберите цвет " +
                "К сожалению розовые закончились, в наличии только чёрные и белые  \n" +
                " Если это не важно нажмите ENTER  или впишите значение  и нажмите ENTER ");

        String color = scan.nextLine();
        order.color = checkAnswer(color);
        order.viewOrder(order.tradeMark, order.color, order.cpu,
                order.hddSize, order.ramSize, order.isOs);
        return order;

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
