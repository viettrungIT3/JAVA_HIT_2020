package Bai_5;

public class SinhVien extends Nguoi {
    private String maSV;
    private String nganh;
    private int khoaHoc;

    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", nganh='" + nganh + '\'' +
                ", khoaHoc=" + khoaHoc +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }

    public void XuatSV() {
        System.out.printf("%20 ", maSV);
        this.Xuat();
        System.out.printf("%20 %20 ", khoaHoc, khoaHoc);
    }
}
