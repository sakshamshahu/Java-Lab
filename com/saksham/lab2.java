package com.saksham;
import java.util.Scanner;
public class lab2 {
	    public static void main(String[] args){
	        Scanner obj = new Scanner(System.in);
	        System.out.println("Enter numbers:");
	        int[] n = new int[3];
	        n[0] = obj.nextInt(); 
	        n[1] = obj.nextInt(); 
	        n[2] = obj.nextInt(); 
	        
	        for (int i : n) {
	            for (int j : n) {
	                for (int k : n) {
	                    System.out.println(Integer.toString(i*100+j*10+k));
	                }
	            }
	        }
	    }
	}
