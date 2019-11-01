package com.basic;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int n= sc. nextInt();
while(n<=8){
	if(n%3==0){
		System.out.println("null");
	}
	else if(n%7==0){
		System.out.println("hello");
	}
	else if(n%3==0&n%7==0){
		System.out.println("donoba");
	}
	else{
		System.out.println(n);
	}
	n++;
}

		
	}

}
