import java.util.Scanner;

public class cau5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Nhap mot chuoi bat ki: ");
        String str = scanner.nextLine();
        //System.out.println("Str = " +str);
        //String str = "ksdhmdfm1mkm2hjvnb3nmbh4b hmn5";
        int sum = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                count++;
            }
        }
//        System.out.println("sum = " + sum);
//        System.out.println("COunt = " +count);
        float tb = (float)sum/count;
        System.out.println("Tb = " +tb );
    }
}
