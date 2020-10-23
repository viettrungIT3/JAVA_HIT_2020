package demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap n = ");
        int n = scanner.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien sinhVien = new SinhVien();
            sinhVien.Nhap();
            list.add(sinhVien);
        }
        for ( SinhVien sv : list ) {
            System.out.println(sv.toString());
        }
    }
}
