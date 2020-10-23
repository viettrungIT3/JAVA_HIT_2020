package demo1;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String tenSV;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
    }

    public void  Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap MSV: ");
        this.maSV = scanner.next();
        System.out.printf("Nhap ten SV: ");
        this.tenSV = scanner.next();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", tenSV='" + tenSV + '\'' +
                '}';
    }
}
