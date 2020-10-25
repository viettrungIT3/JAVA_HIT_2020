package Bai_5;

import java.util.Arrays;
import java.util.Scanner;

public class LopHoc {
    private String maLop;
    private String tenLop;
    private String ngayMo;
    private SinhVien[] x;
    private int n;
    private String giaoVien;

    public LopHoc() {
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public SinhVien[] getX() {
        return x;
    }



    public void NhapX() {
        Scanner scanner = new Scanner(System.in);
        SinhVien[] X = new SinhVien[ n];
        for (int i = 0; i < n; i++) {
//            SinhVien A = new SinhVien();
            System.out.println("Nhâp SV thứ " + (i+1));
            X[i] = new SinhVien();
            System.out.print("  Nhập mã SV: ");
            scanner.nextLine();
            X[i].setMaSV( scanner.nextLine());
            X[i].Nhap();
            System.out.print("  Nhập tên ngành: ");
            X[i].setNganh( scanner.nextLine());
            System.out.print("  Nhập khóa: ");
            X[i].setKhoaHoc( scanner.nextInt());
        }
    }

    public void XuatX() {
        for (int i = 0; i < n; i++) {
            x[i].XuatSV();
        }

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "maLop='" + maLop + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", ngayMo='" + ngayMo + '\'' +
                ", x=" + Arrays.toString(x) +
                ", n=" + n +
                ", giaoVien='" + giaoVien + '\'' +
                '}';
    }
}
