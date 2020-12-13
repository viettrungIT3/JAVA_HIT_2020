import java.util.Scanner;

public class MonHoc {
    private String tenMH;
    private int soTC;
    private float diemTX;
    private float diemThi;

    public MonHoc() {
    }

    public MonHoc(String tenMH, int soTC, float diemTX, float diemThi) {
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.diemTX = diemTX;
        this.diemThi = diemThi;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public float getDiemTX() {
        return diemTX;
    }

    public void setDiemTX(float diemTX) {
        this.diemTX = diemTX;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên môn học: ");
        tenMH = sc.nextLine();
        System.out.print("Nhập số tín chỉ: ");
        soTC = sc.nextInt();
        System.out.print("Nhập điểm thường xuyên: ");
        diemTX = sc.nextFloat();
        System.out.print("Nhập điểm thi: ");
        diemThi = sc.nextFloat();
    }

    public float TrungBinhMon (){
        return (diemTX + 2*diemThi)/3;
    }

}
