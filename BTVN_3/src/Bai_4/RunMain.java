package Bai_4;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        arr1.InPutDaTa();
        arr1.Show();
        System.out.println("Sum 1 = " + arr1.SumArray());
        Array arr2 = new Array();
        arr2.InPutDaTa();
        arr2.Show();
        System.out.println("Sum 2 = " + arr2.SumArray());
        if ( arr1.TBC() == arr2.TBC()) {
            System.out.println("Hi");
        }
        else if (arr1.TBC() > arr2.TBC()) {
            System.out.println("TBC aar1 > TBC aar2");
        }
        else {
            System.out.println("TBC aar1 < TBC aar2");
        }
    }
}
