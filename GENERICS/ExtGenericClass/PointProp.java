package GENERICS.ExtGenericClass;

public class PointProp<T> {
    T id, color;

    public static void main(String[] args) {
        Point2D<Integer> p2 = new Point2D<>(4, 55);
        Point3D<Float> p3 = new Point3D<>(13f, 45f, 89f);
        if(p2 instanceof Point2D<?>) {
            System.out.println("Да");
        }
    }
}
class Point2D<T2D> extends PointProp<T2D> {//здесь обобщённый тип  должен быть только наследником  PointProp
    T2D x, y;

    public Point2D(T2D x, T2D y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D<T3D> extends PointProp<T3D> {
    T3D x, y, z;

    public Point3D(T3D x, T3D y, T3D z ) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
