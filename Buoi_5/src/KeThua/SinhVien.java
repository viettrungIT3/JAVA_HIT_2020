package KeThua;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    private String maSV;
    private String ngayNhapHoc;

    public void  Nhap() {
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.printf("Nhap ma sinh vien: ");
        maSV = scanner.next();
        System.out.printf("Ngay nhap hoc:");
        ngayNhapHoc = scanner.next();
    }

    public void Xuat() {
        System.out.println("MSV: " +maSV);
        super.Xuat();
        System.out.println("Ngay Nhap Hoc: " +ngayNhapHoc);
    }

}
