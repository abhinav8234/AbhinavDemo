package com.basic;

public class Array {
	public static void main(String[] args) {
		
		int [] a={2,4,6,1,9,5,7};
		
		int h= a[0];
		int sh=a[0];
		
		for(int v:a){
			
			if(h<v){
				sh=h;
				h=v;
			}
			else if(sh<v){
				sh=v;
				
			}
				
		}
		 
		System.out.println(h);
		
		System.out.println(sh);
		
	}

}
