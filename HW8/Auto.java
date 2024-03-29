package HW8;

abstract class Auto {
    private String tradeMark;
    private  int weight;
    private int speed;

    public Auto(String tradeMark, int weight, int speed) {
        this.tradeMark = tradeMark;
        this.weight = weight;
        this.speed = speed;
    }
abstract void ignition();
    public double move(double time){
        return time * this.speed;
    }
    public String toString(){

        return String.format("производитель: %s , масса: %d , скорость: %d ", this.tradeMark, this.weight, this.speed);
    }
}
