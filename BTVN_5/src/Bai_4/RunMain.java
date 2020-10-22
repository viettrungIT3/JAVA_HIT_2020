package Bai_4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {


    public static void main(String[] args) {
        System.out.printf("Nhập số sinh viên: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien K = new SinhVien();
            K.Input();
            list.add(K);
        }
        System.out.printf("%20s %20s %20s %20s %20s ", "id", "name", "age", "address", "gpa" );
        System.out.println();
        for ( SinhVien x : list) {
            x.Output();
        }
        System.out.println("-------------MENU-------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort students by gpa.");
        System.out.println("5. Sort students by name.");
        System.out.println("6. Show students.");
        System.out.println("0. Exit.");
        System.out.println();
        while (true) {
            System.out.printf("You will choose: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1. Add student.");
                    SinhVien K = new SinhVien();
                    K.Input();
                    list.add(K);
//                    System.out.printf("%20s %20s %20s %20s %20s ", "id", "name", "age", "address", "gpa" );
//                    System.out.println();
//                    for ( SinhVien x : list) {
//                        x.Output();
//                    }
                    break;
                case 2:
                    System.out.println("2. Edit student by id.");
                    System.out.print("Enter ID SV to correct: ");
                    String idOld = scanner.next();
                    for ( int i = 0; i < n; i++ ) {
                        //System.out.println("list.get(i).getId() = " + list.get(i).getId() + "     idOld = " + idOld );
                        if (list.get(i).getId() == idOld) {
                            System.out.printf("You want to change that ID to IDnew = ");
                            String idNew = scanner.nextLine();
                            list.get(i).setId(idNew);
                        }
                    }
                    System.out.printf("%20s %20s %20s %20s %20s ", "id", "name", "age", "address", "gpa" );
                    System.out.println();
                    for ( SinhVien x : list) {
                        x.Output();
                    }
                    break;
            }
        }
    }
}
