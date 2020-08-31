import java.util.Scanner;
/*
Instrukcje warunkowe
 */
public class Main {
    public static void main(String[] args) {
       int a = 10;
       switch(a){
           case 50:
               System.out.println("a jest równe 50");
               break;

           case 100:
               System.out.println("a jest rowne 100");
               break;

           default:
               System.out.println("a nie jest równe ani 50 ani 100 jest równe " + a);
       }

    }
}

