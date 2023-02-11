package HW6;

public class Notebook {
    static String tradeMark;
    static String color;
    static String cpu;
    static String hddSize;
    static String ramSize;
    static String isOs;
    static void showParam(){
        System.out.println(
                        " Торговая марка. - " + tradeMark + "\n" +
                        " Объём жёсткого диска.  - "+ hddSize +" \n" +
                        " Объём оперативной памяти. - " + ramSize + "\n" +
                        " Процессор. - " + cpu + "\n" +
                        " Операционная система. - " + isOs + "\n" +
                        " Цвет - " + color );
    }

}
