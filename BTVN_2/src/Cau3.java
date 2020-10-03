import jdk.jshell.SourceCodeAnalysis;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cau3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void ShowArray( int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print( a[i] + " ");
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
    public static int[] Reverse_Array(int[] a){
        int[] tempArr = new int[a.length];
        int k = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            tempArr[k] = a[i];
            k++;
        }
        return tempArr;
    }
//    public static int[] Reverse_Array( int[] a ) {
//        int j = 0;
//        for (int i = 0; i > a.length/2 ; i++) {
//            int temp = a[i];
//            a[i] = a[a.length - i - 1];
//            a[a.length - i - 1] = temp;
//        }
//        return a;
//    }
    public static void Ca1( int [] a, int n) {
        System.out.println("Phan tu a[1] = " + a[1]);
        System.out.print("Cac phan tu chia het cho a[1] la: ");
        for (int i = 0; i < n; i++) {
            if ( a[i] % a[1] == 0) {
                System.out.print( a[i] + " ");
            }
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
        System.out.print("Enter k = ");
        int k = scanner.nextInt();
        k--;
        System.out.println();
        System.out.println("---------------Menu-------------");
        System.out.println("1. Hien thi mang vua tao: ");
        System.out.println("2. Them mot phan tu vao vi tri k: ");
        System.out.println("3. Xoa mot phan tu o vi tri k. ");
        System.out.println("4. Dao nguoc mang: ");
        System.out.println("5. Hien thi phan tu a[1] va cac so chia het cho a[1].");
        System.out.println("6. Thoat.");
        System.out.println("----------------------------------");
        while (true) {
            System.out.println();
            System.out.print("Moi ban chon: ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1: {
                    System.out.print("Show Array: ");
                    ShowArray( a, n);
                    break;
                }
                case 2: {
                    Insert_K_Array( a, n, k);
                    n++;
//                    System.out.printf("Arrays after Insert: ");
//                    ShowArray( a, n);
                    break;
                }
                case 3: {
                    Delete_K_Array( a, k);
                    n--;
//                    System.out.printf("Arrays after Delete: ");
//                    ShowArray( a, n);
                    break;
                }
                case 4: {
                    a = Reverse_Array( a);
//                    System.out.printf("Array after Reverse: ");
//                    ShowArray(a,n);
                    break;
                }
                case 5: {
                    Ca1( a, n);
                    break;
                }
                case 6: {
                    System.exit(0);
                }
                default:
                    System.out.printf("Ban da nha Sai!!!");
                    break;
            }
            System.out.println();
            System.out.printf("Ban co muon nhap la khong?(c/k): ");
            String ch = scanner.next();
            if (ch.charAt(0) == 'k') {
                System.exit(0);
            }
        }
    }
}
