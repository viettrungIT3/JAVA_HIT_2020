package Bai_4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy X;
    private May[] Y;
    private int n;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tNhâp thông tin phòng máy: ");
        System.out.printf("Nhập mã phòng: ");       this.maPhong = scanner.nextLine();
        System.out.printf("Nhập tên phòng: ");      this.tenPhong = scanner.nextLine();
        System.out.printf("Nhập diện tích: ");      this.dienTich = scanner.nextInt();
        X = new QuanLy();
        X.Nhap();
        System.out.printf("Nhập số máy trong phòng: ");     this.n = scanner.nextInt();
        Y = new May[n+5];
        for (int i = 0; i < n; i++) {
            Y[i] = new May();
            Y[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("\t\t\tTHÔNG TIN PHÒNG MÁY");
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich + "m2.");
        X.Xuat();
        System.out.printf("%20s %20s %20s", "Ma May", "Kieu May", "Tinh Trang");
        System.out.println();
        for (int i = 0; i < n; i++) {
            Y[i].Xuat();
        }
    }
}
