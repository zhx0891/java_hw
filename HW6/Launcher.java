package HW6;

import java.util.*;

public class Launcher {
    public static void main(String[] args) {

        Notebook note1 = new Notebook("MSI", "black", "intel", "1000", "16", "да");
        Notebook note2 = new Notebook("ACER", "white", "AMD", "5000","8", "да");
        Notebook note3 = new Notebook("HP", "white", "intel", "2000", "16", "да");
        Notebook note4 = new Notebook("ASUS", "white", "AMD", "3000", "4", "нет");
        Notebook note5 = new Notebook("HP", "white", "intel", "3000", "32", "нет");

        List<Notebook> notebooks = new ArrayList<>(Arrays.asList(note1, note2, note3, note4, note5));

        OrderNotebook orderNotebook = Viewer.buyerDialog();
        System.out.println(notebooks.get(0).getMark());
        Controller.findIt(orderNotebook, notebooks);

    }
}
