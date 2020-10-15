package Bai_4;

import java.util.Scanner;

public class May {

    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập mã máy:     ");     this.maMay = scanner.nextLine();
        System.out.printf("Nhập kiểu máy:   ");     this.kieuMay = scanner.nextLine();
        System.out.printf("Nhập tình trang: ");     this.tinhTrang = scanner.nextLine();
    }

    public void Xuat() {
        System.out.printf("%20s %20s %20s", maMay, kieuMay, tinhTrang);
        System.out.println();
    }
}
