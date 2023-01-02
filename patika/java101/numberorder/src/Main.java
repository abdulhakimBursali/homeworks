import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("1. sayı :");
        numbers[0] = input.nextInt();

        System.out.println("2. sayı :");
        numbers[1] = input.nextInt();

        System.out.println("3. sayı :");
        numbers[2] = input.nextInt();

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}