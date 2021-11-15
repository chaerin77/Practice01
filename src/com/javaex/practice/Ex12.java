package com.javaex.practice;

import java.util.Scanner; //두번째로 스캐너를 연결해주는 역할 하는 이줄 써줌

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //내가쓰는순서 키보드입력한값 받고 출력하는프로그램만들거야 라는이거 첫번째로 씀
	 
	    System.out.print("반지름을 입력하세요:");//3.가장먼저써있을 이거 출력되게 이거써줌	    
	    int r = sc.nextInt();  //사용자가 입력할곳 ..입력한 정보가 저장될 곳..?	4.사용자입력창    
	    
	    
	    final float pi = 3.14f; //float 쓸거면 뒤에 f꼭 붙이기. 처음에double썼었는데 소수점열몇번째자리까지 자세하게 나와서 float썼음
	    double area = pi*r*r;
	    
	    System.out.println("원의 넓이는 "+ pi*r*r); //5. 이렇게 출력될것이다 라는걸 먼저써주면서 
	    										//	계산될 영역에 새로 필요한 변수명을 어떤걸로 할지 정해주고 필요한 식을 쓴다. 
	    
		
		sc.close();
	
	}

}
