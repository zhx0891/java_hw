package HW4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HwFour {
    public static void main(String[] args) {
//Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<Integer> ll = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            ll.add(rand.nextInt(11));
        }
        System.out.println(ll);
        System.out.println(taskOne(ll));
    }
    static List taskOne(List lst){
        List lstReturn = new LinkedList();
        for (int i = lst.size() - 1; i >= 0; i--) {
            lstReturn.add(lst.get(i));
        }
        System.out.println(lstReturn);

    }
}



//Реализуйте очередь с помощью LinkedList со следующими методами
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

//В калькулятор добавьте возможность отменить последнюю операцию.

