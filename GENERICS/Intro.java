package GENERICS;

public class Intro {

    public static void main(String[] args) {
        Point<Integer, String> pti = new Point<>(5, 6, "передаю два типа данных, интеджер и стринг");
        Point<Double, Float> ptd = new  Point<>(6.0, 2.0, 45f);
        Point<String, String> pts = new Point<>("5", "6", "ff");
        for (Object coord: ptd.getCoords())
            System.out.println(coord);
    }

}
class Point<T, V> {
    public T x, y;
    public V z;
    Point(T x, T y, V z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }
    Object[] getCoords(){
        return new Object[] {x, y};
    }
}
