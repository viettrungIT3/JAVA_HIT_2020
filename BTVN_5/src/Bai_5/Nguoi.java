package Bai_5;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("  Nhập họ và tên: ");
        this.hoTen =scanner.nextLine();
        System.out.printf("  Nhập ngày sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.printf("  Quê quán: ");
        this.queQuan = scanner.nextLine();
    }

    public void Xuat() {
        System.out.printf("%20 %20 %20 " + hoTen, ngaySinh, queQuan);
    }
}
