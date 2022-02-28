import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("nhap vao a : ");
		a = sc.nextInt();
		System.out.println("nhap vao so b : ");
		b = sc.nextInt();
		
		
		System.out.println(a + "==" + b + ":" +  (a==b));
		System.out.println(a + ">" + b + ":" +  (a>b));
		System.out.println(a + ">=" + b + ":" +  (a>=b));
		System.out.println(a + "<" + b + ":" +  (a<b));
		System.out.println(a + "<=" + b + ":" +  (a<=b));
		System.out.println(a + "!=" + b + ":" +  (a!=b));
		System.out.println("_________________");
		System.out.println("co hai so chan " + (a%2==0 && b%2==0));
		System.out.println("co it nhat 1 so chan " + (a%2==0 || b%2==0));
	}
}