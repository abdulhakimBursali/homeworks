import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double km = 2.2, totalKm, totalPrice;
        int firstPrice = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Km giriniz: ");
        totalKm = input.nextDouble();

        totalPrice = firstPrice + (totalKm * km);

        totalPrice = (totalPrice < 20) ? 20 : totalPrice;
        System.out.println("Toplam Tutar: " + totalPrice);

    }

}

