import java.util.Scanner;

public class hwTwo {
    public static void main(String[] args) {
//        firstTaskFromSeminar();
        secondTaskFromSeminar("aaabbbcccddd");



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
    static void secondTaskFromSeminar(String line){
        int count = 0;
        StringBuilder result = new StringBuilder();
        String tmp = String.valueOf(line.charAt(0));
        for (int i = 0; i < line.length(); i++) {
            if (String.valueOf(line.charAt(i)).equals(tmp)){
                count++;
            }else{
                result.append(count);
                result.append(tmp);
                count = 1;
                tmp = String.valueOf(line.charAt(i));
            }
        }
        System.out.println(result);

    }
}
