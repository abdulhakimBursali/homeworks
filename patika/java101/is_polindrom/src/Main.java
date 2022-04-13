import java.util.Scanner;

public class Main {

    static Boolean isPolindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;

        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int value = inp.nextInt();

        if (isPolindrom(value)) {
            System.out.println("Sayı polindrom");
        }else {
            System.out.println("Sayı polindrom değil");
        };
    }
}
