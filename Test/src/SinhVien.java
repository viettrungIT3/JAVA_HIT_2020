import java.util.Scanner;

public class SinhVien {
    private static int maSV = 0;
    private String tenSV;

    public SinhVien() {
        maSV++;
    }

    public void nhap(Scanner sc){
        tenSV = sc.nextLine();
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + "\n";
    }
}
