package Bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Sach[] A = new Sach[n+5];
        for (int i = 0; i < n; i++) {
            A[i] = new Sach();
            A[i].Nhap();
        }
        for (int i = 0; i < n; i++) {
            A[i].Xuat();
        }
    }
}
