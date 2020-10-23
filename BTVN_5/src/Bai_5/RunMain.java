package Bai_5;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LopHoc K = new LopHoc();
        System.out.println("Nhập thông tin lớp học");
        System.out.printf("Nhập mã lớp học: ");
        K.setMaLop( scanner.nextLine());
        System.out.printf("Nhập tên lớp học: ");
        K.setTenLop( scanner.nextLine());
        System.out.printf("Ngày mở: ");
        K.setNgayMo( scanner.nextLine());
        System.out.print("Nhập tên Giáo Viên: ");
        K.setGiaoVien( scanner.nextLine());
        System.out.print("Nhập số SV: ");
        K.setN( scanner.nextInt());
        ArrayList<SinhVien> list = new ArrayList<>();
        SinhVien[] X = new SinhVien[ K.getN()];
        for (int i = 0; i < K.getN(); i++) {
//            SinhVien A = new SinhVien();
            System.out.println("Nhâp SV thứ " + (i+1));
            X[i] = new SinhVien();
            System.out.printf("  Nhập mã SV: ");
            scanner.nextLine();
            X[i].setMaSV( scanner.nextLine());
            X[i].Nhap();
            System.out.printf("  Nhập tên ngành: ");
            X[i].setNganh( scanner.nextLine());
            System.out.printf("  Nhập khóa: ");
            X[i].setKhoaHoc( scanner.nextInt());
            list.add(X[i]);
            K.setX( X); // không dám chắc chỗ này
        }

        K.setX( X);

        System.out.println("Mã lớp học: " + K.getMaLop());
        System.out.println("Tên lớp học: " +K.getTenLop());
        System.out.println("Ngày mở: " + K.getNgayMo());
        System.out.println("Danh sách SV: " );
        K.getX();
        System.out.println("Giáo viên: " + K.getGiaoVien());

    }
}
