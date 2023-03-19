package HW9;

public class Controller {


    public static String checkInput(String inp){
        if (inp.equals("c++") || inp.equals("java"))
        return Model.makeIt(inp);
        else {
            return String.format("%s we not make this", inp);
        }
    }
}
