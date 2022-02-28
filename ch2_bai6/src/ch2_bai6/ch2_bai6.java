package ch2_bai6;

import java.util.Scanner;

public class ch2_bai6 {
	public static void main(String[] args) {
		/*
		 * int n; Scanner sc = new Scanner(System.in); do {
		 * System.out.println("nhap vao so nguyen duong : "); n = sc.nextInt(); } while
		 * ( n <=0 ) ; System.out.println("so vua nhap la so nguyen");
		 * 
		 * int number = n; long fact = 1; for(int i = 1; i <= number; i++) { fact = fact
		 * * i; } System.out.println("Giai thừa của "+number+" là: "+fact); } }
		 */
		int n;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("nhap vao so nguyen duong n>0");
			n = sc.nextInt();
		} while (n <= 0);
		System.out.println("so vua nhap la so nguyen");
		int number = n;
		long fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("gia thua cua" + number + "là :" + fact);
	}

}