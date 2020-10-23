package KeThua;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String tuoi;
    private String gioiTinh;

    public void  Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.printf("Nhap tuoi: ");
        tuoi = scanner.next();
        System.out.printf("Nhap gioi tinh: ");
        gioiTinh = scanner.next();

    }

    public void Xuat() {
        System.out.println("Ho ten: " +hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " +gioiTinh);
    }

    public Nguoi() {
    }

    public Nguoi(String hoTen, String tuoi, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
