package HW6;

public class Notebook {

     private String tradeMark;
     private String color;
     private String cpu;
     private String hddSize;
     private String ramSize;
     private String isOs;

    void setTradeMark(String tm){
         this.tradeMark = tm;
     }
    void setColor(String color){
        this.color = color;
    }
    void setCpu(String cpu){
        this.cpu = cpu;
    }
    void setHddSize(String hdd){
        this.hddSize = hdd;
    }
    void setRamSize(String rm){
        this.ramSize = rm;
    }
    void setIsOs(String os){
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
        return this.getHddSize();
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
