package Bai_1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private int congSuat;
    private int giaBan;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.printf("Nhập  công suất: ");
        this.congSuat = scanner.nextInt();
        System.out.printf("Nhập giá bán: ");
        this.giaBan = scanner.nextInt();
    }

    public void Xuat(){
        super.Xuat();
        System.out.printf("%15s %15s ", congSuat, giaBan);
        System.out.println();
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
}
