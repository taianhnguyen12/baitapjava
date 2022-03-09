import java.util.Scanner;

public class Vidu {
 public static void main(String[] args) {
	
	 
	 //khai báo biến
	 int a, b;
	 //nhap dữ liệu
	 Scanner sc = new Scanner(System.in) ;
	 System.out.println("nhập vào a = ");
	 a = sc.nextInt();
	 System.out.println("nhập vào b -= ");
	 b = sc.nextInt();
	 int Tong  = a + b;
	 System.out.println("a" + "+" + "b" + " = " + Tong);
	 int Hieu  = a - b;
	 System.out.println("a + " + "b" + "= " + Hieu);
	 int thuong = a / b;
	 System.out.println("a / " + "b " + " = " + thuong);
	 int tich = a*b;
	 System.out.println("a" + "*b" + " = " + tich);
	 
	 int sodu = a% b;
	 System.out.println("a %" + "b " + "= " + sodu);
	 //toán tử so sánh
	 System.out.println("a" + "==" + "b" + ":" + (a==b));
	 System.out.println("a" + ">" + "b" + ": " + (a>b));
	 System.out.println("a" + ">=" + "b " + ":" + (a>=b));
	 System.out.println("a" + "<" + "b " + ":" + (a<b));
	 System.out.println("a" + "<=" + "b " + ":" + (a<=b));
	 System.out.println("a" + "!=" +"b" + ":" + (a!=b));
	 //toán tử logic 
	 System.out.println(a >b && b <a );
	 System.out.println(a >b || b > a);
	 System.out.println(!(a>b));
	 //toán tử điều kiện
	 System.out.println((a>b)?"true":"false");
	 
} 
}
