package Bai_1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập n = ");
        int n = scanner.nextInt();
        ArrayList<DieuHoa> list = new ArrayList<>(n);
        for ( int i = 0; i<n; i++) {
            DieuHoa A = new DieuHoa();
            A.Nhap();
            list.add(A);
        }
        for ( DieuHoa x : list) {
            x.Xuat();
        }
        int min = 100000000;
        for ( DieuHoa x : list) {
            if ( min > x.getGiaBan()  && x.getTenHangSX().compareTo("Electrolux") == 0) {
                min = x.getGiaBan();
            }
        }
        System.out.println("DS ... thấp nhất.");
        for ( int i = 0; i<n; i++) {
            if ( min == list.get(i).getGiaBan() ) {
                list.get(0).Xuat();
            }
        }
    }
}
