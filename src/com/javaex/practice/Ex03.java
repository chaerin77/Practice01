package com.javaex.practice;

public class Ex03 {
      public static void main(String[] args) {
    	  
    	  int x =1;
    	  int y =1;
    	  
    	  int a = ++x *2; // ++  1을 증가시킨다 x ->x
    	  int b = y++ *2; //y *2 -> y*2를 b에 넣는다(b =(대입) 2 )-> y값을 1 증가시킨다(맨마지막이 이런 의미) ->y값 =2
    	  
    	  System.out.println("a=" + a); //a= 4   ("a="+a) 이거뜻은 a= 까지를 문자로봐준거 그다음에 a라는값 출력되게한거
    	                                               //그게아닌가본데 문자로 볼거였으면 위에서 String썼어야하지않냐? 이거 정수로본거네
    	  System.out.println("b=" + b); //b= 4  ->아님 --->2
    	  System.out.println("b=" + y++*2);
    	  System.out.println("x=" + x); //x= 1
    	  System.out.println("y=" + y); //y= 1
    	 
    	  
    	  int temp = 100;
    	  
    	  System.out.println(temp);
    	  System.out.println(temp++*2);//-> temp *2 //temp *2 출력// temp +1 
    	  System.out.println(temp);       //temp
    	  
    	  
    
    	  
    	  
      }
}
