package Bai_2;

import java.util.Scanner;

public class Date {
    protected int D;
    protected int M;
    protected int Y;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");     this.D = scanner.nextInt();
        System.out.print("Nhập tháng: ");    this.M = scanner.nextInt();
        System.out.print("Nhập năm: ");      this.Y = scanner.nextInt();
    }

    public void Xuat() {
        System.out.println("Ngày sinh:  " + D + "/" + M + "/" + Y);
    }
}
