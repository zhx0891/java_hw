package HW7;

abstract class Drink {
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
}
