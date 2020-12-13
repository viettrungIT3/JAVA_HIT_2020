import java.util.Scanner;

public class SinhVien extends Nguoi{
    private int maSinhVien;
    private String nganh;
    private String tenLop;
    private int n;
    private MonHoc[] listMH;

    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String nganh, String tenLop) {
        this.maSinhVien = maSinhVien;
        this.nganh = nganh;
        this.tenLop = tenLop;
    }

    public SinhVien(int maSinhVien, String nganh, String tenLop, String hoDem, String ten, String gioiTinh,
                    String ngaySinh, String queQuan, String soDienThoai) {
        super(hoDem, ten, gioiTinh, ngaySinh, queQuan, soDienThoai);
        this.maSinhVien = maSinhVien;
        this.nganh = nganh;
        this.tenLop = tenLop;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
//        System.out.printf("Nhập MSV: ");
//        maSinhVien = sc.nextInt();
//        sc.nextLine();
        super.Nhap();
        System.out.print("Nhập ngành học: ");
        nganh = sc.nextLine();
        System.out.print("Nhập tên lớp: ");
        tenLop = sc.nextLine();
        System.out.print("Nhập số môn học: ");
        n = sc.nextInt();
        sc.nextLine();
        listMH = new MonHoc[n];
        for (int i=0; i<n; i++){
            System.out.println("*Nhập môn học thứ " +(i+1) + ":");
            listMH[i] = new MonHoc();
            listMH[i].Nhap();
        }
    }

    public float TBCTL(){
        int T = 0;
        float tongDiem = 0;

        for (int i=0; i<n; i++){
            T += listMH[i].getSoTC();
            tongDiem += listMH[i].getSoTC()*listMH[i].TrungBinhMon();
        }
        return tongDiem / T;
    }

    public void Xuat(){
        System.out.printf("%10s %15s %10s %10s %10s %15s %12s %10s %10s %5s ",
                maSinhVien, super.getHoDem(), super.getTen(), super.getGioiTinh(),
                super.getNgaySinh(), super.getQueQuan(), super.getSoDienThoai(), nganh, tenLop, TBCTL());
        System.out.println();
    }
}
