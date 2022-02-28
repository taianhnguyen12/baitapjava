import java.util.Scanner;

public class BaiTapHinhTron {
	public static void main(String[] args) {
		double r, chuVi,dienTich;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ban kinh r :");
		r =sc.nextDouble();
		
		
		//chu vi
		chuVi = r*Math.PI*2;
				System.out.println("chu vi hinh tron : " + chuVi);
				System.out.println("chu vi hinh tron : " +Math.round(chuVi));
				System.out.println("chu vi hinh tron : " + Math.round(chuVi*100.0)/100.0);
				
		dienTich = Math.PI * Math.pow(r, 2);
		System.out.println("dien tich hinh tron :"  + dienTich);
		System.out.println("dien tich hinh tron: " + Math.round(dienTich));
		System.out.println("dien tich hinh tron: " + Math.round(dienTich*100.0)/100.0 );
	}
}