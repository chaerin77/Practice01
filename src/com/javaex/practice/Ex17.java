package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		
		int r = sc.nextInt(); //2.nextInt 하고 또 ();붙이는거 까먹음 ㅠ 기억하기
		
		
		final double pai = 3.14; //4. 부피인V를 정했으나 부피를 구하려면 파이값이 필요해서 상수값지정을 먼저 해줬다.
		
		//double V = (double)4/(double)3*pai*r*r*r; 괄호안씌웠을땐 제대로 안나왔음
		double V = (double)4/(double)3*pai*(r*r*r); //5. V의 값의 계산식을 넣어주었다.
		
		System.out.println("구의부피는:" + V); //3. 2까지 쓰고나서 구의부피는머시기 출력되는것 먼저 만들어주면서 부피값이 들어갈 곳의 변수명을 임의로 정했다
		
		
		sc.close(); //왜 55999999999995이렇게안나올까
	}

}
