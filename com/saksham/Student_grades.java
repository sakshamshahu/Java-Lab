package com.saksham;
import java.util.Arrays;
import java.util.Scanner;
public class Student_grades {
	public static void main(String args[]) {
		int[] marks = new int[10];
		int j =0;
		int i =0;
		int temp =0;
		Scanner scan = new Scanner(System.in);
		
		for (j = 0; j<10 ;j++) {
			System.out.print("Enter the marks of Student "+(j+1)+": ");
			marks[j] = scan.nextInt();
		}
		scan.close();
		 for (int k = 0; k < marks.length; k++) {     
	            for (int m = k+1; m < marks.length; m++) {     
	               if(marks[k] > marks[m]) {    
	                   temp = marks[k];    
	                   marks[k] = marks[m];    
	                   marks[m] = temp;    
	               }     
	            }     
	        }    
		for(i=0; i< marks.length; i++) {
			System.out.println("The marks are: "+marks[i]);
			if(40 <= marks[i] && 50 >= marks[i] ) {
				System.out.println(String.format(" %d | Pass", i));
			}
				else if(51 <=marks[i]&& 75 >= marks[i] ) {
					System.out.println(String.format(" %d | Merit",i));
				}
				else if(marks[i]>= 75 && marks[i] <= 100) {
					System.out.println(String.format("%d | Distinction",i));
			}
				else {
					System.out.println("Please enter valid marks from 40 - 100");
				}
		}
	}
}
