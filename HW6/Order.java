package HW6;

public class Order {
    String tradeMark = "пусто";
    String color = "пусто";
    String cpu = "пусто";
    String hddSize = "пусто";
    String ramSize = "пусто";
    String isOs = "пусто";

    public void viewOrder (String tm, String color, String cpu, String hdd, String ram, String os){
        clearConsole();
        System.out.println(
                "1. Торговая марка. - " + tm + "\n" +
                "2. Объём жёсткого диска.  - "+ hdd +" \n" +
                "3. Объём оперативной памяти. - " + ram + "\n" +
                "4. Процессор. - " + cpu + "\n" +
                "5. Операционная система. - " + os + "\n" +
                "6. Цвет - " + color );
    }
    static void clearConsole(){
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}
