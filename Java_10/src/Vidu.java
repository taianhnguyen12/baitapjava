
public class Vidu {
public static void main(String[] args) {
	int a  = 2;
	int b = 3;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	float  c = a;
	float d = b;
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	
	
	//ép kiểu tường minh
	System.out.println("-----------------");
	float e = 2.5f;
	float f  = 3.6f;
			System.out.println("e  " + e);
	System.out.println("f  " + f);
	int  u = (int)e;
	int i = (int)f;
	System.out.println("u = " + u );
	System.out.println("i = " + i);
	System.out.println("_________________");
	
	
	// ép kiểu nguyên thủy và đối tượng
	
	int x = new Integer(32);
	System.out.println("x  " + x);
	
} 

}
