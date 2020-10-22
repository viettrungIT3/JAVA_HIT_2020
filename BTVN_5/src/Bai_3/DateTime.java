package Bai_3;

import java.util.Scanner;

public class DateTime {
    private int D;
    private int M;
    private int Y;

    public void InputDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập ngày: ");
        this.D = scanner.nextInt();
        System.out.printf("Nhập tháng: ");
        this.M = scanner.nextInt();
        System.out.printf("Nhập năm: ");
        this.Y = scanner.nextInt();
    }

    public void  OutputDate() {
        System.out.println("Ngày xuất: " + D + "/" + M + "/" + Y);
    }
}
