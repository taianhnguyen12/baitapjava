package ch2_bai12;

import java.util.Scanner;

public class ch2_bai12 {
  /* public static void main(String[] args) {
	int n,m;
	Scanner Scanner = new Scanner(System.in);
	System.out.println("nhap vao m , so dong ma tran ");
	m = Scanner.nextInt();
	System.out.println("nhap vao n, so co ma tran  ");
	n = Scanner.nextInt();
	int A[][] = new int[m][n];
	System.out.println("ma tran vua nhap la  ");
	for(int m = 0;i <m;i++) {
		for(int n = 0; i<n;i++) {
			System.out.println("A["+i+"]+"]["+j+"]="");
			A[i][j] = Scanner.nextInt();
			
		}
	}
	
}
}
*/
	public static void main(String[] args) {
		int m, n; //khaibáosốdòngvàsốcộtcủama trận
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số dòng của ma trận: ");
		m = scanner.nextInt();
		System.out.println("Nhập vào số cột của ma trận: ");
		n = scanner.nextInt();
		int A[][] = new int[m][n]; // khai báo ma trận A có m dòng, n cột
		System.out.println("Nhập các phần tử cho ma trận: ");
		for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
		System.out.println("A["+i+"]["+j+" ] = ");
		A[i][j] = scanner.nextInt(); 
		} 
		}
		// tìm phần tử có giá trị lớn nhất trong ma trận
		//giảsửphầntửtạivịtrí(0,0)làphầntửlớnnhất
		int max = A[0][0];
		for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
		if (max < A[i][j]) {
		max = A[i][j];
		}
		} }
		System.out.println("Phần tử lớn nhất trong ma trận = " + max);
}
}