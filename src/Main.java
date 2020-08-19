import java.util.Scanner;
// tworzenie 5 tablic z imionami które sam podaje wyświetla się w liniach
public class Main {
    public static void main(String[] args) {
        String[] a = new String[5];
        System.out.println("Tap a name :");
        Scanner name = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        a[i] = name.nextLine();
        for (int i = 0; i < 5; i++){
            System.out.println("Cześć " + a[i]);
        }
    }
}
