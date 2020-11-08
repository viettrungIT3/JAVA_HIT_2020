package Bai_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<INews> list = new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
//            News K = new News();
//            System.out.printf("Enter id:           ");    K.setId(scanner.nextInt());   scanner.nextLine();
//            System.out.printf("Enter title:        ");    K.setTitle(scanner.next());
//            System.out.printf("Enter publish Date: ");    K.setPublishDate(scanner.next());
//            System.out.printf("Enter author:       ");    K.setAuthor(scanner.next());
//            System.out.printf("Enter content:      ");    K.setContent(scanner.next());
////            System.out.printf("Enter averageRate:  ");
//            K.InputRate();
//            K.Calculate();
//            list.add(K);
//        }
//        System.out.printf("%15s %15s %15s %15s %15s ", "id", "publishDate", "author", "content", "averageRate");
//        System.out.println();
//        for ( INews x : rateList) {
//            x.Display();
//        }
        while ( true ) {
            System.out.println("--------------Menu-------------");
            System.out.println("  1. Insert news");
            System.out.println("  2. View list news");
            System.out.println("  3. Average rate");
            System.out.println("  4. Exit");
            System.out.printf("Enter your selection: ");
            int choose = scanner.nextInt();
            switch ( choose ) {
                case 1: System.out.println("  1. Insert news");
                    News K = new News();
                    System.out.printf("Enter id:           ");    K.setId(scanner.nextInt());   scanner.nextLine();
                    System.out.printf("Enter title:        ");    K.setTitle(scanner.next());
                    System.out.printf("Enter publish Date: ");    K.setPublishDate(scanner.next());
                    System.out.printf("Enter author:       ");    K.setAuthor(scanner.next());
                    System.out.printf("Enter content:      ");    K.setContent(scanner.next());
        //            System.out.printf("Enter averageRate:  ");
                    K.InputRate();
//                    K.Calculate();
                    list.add(K);
                    break;
                case 2: System.out.println("  2. View list news");
                    System.out.printf("%15s %15s %15s %15s %15s ", "id", "publishDate", "author", "content", "averageRate");
                    System.out.println();
                    for ( INews x : list) {
                        x.Display();
                    }
                    break;
                case 3: System.out.println("  3. Average rate");
                    System.out.printf("%15s %15s %15s %15s %15s ", "id", "publishDate", "author", "content", "averageRate");
                    System.out.println();
                    for ( INews x : list) {
                        x.Calculate();
                        x.Display();
                    }
                    break;
                case 4: System.out.println("  4. Exit");
                    System.exit(0);
                default:
                    System.out.println("Sorry. You made the wrong choice.");
            }
            System.out.printf("Do you want continue (Y/N)? ");
            String ch = scanner.next();
            if ( ch.compareTo("N") == 0 ) {
                break;
            }
        }
    }
}
