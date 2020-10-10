package Bai_1;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person();
//        "Vu Van Doan", "1/1/2000", "Nam", "Code"
        DoanXinhGai.setName("Vu Van Doan");
        DoanXinhGai.setDateOfBirth("1/1/2000");
        DoanXinhGai.setGender("Nam");
        DoanXinhGai.setHobby("Code");
        System.out.println("Thông tin của DoanXinhGai: ");
        System.out.println("Họ và Tên: " + DoanXinhGai.getName());
        System.out.println("Ngày sinh: " + DoanXinhGai.getDateOfBirth());
        System.out.println("Giới tính: " + DoanXinhGai.getGender());
        System.out.println("Sở thích:  " + DoanXinhGai.getHobby());
        System.out.println();
        Person DiepBueDe = new Person(" ... ĐỨc Điệp", "1/1/2000", "Nam", "Code");
        System.out.println("THông tin của DiepBueDe: ");
        System.out.println("Họ và tên: " + DiepBueDe.getName());
        System.out.println("Ngày sinh: " + DiepBueDe.getDateOfBirth());
        System.out.println("Giới tính: " + DiepBueDe.getGender());
        System.out.println("Sở thích:  " + DiepBueDe.getHobby());
    }
}
