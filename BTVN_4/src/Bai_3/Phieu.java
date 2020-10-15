package Bai_3;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang[] X;
    private int n;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập mã phiếu: ");       this.maPhieu = scanner.nextLine();
        System.out.printf("Nhập số mặt hàng: ");    this.n = scanner.nextInt();
        X = new Hang[n];
        for (int i = 0; i < n; i++) {
            X[i] = new Hang();
            System.out.println("Nhập mặt hàng thứ " + (i+1));
            X[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("------------------DISPLAY-------------------");
        System.out.println("Mã phiếu: " + maPhieu);
        for (int i = 0; i < n; i++) {
            X[i].Xuat();
            System.out.println();
        }
    }
}
