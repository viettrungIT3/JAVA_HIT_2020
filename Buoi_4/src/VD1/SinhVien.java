package VD1;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private Date ngaySinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, Date ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void Show() {
        System.out.print("Tên SV: " + hoTen);
        System.out.println("  MSV: " + maSV);
        System.out.println("Ngay Sinh: " + ngaySinh.toString());
    }

    public void InputInFor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap MSV: ");
        this.maSV = scanner.next();
        System.out.print("Nhap Ho va Ten: ");
        this.hoTen = scanner.next();
        ngaySinh = new Date();
        System.out.println("Nhap Ngay Sinh: ");
        ngaySinh.InPut();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
