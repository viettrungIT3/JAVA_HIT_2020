import java.util.Scanner;

public class bt2_SNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum  = 0;
        for (int i = 0; i < n; i++) {
            if ( ktSNT(a[i]) ) {
                sum += a[i];
            }
        }
        System.out.println("sum = " + sum);
    }
    public static  boolean ktSNT( int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ( n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
