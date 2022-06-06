import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double boy, kilo;

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        System.out.println("Vucüt kitle indeksiniz: " + (kilo/(boy * boy)));
    }
}
