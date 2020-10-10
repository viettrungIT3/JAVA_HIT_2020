package Bai_4;

import java.util.Scanner;

public class Array {
    private int n;
    private int[] arr;

    public Array(int n, int[] arr) {
        this.n = n;
        this.arr = arr;
    }

    public Array(){

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void InPutDaTa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n = ");
        n = scanner.nextInt();
        System.out.printf("Enter ARRAY: ");
        arr = new int[n];
//        for (int x : arr) {
//            x = scanner.nextInt();
//        }
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public void  Show() {
        System.out.printf("Show ARRAY: ");
        for ( int x : arr ) {
            System.out.printf( x + " ");
        }
        System.out.println();
    }

    public int SumArray() {
        int sum = 0;
        for ( int x : arr ) {
            sum += x;
        }
        return sum;
    }

    public float TBC() {
        return SumArray()/n;
    }
}
