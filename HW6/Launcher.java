package HW6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Launcher {
    public static void main(String[] args) {

        Notebook note1 = new Notebook();
        note1.tradeMark = "MSI";
        note1.color = "black";
        note1.cpu = "i5";
        note1.hddSize = "1000";
        note1.ramSize = "16";
        note1.isOs = true;

        Notebook note2 = new Notebook();
        note1.tradeMark = "ASUS";
        note1.color = "white";
        note1.cpu = "i3";
        note1.hddSize = "500";
        note1.ramSize = "4";
        note1.isOs = false;

        Notebook note3 = new Notebook();
        note1.tradeMark = "HP";
        note1.color = "white";
        note1.cpu = "i6";
        note1.hddSize = "2000";
        note1.ramSize = "16";
        note1.isOs = true;

        Notebook note4 = new Notebook();
        note1.tradeMark = "MSI";
        note1.color = "black";
        note1.cpu = "i5";
        note1.hddSize = "1000";
        note1.ramSize = "16";
        note1.isOs = true;

        Notebook note5 = new Notebook();
        note1.tradeMark = "MSI";
        note1.color = "white";
        note1.cpu = "i3";
        note1.hddSize = "500";
        note1.ramSize = "4";
        note1.isOs = false;

        Notebook note6 = new Notebook();
        note1.tradeMark = "ACER";
        note1.color = "black";
        note1.cpu = "i3";
        note1.hddSize = "2000";
        note1.ramSize = "8";
        note1.isOs = true;

        Notebook note7 = new Notebook();
        note1.tradeMark = "ASUS";
        note1.color = "white";
        note1.cpu = "i3";
        note1.hddSize = "500";
        note1.ramSize = "8";
        note1.isOs = false;

        Notebook note8 = new Notebook();
        note1.tradeMark = "HP";
        note1.color = "white";
        note1.cpu = "i5";
        note1.hddSize = "3000";
        note1.ramSize = "32";
        note1.isOs = true;

        Notebook note9 = new Notebook();
        note1.tradeMark = "MSI";
        note1.color = "white";
        note1.cpu = "AMD";
        note1.hddSize = "1000";
        note1.ramSize = "8";
        note1.isOs = false;

        Notebook note10 = new Notebook();
        note1.tradeMark = "ASUS";
        note1.color = "black";
        note1.cpu = "i7";
        note1.hddSize = "1000";
        note1.ramSize = "32";
        note1.isOs = true;

        var notebooks = new HashSet<Notebook>(Arrays.asList(note1, note2, note3, note4, note5, note6, note7, note8, note9, note10));
        buyerDialog(notebooks);
    }
    static void buyerDialog(Set notes){
        Scanner scan = new Scanner(System.in);
        Order order = new Order();
        System.out.println("Добро пожаловать в наш магазин. Давайте зададим критерии вашего нового ноутбука. " +
                "Продолжить? да\\нет");
        String begin = scan.nextLine();
        if(begin.equals("да")){
            System.out.println();
        }
        else {
            System.exit(0);
        }

        order.viewOrder(order.tradeMark, order.color, order.cpu, order.hddSize, order.ramSize, order.isOs);
        System.out.print("Начнём с торговой марки. В продаже ноутбуки четырёх вендоров: MSI, ASUS, ACER, HP.\n" +
                " Если это не важно нажмите ENTER  или впишите название и нажмите ENTER ");
        String vendor = scan.nextLine();
        order.tradeMark = checkAnswer(vendor);
        order.viewOrder(order.tradeMark, order.color, order.cpu, order.hddSize, order.ramSize, order.isOs);
    }
    static String checkAnswer(String answ){
        if(answ.length() != 0){
            return answ;
        }else {
            return " ";
        }
    }

}
