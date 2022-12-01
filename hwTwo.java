import java.util.Scanner;

public class hwTwo {
    public static void main(String[] args) {
        firstTaskFromSeminar();


    }
    static void firstTaskFromSeminar(){
        Scanner userInp = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int a = 1;
        int b = 0;
        int c = userInp.nextInt();
        int count = 1;
        for (int i = 0; i < c ; i++) {
            if (count % 2 != 0){
                result.append(a);
            }else {result.append(b);}
            count++;
        }
        System.out.println(result);


    }
}
