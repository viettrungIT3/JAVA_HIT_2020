public class SinhVien {
    private String MSV;
    private String HoTen;
    private String DiaChi;

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void  DIHoc(){
        System.out.println("Minh di hoc day.");
    }

    public SinhVien(){
        System.out.println("Day la ham khoi tao.");
    }

//    public SinhVien( String MSV, String hoTen, String diaChi) {
//        this.MSV = MSV;
//        this.HoTen = hoTen;
//        this.DiaChi = diaChi;
//    }


    public SinhVien(String MSV, String hoTen, String diaChi) {
        this.MSV = MSV;
        HoTen = hoTen;
        DiaChi = diaChi;
    }// Su dung Alt Insert

    public void ShowIn4( String MSV, String hoTen, String diaChi) {
        System.out.println(MSV);
        System.out.println(getHoTen());
        System.out.println(diaChi);
    }
}
