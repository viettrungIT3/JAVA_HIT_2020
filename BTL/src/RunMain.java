import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);
    public static List<SinhVien> sinhVienList = new ArrayList<>();
    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        sv.Nhap();
//        sv.Xuat();

        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("---------------------MENU---------------------");
            System.out.println("| 1. Thêm sinh viên.                         |");
            System.out.println("| 2. Đếm số sinh viên.                       |");
            System.out.println("| 3. In ra danh sách sinh viên.              |");
            System.out.println("| 4. Sủa thông tin sinh viên.                |");
            System.out.println("| 5. Xóa thông tin sinh viên.                |");
            System.out.println("| 6. Tra cứu  thông tin sinh viên theo MSV.  |");
//            System.out.println("| 7. Trích thông tin sinh viên.              |");
            System.out.println("| 8. Sắp xếp sinh viên.                      |");
            System.out.println("| 9. Báo cáo cuối kỳ.                        |");
            System.out.println("| 0. Thoát chương trình                      |");
            System.out.println("----------------------------------------------");
            System.out.printf("Mời bạn chọn: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    SinhVien sv = new SinhVien();
                    int msv = ( sinhVienList.size() > 0) ? (sinhVienList.size() +1) : 1;
                    sv.setMaSinhVien(msv);
                    sv.Nhap();
                    sinhVienList.add(sv);
                    break;
                case 2:
                    int count = 0;
                    for (SinhVien sv2 : sinhVienList) count++;
                    System.out.println("Số Sinh viên đã nhập: " + count);
                    break;
                case 3:
                    System.out.println("Danh sách sinh viên: ");
                    for (SinhVien sv3 : sinhVienList) {
                        sv3.Xuat();
                    }
                    break;
                case 4:
                    System.out.println(" 1. Sửa tên.");
                    System.out.println(" 2. Sửa ngày sinh.");
                    System.out.println(" 3. Sửa quê quán.");
                    System.out.println(" 4. Sửa lớp học.");
                    System.out.println("Bạn muốn chọn: " );
                    int choose2 = scanner.nextInt();
                    switch (choose2) {
                        case 1:
                            EditStudentByName(sinhVienList);
                            break;
                        case 2:
                            EditStudentByBirthDay(sinhVienList);
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Bạn đã chọn sai.");
                            break;
                    }
                    break;
                case 5:
                    System.out.printf("Nhập mã sinh viên muốn xóa: ");
                    int msv5 = scanner.nextInt();
                    for ( int i = 0; i < sinhVienList.size(); i++) {
                        if (sinhVienList.get(i).getMaSinhVien() != msv5) {
                            System.out.println("Mã sinh viên không hợp lệ.");
                        } else {
                            sinhVienList.remove(i);
                        }
                    }
                    break;
                case 6:
                    System.out.printf("Nhập mã sinh viên muốn tra cứu: ");
                    int msv6 = scanner.nextInt();
                    int count6 = 0;
                    for ( SinhVien sv6 : sinhVienList) {
                        if (sv6.getMaSinhVien() == msv6) {
                            System.out.println("Thông tin sinh viên cần tra cứu là: ");
                            sv6.Xuat();
                        }
                        else {
                            count6++;
                        }
                    }
                    if ( count6 != 0 ) {
                        System.out.println("Mã sinh viên không hợp lệ.");
                    }
                    break;
                case 7:
                    break;
                case 8:
                    int choose8;
                    while (true){
                        System.out.println("\t 1. Sắp xếp theo tên. ");
                        System.out.println("\t 2. Sắp xếp theo trung bình tích lũy.");
                        System.out.printf("Mời bạn chọn: ");
                        choose8 = scanner.nextInt();
                        switch (choose8) {
                            case 1:
                                SortStudentsByName(sinhVienList);

                                break;
                            case 2:
                                SortStudentsByGpa(sinhVienList);
                                break;
                            default:
                                System.out.println("Bạn đã chọn sai!");
                        }
//                        System.out.printf("Do you want continue (1/0)? ");
                        System.out.printf("Bạn muốn tiếp tục không (1/0)?");
                        int ch = scanner.nextInt();
                        if (ch == 0) {
//                            System.exit(0);
                            break;
                        }
                    }

                case 9:
                    int countG = 0;
                    int countK = 0;
                    int countTB = 0;
                    int countTBY = 0;
                    int countKem = 0;
                    int countT = 0;
                    for ( SinhVien sv9 : sinhVienList){
                        if (sv9.TBCTL() >= 8.5 && sv9.TBCTL() <= 10 ) {
                            countG++;
                            countT++;
                        }
                        else if (sv9.TBCTL() >= 7.0 ) {
                            countK++;
                            countT++;
                        }
                        else if (sv9.TBCTL() >= 5.5) {
                            countTB++;
                            countT++;
                        }
                        else if (sv9.TBCTL() >= 4 ) {
                            countTBY++;
                            countT++;
                        }
                        else  {
                            countKem++;
                            countT++;
                        }
                    }
                    System.out.println("Báo cáo cuối kì:");
                    System.out.println("\t Giỏi: " + countG + "(chiếm " + (double) Math.round(countG*10000.00/countT)/100 + "%).");
                    System.out.println("\t Khá : " + countG + "(chiếm " + (double) Math.round(countK*10000.00/countT)/100 + "%).");
                    System.out.println("\t TB  : " + countG + "(chiếm " + (double) Math.round(countTB*10000.00/countT)/100 + "%).");
                    System.out.println("\t TBY : " + countG + "(chiếm " + (double) Math.round(countTBY*10000.00/countT)/100 + "%).");
                    System.out.println("\t Kém : " + countG + "(chiếm " + (double) Math.round(countKem*10000.00/countT)/100 + "%).");
                    System.out.println("Số sinh viên được lên lớp là:  " + (countT - countKem));
                    System.out.println("Số sinh viên không lên lớp là: " + countKem);
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.printf("Bạn muốn tiếp tục không (1/0)?");
            int ch = scanner.nextInt();
            if (ch == 0) {
                System.exit(0);
            }
        }
    }

    public static void SortStudentsByGpa(List<SinhVien> sinhVienList){
        for (int i = 0; i < sinhVienList.size() - 1; i++){
            for (int j = sinhVienList.size() - 1; j > i; j--){
                if (sinhVienList.get(j - 1).TBCTL() < sinhVienList.get(j).TBCTL()){
                    SinhVien temp = sinhVienList.get(j - 1);
                    sinhVienList.set(j - 1, sinhVienList.get(j));
                    sinhVienList.set(j, temp);
                }
            }
        }
    }

    public static void SortStudentsByName(List<SinhVien> sinhVienList){
        for (int i = 0; i < sinhVienList.size() - 1; i++){
            for (int j = sinhVienList.size() - 1; j > i; j--){
                if (sinhVienList.get(j - 1).getTen().compareTo(sinhVienList.get(j).getTen()) > 0){
                    SinhVien temp = sinhVienList.get(j - 1);
                    sinhVienList.set(j - 1, sinhVienList.get(j));
                    sinhVienList.set(j, temp);
                }
            }
        }
    }

    public static void EditStudentByName(List<SinhVien> sinhVienList) {
        System.out.printf("Nhập mã sinh viên muốn sửa: ");
        int msv = scanner.nextInt();
        int count = 0;
        for ( SinhVien sv : sinhVienList) {
            if (sv.getMaSinhVien() == msv) {
                System.out.printf("Nhập Họ và tên đệm cần sửa: ");
                String hodem = scanner.nextLine();
                System.out.printf("Nhập Tên cần sửa: ");
                String ten = scanner.nextLine();
                sv.setHoDem(hodem);
                sv.setTen(ten);
            }
            else {
                count++;
            }
        }
        if ( count != 0 ) {
            System.out.println("Mã sinh viên không hợp lệ.");
        }
    }

    public static void EditStudentByBirthDay(List<SinhVien> sinhVienList) {
        System.out.printf("Nhập mã sinh viên muốn sửa: ");
        int msv = scanner.nextInt();
        int count = 0;
        for ( SinhVien sv : sinhVienList) {
            if (sv.getMaSinhVien() == msv) {
                System.out.printf("Nhập ngày sinh cần sửa: ");
                String ngaySinh = scanner.nextLine();
                sv.setNgaySinh(ngaySinh);
            }
            else {
                count++;
            }
        }
        if ( count != 0 ) {
            System.out.println("Mã sinh viên không hợp lệ.");
        }
    }



}
