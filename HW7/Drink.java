package HW7;

import java.util.Iterator;

abstract class Drink implements Iterator {
    private String tradeMark;
    private String volume;
    private String temperature;

    Drink(String aTradeMark, String aVolume, String aTemperature){
        this.temperature = aTemperature;
        this.tradeMark = aTradeMark;
        this.volume = aVolume;
    }
    void showParam(){
        System.out.println(this.tradeMark +"\n"+
                this.volume +"\n"+
                this.temperature);
    }
    String getTradeMark(){
        return this.tradeMark;
    }
    String getVolume(){
        return this.volume;
    }
    String getTemperature(){
        return this.temperature;
    }
    int count;
    @Override
    public boolean hasNext() {
        return count++ < 3;
    }

    @Override
    public String next() { // почему не смог сделать метод void ?
        switch (count){
            case (1):
                return  this.getTradeMark();

            case (2):
                return this.getVolume();

            case (3):
                return  this.getTemperature();

            default:
                return String.format("Некорректынй ввод");
        }

    }
}
