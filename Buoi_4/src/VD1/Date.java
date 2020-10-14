package VD1;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void InPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ngay Sinh: ");
        this.day = scanner.nextInt();
        System.out.println("Nhap Thang Sinh: ");
        this.month = scanner.nextInt();
        System.out.println("Nhap Nam Sinh: ");
        this.year = scanner.nextInt();
    }

    @Override
    public String toString() {
        return day +
                "/" + month +
                "/" + year;
    }
}
