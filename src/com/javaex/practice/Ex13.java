package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("환전할 원화를 입력하세요:");
		
		int won = sc.nextInt(); //입력될 원화가 정수라서 int 사용후 won이라는 변수명을 내가 정해줌
		
		
		final double exc = 1230.95;   //float썼을때는 이렇게 딱 안떨어졌는데 float이 덜 정확하게 표시해 주는거 아니었나? 소수점자리수 덜보이는게 float아닌가
		
		System.out.println("받으실 달러는 " + (double)won/(double)exc); //위에 float썼다면 밑에도 float써야하는지..일단 하나float써놓고 밑에 double쓰는건안되는거같음
		
		sc.close();
		
		
	}

}
