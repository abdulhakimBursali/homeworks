import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        int number1,number2,select;
        Scanner input= new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        number1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        number2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam : " +( number1 + number2));
                break;
            case 2:
                System.out.println("Toplam : " +( number1 - number2));
                break;
            case 3:
                System.out.println("Toplam : " +( number1 * number2));
                break;
            case 4:
                System.out.println("Toplam : " +( number1 / number2));
                break;
            default:
                System.out.print("Yanlış bir seçim yaptınız. Lütfen sonra tekrar deneyin");
        }
    }
}
