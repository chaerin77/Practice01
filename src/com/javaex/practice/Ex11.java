package com.javaex.practice;

import java.util.Scanner; //단축키 ctrl shift o

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int money = sc.nextInt(); //sc nextInt; 이거 아니고 sc.nextInt();이거임
		//System.out.println("월급을 입력하세요:" + money); 이거아니고 순서가 월급을입력하세요 문자 나온다음에 입력값200나와야함 다시짜
	
	    System.out.print("월급을 입력하세요:"); //바로옆에 숫자붙여주려고 print씀
	    int money = sc.nextInt();
	   
	    int save = money * 120;
	    
	    System.out.println("10년동안 최대 저축액은 " + save + " 입니다.");
	    
	    sc.close();
		
	}

}
