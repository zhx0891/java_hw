package GENERICS;

public class GenericInterfaces {
    public static void main(String[] args) {
        GeomInterface<Float> pt = new Pont4<>();
        pt.setCoord(10f, 20f);

        System.out.println(pt.getCoord(TypeCoord.COORD_X));
        System.out.println(pt.getCoord(TypeCoord.COORD_Y));

    }
}
enum TypeCoord{
    COORD_X, COORD_Y;
}

interface GeomInterface<T> { //Обобщённый интерфейс
    void setCoord(T x, T y);
    T getCoord(TypeCoord type);
}



class Pont4<TT> implements GeomInterface<TT>{ // Здесь о том что интерфейс  примет тот же тип что и класс.
    private TT x, y;

    @Override
    public void setCoord(TT x, TT y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public TT getCoord(TypeCoord type) {
        return (type == TypeCoord.COORD_X) ? x : y;
    }
}