package cau_truc_ifelse;
import java.util.Scanner;
public class TimSoNhoNhat {
		public static void main(String[] args) {
			int firtNumber , secondNumber ;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap vao so thu nhat: ");
			firtNumber = scanner.nextInt();
			System.out.println("Nhap vao so thu hai : ");
			secondNumber = scanner.nextInt();
			int minNumber = firtNumber;
			
			if(firtNumber > secondNumber)
	       minNumber = secondNumber;
			System.out.println("so nho nhot trong 2 so :" +  firtNumber + "và "  + secondNumber + "là " + minNumber );
		}
}
