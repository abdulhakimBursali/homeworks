import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int l1,l2,l3,l4;
        float avg;

        Scanner input =new Scanner(System.in);

        System.out.println("İlk ders sinav notunuzu giriniz");
        l1=input.nextInt();

        System.out.println("Ikinci sinav notunuzu giriniz");
        l2= input.nextInt();

        System.out.println("Ucuncu sinav notunuzu giriniz");
        l3=input.nextInt();

        System.out.println("Dorduncu sinav notunuzu giriniz");
        l4= input.nextInt();

        avg = (l1+l2+l3+l4) / 4;

        System.out.println(avg>60 ? "Sinifi gectiniz" : "sinifta kaldiniz");
    }
}
