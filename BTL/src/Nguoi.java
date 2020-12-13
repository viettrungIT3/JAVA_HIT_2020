import java.util.Scanner;

public class Nguoi {
    private String hoDem;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String queQuan;
    private String soDienThoai;

    public Nguoi() {
    }

    public Nguoi(String hoDem, String ten, String gioiTinh, String ngaySinh, String queQuan, String soDienThoai) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.soDienThoai = soDienThoai;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ đệm: ");
        hoDem = sc.nextLine();
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        soDienThoai = sc.nextLine();
    }
}
