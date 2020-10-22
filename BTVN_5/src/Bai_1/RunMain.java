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

    }
}
