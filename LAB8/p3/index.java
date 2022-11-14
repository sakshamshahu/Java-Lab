package LAB8.p3;
import java.util.*;
public class index {

	public static void main(String args[])
	 {
		float a,b;
		double add,sub,mul,div;
		System.out.println("CALCULATOR:");
		System.out.println("Enter two numbers for calculation:");
		Scanner obj =new Scanner(System.in);
		Scanner obj1 =new Scanner(System.in);
		try
		{
		
		a=obj.nextInt();
		b=obj.nextInt();
	
		System.out.println("Enter the serial number pertaining to the calculation you want to perform \n1) Addition \n2) Subtraction \n3) Multiplication \n4) Division");
		int c = obj1.nextInt();
		
		switch(c) {
			case 1:
				add=a+b;
				System.out.println("Addition ="+add);
				break;
			case 2:
				sub=a-b;
				System.out.println("Subtraction ="+sub);
				break;
			case 3:
				mul=a*b;
				System.out.println("Multiplication ="+mul);
				break;
			case 4:
				div=a/b;
				System.out.println("Division ="+div);
				break;
			default:
				break;
			}
		}
		catch(InputMismatchException e){
		System.out.println("Program Is Terminated Exception Caught");
		}
		obj.close();
		obj1.close();
		
	}
}

