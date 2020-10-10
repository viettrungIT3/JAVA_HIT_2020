import java.util.Scanner;

public class cau6 {
    public static Scanner scanner = new Scanner(System.in);
    public static String XuLyChuoi( String str) {
        String strNew = str;
        String[] arrWord = strNew.split(" ");   //Tach thanh tung tu
        strNew = "";
        for (String Word : arrWord) {
            if (Word.length() > 0) {
                Word = Word.replaceFirst( Word.charAt(0) + "", (Word.charAt(0) + "").toUpperCase() );   //Thay the ki tu dau
                strNew += Word + " ";       //Noi la cac tu
            }
        }
        return strNew;
    }
    public static void main(String[] args) {
        //System.out.printf("Nhap chuoi: ");
        //String str = scanner.nextLine();
        String str = "   Nguyen    Viet    Trung   123 ";
        str = str.trim();       //xoa bo khoang trang dau va cuoi
        str = str.toLowerCase();    //chuyen ve dang chu thuong
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ' && str.charAt(i+1) == ' ') {
//
//            }
//        }
        str = XuLyChuoi(str);

        str = str.trim();
        System.out.println("str = " +str );

    }
}
