package ch2_bai1;

import java.util.Scanner;

public class ch2_bai1 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao a = ");
		a = sc.nextInt();
		System.out.println("nhap vao b = ");
		b = sc.nextInt();
		/*
		 * Tínhtổng,hiệu,tích,thương,chialấydư của 2 số đó.
		 */
		int Tong = a + b;
		System.out.println(a + "+" + b + "= " + Tong);
		int Hieu = a - b;
		System.out.println(a + "- " + b + "=" + Hieu);
		int tich = a * b;
		System.out.println(a + "* " + b + " = " + tich);
		int thuong = a / b;
		System.out.println(a + " / " + b + " = " + thuong);
		int Sodu = a % b;
		System.out.println(a + "% " + b + " = " + Sodu);
		/*
		 * Toán tử số học
		 */
// tăng lên 1 đơn vị //giảm 1 đơn vị
		System.out.println("a " + a++);
		System.out.println("a++ " + a);
		System.out.println("--b " + --a);
		System.out.println("b " + b++);
		System.out.println("b++ " + b);
		System.out.println("--b" + --b);
// Toán tử so sánh	
		System.out.println(a + " ==" + b + ":" + (a == b));
		System.out.println(a + ">" + b + ":" + (a > b));
		System.out.println(a + ">=" + b + ":" + (a >= b));
		System.out.println(a + "<" + b + ":" + (a < b));
		System.out.println(a + "<=" + b + ":" + (a <= b));
//Toán tử logic
		System.out.println(a > b && b < a);
		System.out.println(a > b || b < a);
		System.out.println(!(a > b));
//toán tử điều khiển 
		System.out.println((a > b) ? true : false);

	}
}
