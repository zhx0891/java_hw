package HW7;

import java.util.Iterator;

abstract class Drink implements Iterator {
    private String tradeMark;
    private double volume;
    private int temperature;

    Drink(String aTradeMark, double aVolume, int aTemperature){
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
    double getVolume(){
        return this.volume;
    }
    int getTemperature(){
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
                return String.format("Наименование: %s", this.getTradeMark());

            case (2):
                return String.format("Объём : %f", this.getVolume());

            case (3):
                return String.format("Температура: %d", this.getTemperature());

            default:
                return String.format("Некорректынй ввод");
        }

    }
}
