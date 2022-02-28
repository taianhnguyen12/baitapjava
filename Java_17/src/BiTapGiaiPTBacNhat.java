import java.util.Scanner;

public class BiTapGiaiPTBacNhat {
 public static void main(String[] args) {
	//PTBac nhat = 0
	 /*
	  * neu a = 0
	  *    b = 0 => PT vô số nghiệm
	  *    b != 0 => PT vô nghiệm
	  * neu a !=0
	  * => pt co nghiem duy nhat x =-b/a   
	  */
	 double a,b,x;
	 Scanner sc = new Scanner(System.in);
	  System.out.println("nhap vô a  = ");
	  a =sc.nextDouble();
	  System.out.println("nhap vô b = ");
	  b = sc.nextDouble();
	  
	  
	  if(a==0) {
		  //pt co nghiem b=0
		  if(b==0) {
			  System.out.println("Pt vô sô nghiem ");
		  }
		  else {
			  System.out.println("PT vô nghiem ");
		  }
	  }
	  else {
		  x = -b/a;
		  System.out.println("PT co nghiem x = " + x);
	  }
}
}
