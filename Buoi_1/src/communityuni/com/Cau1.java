package communityuni.com;

import java.util.Scanner;

public class Cau1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 0; i < m; i++) {
			if ( i == 0 || i == m-1 ) {
				for (int j = 0; j < n; j++) {
					System.out.printf("* ");
				}
			}
			else {
				for (int j = 0; j < n; j++) {
					if ( j == 0 || j == n-1 ) {
						System.out.printf("* ");
					}
					else {
						System.out.printf("  ");
					}
				}
			}
			System.out.println();
		}
	}
	
}
