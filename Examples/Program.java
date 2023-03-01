package Examples;

import java.util.Iterator;



public class Program {
    public static void main(String[] args) {

         Worker worker = new Worker("Имя", "Фамилия", 23, 4567);

         Iterator<String> components = worker;

         while (components.hasNext()) {
             System.out.println(worker.next());
         }
    }
}
