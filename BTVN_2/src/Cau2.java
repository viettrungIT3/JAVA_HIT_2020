import java.util.Scanner;

public class Cau2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void SortArray( int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.printf("Enter n: ");
        int n = scanner.nextInt();
        int [] a = new int[n];
        System.out.println("Enter Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if ( max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Max = " +max);
        System.out.println("Min = " +min);
        SortArray( a, n);
        for (int i = 0; i < n; i++) {
            System.out.printf(a[i] + " ");
        }
    }
}
