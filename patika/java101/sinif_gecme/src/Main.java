import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        int mat, fizik, kimya, turkce, muzik;
        int toplam = 0, counter = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        if(mat >= 0 && mat <= 100) {toplam += mat; counter++;}

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        if(fizik >= 0 && fizik <= 100) {toplam += fizik; counter++;}

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();
        if(kimya >= 0 && kimya <= 100) {toplam += kimya; counter++;}

        System.out.print("Turkce notunuz: ");
        turkce = inp.nextInt();
        if(turkce >= 0 && turkce <= 100) {toplam += turkce; counter++;}

        System.out.print("Muzik notunuz: ");
        muzik = inp.nextInt();
        if(muzik >= 0 && muzik <= 100) {toplam += muzik; counter++;}

        double avarage = toplam/counter;

        if(avarage <= 55){
            System.out.println("Sınıfta kaldınız.");
        }else {
            System.out.println("Tebrikler Geçtiniz.");
        }

    }
}
