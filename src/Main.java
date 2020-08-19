import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int[] [] a = new int[10] [10];
       for (int i = 0; i < a.length; i++) {

           int[] b = a[i];
           for (int j = 0; j < b.length; j++){
               System.out.println(a[i][j]);
           }
       }
    }
}
