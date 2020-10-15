package Bai_2;

import java.util.Scanner;

public class NhanSu {
    private String maNhanSu;
    private String hoTen;
    private Date ngaySInh;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập mã nhan sự: ");     this.maNhanSu = scanner.nextLine();
        System.out.printf("Nhập họ và ten: ");      this.hoTen = scanner.nextLine();
        ngaySInh = new Date();
        System.out.println("Nhập ngày sinh: ");     ngaySInh.Nhap();
    }

    public void Xuat() {
        System.out.println("Thông tin: ");
        System.out.println("Mã nhan sự: " + maNhanSu);
        System.out.println("Họ và tên:  " + hoTen);
        ngaySInh.Xuat();
    }
}
