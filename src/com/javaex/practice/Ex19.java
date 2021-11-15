package com.javaex.practice;

public class Ex19 {
	
	public static void main(String[] args) {
		
		//빛의 속도 1초에 300000km 1일->1440분 -> 하루86400초 25920000000km * 365일 -> 94600000000000값 나오는데
		//기준을 뭘로잡을까 하루를 초로 바꾼거? 년단위라면 
		int year = 365;
		long dayD = 86400*300000L;
		
		
		System.out.println("빛이 1년 동안 가는 거리는 " + year*dayD + " km " + "입니다.");
	}
	

}
