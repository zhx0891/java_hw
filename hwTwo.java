import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class hwTwo {
    public static void main(String[] args) throws IOException {
        //задачи с семинара
//        firstTaskFromSeminar();
//        secondTaskFromSeminar("aaabbbcccddd");
//        System.out.println(thirdTaskFromSeminar("dfasdfafdsafd"));
//        fourthTaskFromSeminar();
        fifthTaskFromSeminar();





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
    static boolean thirdTaskFromSeminar(String line){

        int cot = 0;
        for (int i = 0; i < (line.length() / 2) ; i++) {
            cot++;

            if(String.valueOf(line.charAt(i)).equals(String.valueOf(line.charAt(line.length() - cot)))){
                continue;
            }
            else{return false;}

        }
        return true;
    }


    static void fourthTaskFromSeminar() throws IOException {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 100 ; i++) {
            result.append(i +":"+"test"+" ");
        }
        System.out.println(result);
        FileWriter fw = new FileWriter("100test.txt");
//        String toFile = result.toString();
        fw.write(result.toString());//toString() стрингбилдер в строку
        fw.close();

    }


    static void fifthTaskFromSeminar() throws IOException {
        String [] listDir = getListDir();
        for (String str : listDir)
        {
            System.out.println(str);
        }
        
//        File directory = new File("");
//        for(File file : directory.listFiles())
//        {
//            System.out.println(file.getName());
//        }

    }
    static String[] getListDir(){
     File directory = new File("");
     String path = directory.getAbsolutePath();
     File curDir = new File(path);
     String [] dir = new String[];
     int count = 0;
     for (File fi : curDir.listFiles())
     {
         dir[count] = fi.getName();
         count++;
     }
        return dir;

    }
}
