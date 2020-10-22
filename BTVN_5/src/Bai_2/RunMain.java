package Bai_2;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc A = new SoPhuc();
        A.Nhap();
        SoPhuc B = new SoPhuc();
        B.Nhap();
        SoPhuc C = A.Cong(B);
        C.Xuat();
        SoPhuc D = A.Tru(B);
        D.Xuat();
    }
}
