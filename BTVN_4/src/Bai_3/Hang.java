package Bai_3;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private int donGia;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập mã hàng:  ");        this.maHang = scanner.nextLine();
        System.out.printf("Nhập tên hàng: ");        this.tenHang = scanner.nextLine();
        System.out.printf("Nhập đơn giá:  ");        this.donGia = scanner.nextInt();
    }

    public void Xuat() {
        System.out.printf("%20s %20s %20d", maHang, tenHang, donGia);
    }
}
