package GENERICS;

public class RestrictionTypes {
    public static void main(String[] args) {
        Point1<Integer> pti = new Point1<>(1,3);
        Point1<Double> ptd = new Point1<>(1.0, 3.0);
        System.out.println(pti.equalsPoint(ptd));
    }
}

class Point1<T extends Number> { //принимает любой тип <Т>  наследумых от Number
    public T x, y;

    public Point1(T x, T y) {
        this.x = x;
        this.y = y;
    }


    double getMax() {
        double xd = x.doubleValue();
        double yd = y.doubleValue();

        return (xd < yd) ? yd : xd;
    }

    boolean equalsPoint(Point1<?> pt) {// здесь ?  - метасимвольный аргумент, вместо обобщенного типа Т указывается произвольный, обобщённый тип
        // (который тоже можно ограничить, например <? extends Number>
        return (this.x.doubleValue() == pt.x.doubleValue() && this.y.doubleValue() == pt.y.doubleValue());
    }
}

interface I1{}
interface I2{}
class Point2<T extends Number & I1, I2>{} //принимает любой класс наследуемый от Number  и реализующий интерфейсы I1, I2


