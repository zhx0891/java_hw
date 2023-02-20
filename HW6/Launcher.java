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
        note2.tradeMark = "ASUS";
        note2.color = "white";
        note2.cpu = "intel";
        note2.hddSize = "500";
        note2.ramSize = "4";
        note2.isOs = "нет";

        Notebook note3 = new Notebook();
        note3.tradeMark = "HP";
        note3.color = "white";
        note3.cpu = "i6";
        note3.hddSize = "2000";
        note3.ramSize = "16";
        note3.isOs = "да";

        Notebook note4 = new Notebook();
        note4.tradeMark = "MSI";
        note4.color = "black";
        note4.cpu = "i5";
        note4.hddSize = "1000";
        note4.ramSize = "16";
        note4.isOs = "да";

        Notebook note5 = new Notebook();
        note5.tradeMark = "MSI";
        note5.color = "white";
        note5.cpu = "AMD";
        note5.hddSize = "500";
        note5.ramSize = "4";
        note5.isOs = "да";

        Notebook note6 = new Notebook();
        note6.tradeMark = "ACER";
        note6.color = "black";
        note6.cpu = "intel";
        note6.hddSize = "2000";
        note6.ramSize = "8";
        note6.isOs = "да";

        Notebook note7 = new Notebook();
        note7.tradeMark = "ASUS";
        note7.color = "white";
        note7.cpu = "intel";
        note7.hddSize = "500";
        note7.ramSize = "8";
        note7.isOs = "нет";

        Notebook note8 = new Notebook();
        note8.tradeMark = "HP";
        note8.color = "white";
        note8.cpu = "intel";
        note8.hddSize = "3000";
        note8.ramSize = "32";
        note8.isOs = "да";

        Notebook note9 = new Notebook();
        note9.tradeMark = "MSI";
        note9.color = "white";
        note9.cpu = "AMD";
        note9.hddSize = "1000";
        note9.ramSize = "8";
        note9.isOs = "нет";

        Notebook note10 = new Notebook();
        note10.tradeMark = "ASUS";
        note10.color = "black";
        note10.cpu = "intel";
        note10.hddSize = "1000";
        note10.ramSize = "32";
        note10.isOs = "да";

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
