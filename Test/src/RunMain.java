import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner sc = new Scanner(new File("INPUT.txt"));
        while(sc.hasNextLine()){
            SinhVien sv = new SinhVien();
            sv.nhap(sc);
            ds.add(sv);
        }

        for(SinhVien sv: ds){
            System.out.println(sv.toString());
        }
    }
}
