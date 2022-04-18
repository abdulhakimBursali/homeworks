public class Main {

    static boolean isPrime(int n, int i)
    {
        i = i-1;
        if(i==1)
            return true;
        if(n%i==0)
            return false;
        else
            return isPrime(n, i);
    }

    public static void main(String[] args)
    {
        int n = 239;

        if (isPrime(n, n))
            System.out.println("Sayı asal.");
        else
            System.out.println("Sayı asal değil.");
    }
}

