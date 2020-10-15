package Bai_4;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTenQL;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập mã quản lý: ");     this.maQL = scanner.nextLine();
        System.out.printf("Nhập họ tên QL:  ");     this.hoTenQL = scanner.nextLine();
    }

    public void Xuat() {
        System.out.println("Mã quản lý: " + maQL + "\t\tHọ tên QL: " + hoTenQL);
    }
}
