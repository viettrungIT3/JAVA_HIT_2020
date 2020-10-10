package Bai_3;

public class RunMain {
    public static void main(String[] args) {
        HangHoa A = new HangHoa("123", "Gạo", 15000, 10);
        HangHoa B = new HangHoa();
        B.setMaHang("124");
        B.setTenHang("Thịt");
        B.setDonGia(150000);
        B.setSoLuong(1);
        System.out.println("Thong tin mặt hàng thứ nhất: ");
        A.xuat();
        System.out.println("Thong tin mặt hàng thứ hai: ");
        B.xuat();
    }
}
