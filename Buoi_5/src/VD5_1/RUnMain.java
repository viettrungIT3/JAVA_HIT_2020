package VD5_1;

import java.util.ArrayList;
import java.util.Scanner;

public class RUnMain {
    public static void main(String[] args) {
        ArrayList<KySu> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập n = ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            KySu A = new KySu();
            A.Nhap();
            list.add(A);
        }
        for ( KySu temp : list) {
            temp.Xuat();
        }
        int m = 0;
        for ( KySu temp : list ) {
            if ( temp.getNamTN() > m)
                m = temp.getNamTN();
        }
        System.out.println("Thông tin tốt nghiệp gần đây nhất: ");
        for ( KySu temp : list ) {
            if ( temp.getNamTN() == m)
                temp.Xuat();
        }
    }
}
