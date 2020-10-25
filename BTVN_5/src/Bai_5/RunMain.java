package Bai_5;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LopHoc K = new LopHoc();
        System.out.println("Nhập thông tin lớp học");
        System.out.print("Nhập mã lớp học: ");
        K.setMaLop( scanner.nextLine());
        System.out.print("Nhập tên lớp học: ");
        K.setTenLop( scanner.nextLine());
        System.out.print("Ngày mở: ");
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
            System.out.print("  Nhập mã SV: ");
            scanner.nextLine();
            X[i].setMaSV( scanner.nextLine());
            X[i].Nhap();
            System.out.print("  Nhập tên ngành: ");
            X[i].setNganh( scanner.nextLine());
            System.out.print("  Nhập khóa: ");
            X[i].setKhoaHoc( scanner.nextInt());
            list.add(X[i]);
        }

        System.out.println("Mã lớp học: " + K.getMaLop());
        System.out.println("Tên lớp học: " +K.getTenLop());
        System.out.println("Ngày mở: " + K.getNgayMo());
        System.out.println("Danh sách SV: " );
        for (int i = 0; i < K.getN(); i++) {
            K.XuatX();
        }
        System.out.println("Giáo viên: " + K.getGiaoVien());

    }
}
