import java.util.Scanner;

public class cau31 {
    public static void ShowArray(int []a){
        for(int b: a){
            System.out.print(b + " ");
        }
    }

    public static int[] AddElement(int []a, Scanner scanner){
        int tempIndex = a.length + 1;
        int[] tempArr = new int[tempIndex];
        System.out.print("Nhập phần tử cần thêm: ");
        int pt = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm: ");
        int vt = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < tempIndex; i++) {
            if(i == vt){
                tempArr[i] = pt;
            } else {
                tempArr[i] = a[k++];
            }
        }
        return tempArr;
    }

    public static int[] DeleteElement(int []a, Scanner scanner){
        int tempIndex = a.length - 1;
        int[] tempArr = new int[tempIndex];
        System.out.print("Nhập vị trí cần xóa: ");
        int vt = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != vt) {
                tempArr[k++] = a[i];
            }
        }
        return tempArr;
    }

    public static int[] ReverseArray(int []a){
        int[] tempArr = new int[a.length];
        int k = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            tempArr[k++] = a[i];
        }
        return tempArr;
    }

    public static void ShowDividedNumbers(int []a){
        int temp = a[1], count = 0;

        for(int i = 0; i < a.length; i++){
            if (a[i] != temp && a[i] % temp == 0) {
                count++;
            }
        }
        if(count != 0){
            int[] tempArr = new int[count];
            count = 0;
            for(int i = 0; i < a.length; i++){
                if (a[i] != temp && a[i] % temp == 0) {
                    tempArr[count++] = a[i];
                }
            }
            System.out.print("a[1] = " + temp + ". Số chia hết cho a[1]: ");
            for(int i = 0; i < a.length; i++){
                if (a[i] != temp && a[i] % temp == 0) {
                    System.out.print(a[i] + " ");
                }
            }
        } else {
            System.out.println("Không có số nào chia hết cho a[1]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        int choice;
        do {

            System.out.println("\n----------------------MENU----------------------");
            System.out.println("1. Hiển thị mảng vừa tạo");
            System.out.println("2. Thêm một phần tử vào vị trí thứ k");
            System.out.println("3. Xóa một phần tử ở vị trí thứ k");
            System.out.println("4. Đảo ngược mảng");
            System.out.println("5. Hiển thị số a[1] và các số chia hết cho a[1]");
            System.out.println("6. Thoát.");

            System.out.print("Lựa chọn: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    ShowArray(a);
                    break;
                case 2:
                    a = AddElement(a, scanner);
                    break;
                case 3:
                    a = DeleteElement(a, scanner);
                    break;
                case 4:
                    a = ReverseArray(a);
                    ShowArray(a);
                    break;
                case 5:
                    ShowDividedNumbers(a);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (choice != 7);
    }
}
