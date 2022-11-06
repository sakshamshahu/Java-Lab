package LAB8.p4;

import java.util.Scanner;

public class index {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the direction of cars on the single track (index number) \n1) Same\n2)Opposite");
		String x=sc.nextLine();
		
		try{
			if (x.equals("1")){
				 System.out.println("No collision");
			}
			else if(x.equals("2")){
	   throw new Exception("Cars moving in the opposite direction and may collide");
			}
			else {
				System.out.println("Write 1 or 2");
			}
		}
		catch(Exception e){
		System.out.println(e);
		}
	}
}
