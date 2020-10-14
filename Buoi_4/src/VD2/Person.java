package VD2;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private DateOfBirth ngaySinh;
    private Hobby hobby;

    public Person() {
    }

    public Person(String name, String gender, DateOfBirth ngaySinh, Hobby hobby) {
        this.name = name;
        this.gender = gender;
        this.ngaySinh = ngaySinh;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public DateOfBirth getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(DateOfBirth ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public void InPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.next();
        ngaySinh = new DateOfBirth();
        ngaySinh.InputDate();
        System.out.print("Enter gender: ");
        scanner.nextLine();
        this.gender = scanner.nextLine();
        System.out.print("Enter hobby: ");
        hobby = new Hobby();
        hobby.InputHobby();
    }

    public void Show() {
        System.out.println("Name: " + name);
        System.out.println(ngaySinh.toString());
        System.out.println("Gender: " + gender);
        System.out.println("Hobby: " + hobby.toString());
    }
}
