package com.javaex.practice;

public class Ex07 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i); //11 (++i -> i값1증가시키기 ++이 i앞에 있어서 이거 먼저 해주는것)
		System.out.println(n); //1 (11%2 -> 나머지가1이라서 n값도 1)
		
	}

}
