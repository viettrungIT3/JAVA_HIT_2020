import java.util.Scanner;

public class Cau1 {
    public  static  Scanner scanner = new Scanner(System.in);
    public static int Max( int a, int b) {
        if ( a >= b) {
            return a;
        }
        else
            return b;
    }
    public static void main(String[] args) {
        System.out.printf("Nhập 3 số ngẫu nhiên: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //System.out.println(" 3 so do la: " +a +b +c);
        int max = Max( (Max( a, b)), c);
        System.out.println(" Max = " + max);
    }
}
