package Tinh_Tong_Cac_So_Nguyen;
import java.util.Scanner;
public class Vong_lap_do_while {
   public static void main(String[] args) {
	int number,sum = 0;
			Scanner scanner = new Scanner(System.in) ;
	   do {
		   System.out.println("nhap vao so nguyen bat ky : ");
		   number = scanner.nextInt();
		   sum += sum + number;
		   
	   } while(sum<100);
	   System.out.println("tong cac so nguyen vua nhap = " + sum );
	
}
}
