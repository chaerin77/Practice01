package com.javaex.practice;

public class Ex06 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i);  //10틀렸음 -->i++까지 하고 나면 +1해줘야해서 11나옴  
		                        //int i =10; 이라고 바로 print i 에다가 10 넣지말고 int i,n선언,초기화한거 적용하고 쓰기
		System.out.println(n);  //1틀렸음 --> i %2 => 0이고 이게 n값임
	}

}
