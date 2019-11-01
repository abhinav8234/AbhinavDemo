package com.basic;

public class SubStringEx {
public static void main(String[] args) {
	String s ="i live india";
	String [] s1= s.split(" ");
	String Vl="";
	
	for( int i=0;i<=s1.length-1; i++){
		
		Vl+=s1[i].substring(0, 1).toUpperCase()+s1[i].substring(1, s1[i].length()).toLowerCase()+" ";
		
	}
	System.out.println(Vl);
}
}
