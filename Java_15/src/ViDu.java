import java.util.Scanner;

public class ViDu {
 public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 	
 		System.out.println("nhập vào số a    ");
 		int a = sc.nextInt();
 		System.out.println(a + " là số " +  ( (a%2==0)?"chẵn":"lẻ" ));
 	}
}
 		
