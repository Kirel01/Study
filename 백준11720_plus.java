package kr.co.ezenac.백준0328;

import java.util.Scanner;

public class 백준11720_plus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String str = sc.nextLine();

		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
		
		sc.close();
	}
}
