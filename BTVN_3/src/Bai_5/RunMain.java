package Bai_5;

import com.sun.source.tree.WhileLoopTree;
import jdk.swing.interop.SwingInterOpUtils;

public class RunMain {
    public static void main(String[] args) {
        Guns Obj1 = new Guns("A", 100);
        Guns Obj2 = new Guns("B", 100);
        System.out.println("BẮT ĐẦU TRÒ CHƠI");
        int i = 1;
        while ( true ){
            System.out.println("Lượt " + i);i++;
            Obj1.Shoot(8);
            Obj2.Shoot(6);
            System.out.println("A còn " + Obj1.getAmmoNumber() + " viên đạn");
            System.out.println("B còn " + Obj2.getAmmoNumber() + " viên đạn");
            if (Obj1.getAmmoNumber() <= 0){
                System.out.println("KẾT THÚC TRÒ CHƠI");
                System.out.println(" B thắng.");
                break;
            }
            if (Obj2.getAmmoNumber() <= 0) {
                System.out.println("KẾT THÚC TRÒ CHƠI");
                System.out.println(" A thắng.");
                break;
            }
            System.out.println("Nạp đạm cho 2 bên.");
            Obj1.Load(4);
            Obj2.Load(4);
        }


    }
}
