import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int r,a,cevre;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarıçapı: ");
        r = inp.nextInt();

        System.out.println("Dairenin merkez ölçüsü: ");
        a = inp.nextInt();

        System.out.println("Dairenin alanı: " + ((3.14 * (r*r) * a) / 360));


    }
}


