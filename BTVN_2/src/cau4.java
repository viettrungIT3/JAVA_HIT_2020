import java.util.Scanner;

public class cau4 {
    public static Scanner scanner = new Scanner(System.in);

    public static boolean isPrime( int x) {
        if (x < 2) {
            return false;
        }
        int sqrtRoot = (int) Math.sqrt(x);
        for (int i = 2; i <= sqrtRoot; i++) {
            if ( x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n =scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            do {
                a[i] = scanner.nextInt();
            } while ( a[i] < 0 );
        }
        int[] prime = new int[100];
        int j = 0;
        for (int i = 2; i < 5000; i++) {
            if (isPrime(i)) {
                prime[j++] = i;
                //System.out.println(prime[j] + " ");
                //j++;
            }
            if (j == 99) {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += ( isPrime(a[i]) ? a[i] + prime[i] - i : a[i] );
        }
        System.out.println("Sum = " + sum);
    }
}
