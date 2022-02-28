import java.util.Scanner;

public class Vidu {
  public static void main(String[] args) {
	double a,b;
		Scanner sc = new Scanner(System.in);
				System.out.println("nhap vao gia tri a ");
		a = sc.nextDouble();
		System.out.println("nhap vao gia tri b ");
		b = sc.nextDouble();
		
		//gia tri tuyet doi
		System.out.println("|a| = " + Math.abs(a));
		//ham tim min
		System.out.println("min(a,b)" + Math.min(a, b));
		//ham tim max
		System.out.println("max(a,b)" + Math.max(a, b));
		//ham tim ceil ( lấy số >=10)
		System.out.println("ceil(a)" + Math.ceil(a));
		//ham tim floor ( lấy số <=10)
		System.out.println("floor(a)" + Math.floor(a));
		//can bac 2 cua a ,sqrt 
		System.out.println("sqrt(a)" + Math.sqrt(a));
		//ham tinh a mũ b pow
		System.out.println("pow(a,b)" +Math.pow(a, b));
}
}
