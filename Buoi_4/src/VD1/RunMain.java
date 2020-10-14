package VD1;

public class RunMain {

    public static void main(String[] args) {
        //SinhVien X = new SinhVien("2019603066", "Nguyen Viet Trung");
        SinhVien[] arrSV = new SinhVien[3];
        for (int i = 0; i < arrSV.length; i++) {
            arrSV[i] = new SinhVien();
//            arrSV[i].setMaSV("" + i);
//            arrSV[i].setHoTen("Doan " + i);
            arrSV[i].InputInFor();
        }
        for (int i = 0; i < arrSV.length; i++) {
            arrSV[i].Show();
        }
    }
}
