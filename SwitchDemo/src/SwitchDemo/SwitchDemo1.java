package SwitchDemo;
import java.util.Scanner;

 public class SwitchDemo1 {
	 public static void main(String[] args) {
		int  month;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap thang :");
		month = scanner.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang " + month + " Nhung thang co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang" + month +"Nhung thang co 30 ngay");
			break;
		case 2:
				int year;
				System.out.println("Moi ban nhap nam : ");
				year = scanner.nextInt();
				if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					System.out.println("Thang " + month + "nam " + year + "co 29 ngay");
				} else {
					System.out.println("thang " + month + "nam " + year + "co 28 ngay");
					
				}
				break;
				default : System.out.println("thang vua nhap khong dung");
		}
	}
 }