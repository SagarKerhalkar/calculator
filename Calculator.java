package calculator;
import java.util.Scanner;

public class clculator1 {
	public static void main(String[] args) {

		char operator;
		double a,b;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter +,-,*./");
		
		operator = input.next().charAt(0);
		
		System.out.println("Write No one by one");
		a = input.nextDouble();
		b = input.nextDouble();
		
		input.close();
		
		switch (operator) {
		 case '+' :
			 System.out.printf("%f + %f = %f",a,b,(a+b));
			 break;
			 
		 case '-' :
			 System.out.printf("%f - %f = %f",a,b,(a-b));
			 break;	 
			 
		 case '*' :
			 System.out.printf("%f * %f = %f",a,b,(a*b));
			 break;
			 
		 case '/' :
			 if( b !=0 )
			 System.out.printf("%f / %f = %f",a,b,(a/b));
			 else 
			 System.out.println("Wrong");
			
			 break;
			 
		default:
		 System.out.printf("invalid",operator);
		}
		
		
	}
}
