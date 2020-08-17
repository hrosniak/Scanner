import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hej jak masz na imię:");
        String name = scan.nextLine();

        System.out.println("Podaj swój wiek: ");
        int age = scan.nextInt();


        System.out.println("Ile zarabiasz: ");
        double salary = scan.nextDouble();

        System.out.println("Cześć " + name);
        System.out.println("Masz " + age + " lat");
        System.out.println("I zarabiasz "+ salary + " USD" );
    }
}
