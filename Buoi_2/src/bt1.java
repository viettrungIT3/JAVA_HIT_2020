import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "sjgcfhenwj2jh3jhnj3k2"; //sc.next();
        int sum = 0;
        //c1
//        for (int i = 0; i < str.length(); i++) {
//            if ( str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                sum += (int)str.charAt(i) - 48;
//            }
//        }
        //c2
        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("sum = " + sum);
    }
}
