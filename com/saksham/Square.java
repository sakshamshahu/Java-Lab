package com.saksham;
import java.util.Scanner;
public class Square {
	    public static void main(String[] args){
	        Scanner obj = new Scanner(System.in);
	        int[] arr = new int[10];
	        System.out.println("Enter 10 numbers:");
	        int currentsquare = 0;
	        for(int i = 0; i<10; i++){
	            arr[i] = obj.nextInt();
	            currentsquare = arr[i]*arr[i];
	            System.out.println(String.format(" The square of this number is: %d ", currentsquare));
	            
	        }
	        int sum = 0;
	        for (int i : arr) {
	            sum += i*i;
	        }
	        System.out.println(String.format("\n The sum of squares of numbers in the array is %d", sum));
	   }
	    
}

