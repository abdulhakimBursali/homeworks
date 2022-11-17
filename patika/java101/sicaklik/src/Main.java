import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);
        heat = input.nextInt();

        if(heat > 25){
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }else if(heat < 5){
            System.out.println("Kayağa Gidebilirsiniz.");
        }else if(heat >= 5 && heat <= 25){
            if(heat <= 15){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
            if(heat >= 10){
                System.out.println("Pikniğe Gidebilirsiniz.");
            }
        }
    }
}