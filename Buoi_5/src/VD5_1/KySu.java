package VD5_1;

import java.util.Scanner;

public class KySu extends Person {
    private String nganh;
    private int namTN;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.printf("Nhập ngày sinh: ");
        ngaySinh = scanner.nextLine();
        System.out.printf("Nhập quê quán: ");
        queQuan = scanner.nextLine();
        System.out.printf("Nhập ngành: ");
        nganh = scanner.nextLine();
        System.out.printf("Nhập năm tốt nghiệp: ");
        namTN = scanner.nextInt();
    }

    public void Xuat() {
        System.out.println("Họ tên: " +hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Quê quán: " +queQuan);
        System.out.println("Ngành: " + queQuan);
        System.out.println("Năm tốt nghiệp: " + namTN);
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getNamTN() {
        return namTN;
    }

    public void setNamTN(int namTN) {
        this.namTN = namTN;
    }
}
