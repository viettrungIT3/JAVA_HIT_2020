//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class test {
    public test() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số phần tử mảng: ");
        int n = sc.nextInt();
        System.out.println("Nhập các phần tử của mảng: ");
        int[] a = new int[n+100];

        int chon;
        for(chon = 0; chon < n; ++chon) {
            a[chon] = sc.nextInt();

        }

        System.out.printf("Nhập k: ");
        int k = sc.nextInt();
        k--;
        System.out.println("Chọn 1 thao tác để thực hiện");
        System.out.println("Bam 1 - Hiển thị mảng");
        System.out.println("Bam 2 - Thêm 1 phần tử vào vị trí k");
        System.out.println("Bam 3 - Xoá 1 phần tử ở vị trí k");
        System.out.println("Bam 4 - Đảo ngược mảng");
        System.out.println("Bam 5 - Hiển thị phần tử a[1] và các số chia hết cho a[1]");
        System.out.println("Bam 6 - Thoát");
        System.out.println("-------------------------------------------------");

        while(true) {
            while(true) {
                System.out.printf("Mời bạn chọn yêu cầu: ");
                chon = sc.nextInt();
                switch(chon) {
                    case 1:
                        Hienthi(a, n);
                        break;
                    case 2:
                        chen(a, n, k);
                        n++;
                        Hienthi(a, n);
                        break;
                    case 3:
                        xoa(a, n, k);
                        n--;
                        Hienthi(a,n);
                        break;
                    case 4:
                        dao(a, n);
                        break;
                    case 5:
                        loc(a, n);
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Chon khong hop le");
                }
            }
        }
    }

    public static void Hienthi(int[] a, int n) {
        System.out.printf("1.Mảng vừa nhập là:");

        for(int i = 0; i < n; ++i) {
            System.out.printf(a[i] + " ");
        }

        System.out.println();
    }

    public static void chen(int[] a, int n, int k) {
        for(int i = n; i > k; i--) {
            a[i] = a[i - 1];
        }

        a[k] = 62;
        //++n;
    }

    public static void xoa(int[] a, int n, int k) {
        for(int i = k; i < n; i++) {
            a[i] = a[i + 1];
        }

        //--n;
    }

    public static void dao(int[] a, int n) {
        System.out.printf("4.Mảng đảo ngược là: ");

        for(int i = n - 1; i >= 0; --i) {
            System.out.printf(a[i] + " ");
        }

        System.out.println();
    }

    public static void loc(int[] a, int n) {
        System.out.printf("5.Các phần tử chia hết cho a[1] la: ");

        for(int i = 0; i < n; ++i) {
            if (a[i] % a[1] == 0) {
                System.out.printf(a[i] + " ");
            }
        }

        System.out.println();
    }
}
