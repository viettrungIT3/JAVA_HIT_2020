package Bai_3;

import java.util.Scanner;

public class Phieu {

    private String maPhieu;
    private String tenPhieu;
    private DateTime a;
    private SanPham[] x;
    private int n;

    public void InputPhieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập mã phiếu: ");
        this.maPhieu = scanner.nextLine();
        System.out.printf("Nhập tên phiếu: ");
        this.tenPhieu = scanner.nextLine();
        a = new DateTime();
        a.InputDate();
        System.out.printf("Nhập số sản phẩm n = ");
        this.n = scanner.nextInt();
        x = new SanPham[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm thứ: " + (i+1));
            x[i] = new SanPham();
            x[i].InputSP();
        }
    }

    public void OutputPhieu() {
        System.out.println("Mã Phiếu: "+ maPhieu);
        System.out.println("Tên Phiếu: "+ tenPhieu);
        a.OutputDate();
        System.out.printf("%20s %20s %20s %20s %20s ", "Mã SP", "Tên SP", "Số Lượng", "Đơn Gía", "Thành Tiền" );
        for (int i = 0; i < n; i++) {
            x[i].OutputSP();
        }
    }
}
