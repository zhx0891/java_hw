package HW6;

import java.util.List;

public class Controller {
    static void findIt(OrderNotebook ord, List<Notebook> notes){
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
        }

        if (count == 0) {
            System.out.println("Сожалеем но ноутбука с такими  параметрами у нас нет.");
        } else {
            System.out.println("Найдено " + count + " совпадений. ");
        }
    }
}
