package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격:");
		int price = sc.nextInt();  //사용자가 가격 입력할곳
		
		System.out.print("받은돈:"); //받은돈:이라고 출력될곳
		int tmoney = sc.nextInt(); 
		
		System.out.println("======================");
		
		
		System.out.println("받은돈: " + (double)tmoney);
		
		
		System.out.println("상품가격: " + (double)price);
		
		
		System.out.println("부가세: " + price*0.1);
		
		System.out.println("잔액: " + ((double)tmoney-(double)price)); //식에 괄호를 한번더 넣어줘야하는거였음 안돼서 막 money2설정하고 난리였는데 이게 문제였음
		
		
		
		
		sc.close();
	}

}
