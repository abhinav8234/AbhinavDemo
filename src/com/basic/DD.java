package com.basic;

import java.util.Date;

public class DD {

	
	 public String getTimeStamp() {
		    Date date = new Date();
		    long timeCurrent = date.getTime();
		    return String.valueOf(timeCurrent); 
	 }
	 public String getRandomDigits(int randomdigitlength) {
		 String timeStamp = getTimeStamp();
		 System.out.println(timeStamp);
		 return  timeStamp.substring(timeStamp.length()-randomdigitlength,timeStamp.length());
	}
	public static void main(String[] args) {
		
		 DD d = new DD();
		 System.out.println(d.getTimeStamp());
		 System.out.println(d.getRandomDigits(5));
	}
}
