package Bai_3;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private int donGia;
    private int soLuong;

    public HangHoa(String maHang, String tenHang, int donGia, int soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public HangHoa() {
        System.out.println("HangHoa is created");
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void xuat() {
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hang: " + tenHang);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Thành tiền: " + (donGia*soLuong));
    }
}
