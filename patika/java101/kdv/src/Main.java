import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double tutar, oran;

        System.out.println("Tutar Giriniz:");
        Scanner input = new Scanner(System.in);
        tutar = input.nextInt();
        System.out.println("KDV Dahil Fiyat:" + KDV(tutar));
    }
    
    public static double KDV(double tutar){
        return tutar > 1000 ? tutar + (tutar * 0.8) : tutar + (tutar * 0.18);
    }
}
