package Bai_4;

import java.util.Scanner;

public class SinhVien {
    private String id;
    private String name;
    private int age;
    private String address;
    private float gpa;

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập ID SV: ");
        this.id = scanner.nextLine();
        System.out.printf("Nhập tên SV: ");
        this.name = scanner.nextLine();
        System.out.printf("Nhập tuổi: ");
        this.age = scanner.nextInt();
        System.out.printf("Nhập điạ chỉ: ");
        scanner.nextLine();
        this.address = scanner.nextLine();
        System.out.printf("Nhập điểm trung bình: ");
        this.gpa = scanner.nextFloat();
    }

    public void Output() {
        System.out.printf("%20s %20s %20s %20s %20s ", id, name, age, address, gpa );
        System.out.println();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
