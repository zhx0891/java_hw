package HW6;

public class Order {
    String tradeMark = "пусто";
    String color = "пусто";
    String cpu = "пусто";
    String hddSize = "пусто";
    String ramSize = "пусто";
    String isOs = "пусто";

    public void viewOrder (String tm, String color, String cpu, String hdd, String ram, String os){
        System.out.println( "1. Объём оперативной памяти.\n" +
                "2. Объём жёсткого диска.  - "+ hdd +" \n" +
                "3. Торговая марка. - " + tm + "\n" +
                "4. Процессор. - " + cpu + "\n" +
                "5. Операционная система. - " + os + "\n" +
                "6. Цвет - " + color );
    }
}
