package HW7;

public class HotDrink extends Drink {


    HotDrink(String aTradeMark, double aVolume, int aTemperature) {
        super(aTradeMark, aVolume, aTemperature);
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
//        return null;
    }
}


