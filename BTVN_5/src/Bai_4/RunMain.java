package Bai_4;

import java.util.ArrayList;
import java.util.Collections;
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
            int count;
            do {
                count = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (K.getId().compareTo(list.get(j).getId()) == 0) {
                        count++;
                        break;
                    }
                }
                if ( count == 0 ){
                    list.add(K);
                    break;
                }
                else {
                    i--;
                    break;
                }
            } while ( true );
        }
        System.out.println("-------------MENU-------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort students by gpa.");
        System.out.println("5. Sort students by name.");
        System.out.println("6. Show students.");
        System.out.println("0. Exit.");
        while (true) {
            System.out.printf("You will choose: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1. Add student.");

                    do {
                        SinhVien K = new SinhVien();
                        K.Input();
                        int count;
                        count = 0;
                        for (int j = 0; j < list.size(); j++) {
                            if (K.getId().compareTo(list.get(j).getId()) == 0) {
                                count++;
                                break;
                            }
                        }
                        if ( count == 0 ){
                            list.add(K);
                            break;
                        }
                    } while ( true );
                    break;
                case 2:
                    System.out.println("2. Edit student by id.");
                    System.out.print("Enter ID SV to correct: ");
                    String idOld = scanner.next();
                    for ( int i = 0; i < n; i++ ) {
                        //System.out.println("list.get(i).getId() = " + list.get(i).getId() + "     idOld = " + idOld );
                        if (list.get(i).getId().compareTo(idOld) == 0) {
                            System.out.printf("You want to change that ID to IDnew = ");
                            String idNew = scanner.next();
                            System.out.println();
                            list.get(i).setId(idNew);
                        }
                    }
//                    System.out.printf("%20s %20s %20s %20s %20s ", "id", "name", "age", "address", "gpa" );
//                    System.out.println();
//                    for ( SinhVien x : list) {
//                        x.Output();
//                    }
                    break;
                case 3:
                    System.out.println("3. Delete student by id.");
                    System.out.print("Enter ID SV to delete: ");
                    String idOld2 = scanner.next();
                    for ( int i = 0; i < list.size(); i++ ) {
                        if (list.get(i).getId().compareTo(idOld2) == 0) {
                            list.remove(i);
                            i--;
                        }
                    }
                    break;
                case 4:
                    System.out.println("4. Sort students by gpa.");
                    for (int i = 0; i < list.size()-1; i++) {
                        for (int j = i+1; j < list.size(); j++) {
                            if ( list.get(i).getGpa() > list.get(j).getGpa()) {
                                Collections.swap( list, i, j);
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("5. Sort students by name.");
                    for (int i = 0; i < list.size()-1; i++) {
                        for (int j = i+1; j < list.size(); j++) {
                            if ( list.get(i).getName().compareTo(list.get(j).getName()) > 0) {
                                Collections.swap( list, i, j);
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.printf("%20s %20s %20s %20s %20s ", "id", "name", "age", "address", "gpa" );
                    System.out.println();
                    for ( SinhVien x : list) {
                        x.Output();
                    }
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.printf("Do you want continue (Y/N)? ");
            String ch = scanner.next();
            if (ch == null) {
                System.exit(0);
            }
        }
    }
}
