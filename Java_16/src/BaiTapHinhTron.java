import java.util.Scanner;

public class BaiTapHinhTron {
	public static void main(String[] args) {
		double r, dientich, ChuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào r = ");
		r = sc.nextDouble();
				
		//tinh chu vi hình tròn
		// chu vi = 2*pi*r
		ChuVi = 2*Math.PI*r;
	System.out.println("chu vi cua hinh tròn là " + ChuVi);
	System.out.println("chu vi cua hinh tron la " + Math.round(ChuVi*100.0)/100.0);
	
	
	double pi;
	// dien tich hinh tròn
	dientich = Math.PI*Math.pow(r, 2);
	System.out.println("dien tich hinh tron  " + dientich);
	System.out.println("dien tich hinh tron " + Math.round(dientich));
	}
}	