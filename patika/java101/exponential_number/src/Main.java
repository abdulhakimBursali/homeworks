import java.util.Scanner;

public class Main {

    static int calc(int taban, int us){
        if(us == 1) {
            return taban;
        }

        return taban * calc(taban, us-1);
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban değeri giriniz :");
        int taban = inp.nextInt();
        System.out.println("Üs değeri giriniz :");
        int us = inp.nextInt();
        System.out.println(calc(taban, us));
    }
}
