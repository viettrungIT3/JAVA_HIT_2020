package Bai_1;

import javax.sql.rowset.RowSetWarning;
import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nhaXB;
    private int soTrang;
    private int giaTien;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ma sach: ");
        this.maSach = scanner.nextLine();
        System.out.printf("Nhap ten sach: ");
        this.tenSach = scanner.nextLine();
        System.out.printf("Nhap nha xuat ban: ");
        this.nhaXB = scanner.nextLine();
        System.out.printf("Nhap so trang: ");
        this.soTrang = scanner.nextInt();
        System.out.printf("Nhap gia tien: ");
        this.giaTien = scanner.nextInt();
    }

    public void  Xuat() {
//        System.out.println(maSach + "\t" + tenSach + "\t" + nhaXB + "\t" + soTrang + "\t" + giaTien);
        System.out.printf("%20s %20s %20s %20d %20d", maSach, tenSach, nhaXB, soTrang, giaTien);
        System.out.println();
    }

}
