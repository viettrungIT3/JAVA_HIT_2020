package Bai_1;

import java.util.Scanner;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String tenHangSX;
    private String ngayNhap;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập mã sản phẩm: ");
        this.maSanPham = scanner.nextLine();
        System.out.printf("Nhập tên sản phẩm: ");
        this.tenSanPham = scanner.nextLine();
        System.out.printf("Nhập hãng sản xuất: ");
        this.tenHangSX = scanner.nextLine();
        System.out.printf("Ngày nhập: ");
        this.ngayNhap = scanner.nextLine();
    }

    public void Xuat() {
        System.out.printf("%15s %15s %15s %15s ", maSanPham, tenSanPham, tenHangSX, ngayNhap);
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }
}
