import jdk.jshell.SourceCodeAnalysis;

import java.util.Arrays;
import java.util.Scanner;

public class Cau3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void ShowArray( int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf( a[i] + " ");
        }
    }
    //end Show
    public static void Insert_K_Array( int[] a, int n, int k) {

        //System.out.println("n = " + n);
        for (int i = n; i > k; i--) {
            a[i] = a[i-1];
        }
        a[k] = 0; //thêm 1 phần tử ?
        n++;
        //System.out.println("n = " + n);
    }
    //emd Insert
    public static void Delete_K_Array( int [] a, int k) {
        for (int i = k; i < a.length -1 ; i++) {
            a[i] = a[i+1];
        }
    }
    //end Delete
    public static void Reverse_Array( int[] a ) {
        int m = a.length-1;
        int [] temp = new int[a.length+5];
        int j = 0;
        for (int i = a.length-1; i >=0; i--) {
            temp[j] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int [] a = new int[1000];
        System.out.print("Enter Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("Show Array: ");
        ShowArray( a, n);
        System.out.print("Enter k = ");
        int k = scanner.nextInt();
        k--;
//        Insert_K_Array( a, n, k);
//        n++;
//        Delete_K_Array( a, k);
//        n--;
        //Arrays.sort( a);
        Reverse_Array( a);
//        for (int i = 0; i < (a.length)/2; i++) {
//            int temp = a[i];
//            a[i] = a[a.length - i - 1];
//            a[a.length - i - 1] = temp;
//        }
        System.out.print("Display Array after add k: ");
        ShowArray( a, n);
    }
}
