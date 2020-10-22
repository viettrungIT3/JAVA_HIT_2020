package Bai_3;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int SL;
    private float DG;

    public void InputSP() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("   Nhập mã sản phẩm: ");
        this.maSP = scanner.nextLine();
        System.out.printf("   Nhập tên sản phẩm: ");
        this.tenSP = scanner.nextLine();
        System.out.printf("   Nhập số lượng: ");
        this.SL = scanner.nextInt();
        System.out.printf("   Nhập đơn giá: ");
        this.DG = scanner.nextFloat();
    }

    public void  OutputSP() {
        float TT = (this.SL * this.DG);
        System.out.printf("%20s %20s %20s %20s %20s ", maSP, tenSP, SL, DG, TT );
        System.out.println();
    }
}
