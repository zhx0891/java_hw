package HW6;

public class Notebook {

     private String tradeMark;
     private String color;
     private String cpu;
     private String hddSize;
     private String ramSize;
     private String isOs;
public Notebook(String tm, String color, String cpu, String hdd, String ram, String os){
    this.tradeMark = tm;
    this.color = color;
    this.cpu = cpu;
    this.hddSize = hdd;
    this.ramSize = ram;
    this.isOs = os;

}


    String getMark(){
        return this.tradeMark;
    }

    String getColor(){
        return this.color;
    }

    String getCpu(){
        return this.cpu;
    }

    String getHddSize(){
        return this.hddSize;
    }

    String getRamSize(){
        return this.ramSize;
    }

    String getIsOs(){
        return this.isOs;
    }


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
