package HW6;

public class Notebook {
     String tradeMark;
     String color;
     String cpu;
     String hddSize;
     String ramSize;
     String isOs;
     void showParam(){
        System.out.println(
                        " Торговая марка. - " + tradeMark + "\n" +
                        " Объём жёсткого диска.  - "+ hddSize +" \n" +
                        " Объём оперативной памяти. - " + ramSize + "\n" +
                        " Процессор. - " + cpu + "\n" +
                        " Операционная система. - " + isOs + "\n" +
                        " Цвет - " + color );
        System.out.println();
    }

}
