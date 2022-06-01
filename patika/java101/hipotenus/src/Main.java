import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int a, b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin 1. kenarını giriniz: ");
        a = scanner.nextInt();

        System.out.print("Üçgenin 2. kenarını giriniz: ");
        b = scanner.nextInt();

        c = Math.sqrt(a * a + b * b);
        System.out.print("Hipotenüs: ");
        System.out.format("%.2f", c);
    }
}
