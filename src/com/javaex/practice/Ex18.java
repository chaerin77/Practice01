package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		int F = sc.nextInt();
		
		double C = (double)5/9 * (F - 32);
	    System.out.println("화씨 " + (double)F + " 의 " + "섭씨온도는 " + C);
		
		sc.close();
		
	}
	

}
