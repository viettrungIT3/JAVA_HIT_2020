package Bai_2;

import java.util.Scanner;

public class SoPhuc {
    private int thuc;
    private int ao;

    public SoPhuc() {
    }

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public void Nhap( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số thực: ");
        this.thuc = scanner.nextInt();
        System.out.printf("Nhập số ảo: ");
        this.ao = scanner.nextInt();
    }
     public void Xuat() {
         System.out.println("Số phức(" + thuc + "," + ao + ")");
     }

     public SoPhuc Cong( SoPhuc this,  SoPhuc B) {
        SoPhuc C = new SoPhuc( 0, 0);
        C.thuc = this.thuc + B.thuc;
        C.ao = this.ao + B.ao;
        return C;
     }

    public SoPhuc Tru( SoPhuc this,  SoPhuc B) {
        SoPhuc C = new SoPhuc( 0, 0);
        C.thuc = this.thuc - B.thuc;
        C.ao = this.ao - B.ao;
        return C;
    }
}
