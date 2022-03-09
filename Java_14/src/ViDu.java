import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int a,b;
		System.out.println("nhập vào số a:");
		a = sc.nextInt() ;
		System.out.println("nhập vào số b: ");
		b= sc.nextInt();
		
		
		System.out.println(a + "=" + b + ":" + (a==b));
		System.out.println(a + ">=" + b + ": " + (a>=b));
		System.out.println(a + ">" + b + ": " + (a>b));
		System.out.println(a + "<=" + b + ": " + (a<=b));
		System.out.println(a + "<" + b + ": " + (a<b));
		System.out.println(a + "!=" + b + ": " + (a!=b));
		System.out.println((a>b) && ( b>a));
		System.out.println(!(a>b));
		System.out.println((a>b) || (b >a ));
		
		System.out.println(("________________________"));
		
		
	}
}