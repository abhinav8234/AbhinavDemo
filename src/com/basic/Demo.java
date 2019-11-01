package com.basic;
import java.io.FileWriter;

public class Demo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// Open the file.
		try{    
	           FileWriter fw=new FileWriter("D:\\testout.txt");    
	           fw.write("Welcome to javaTpoint.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }
}
		//int space=3;
		//int star=1;
		//for(int i=1; i<=4;i++){
			//for(int j=1; j<=space;j++){
				//System.out.print(" ");
			//}
			//for(int k=1;k<=star;k++){
				//System.out.print("*");
			//}
			//System.out.println();	
			//space--;
			//star+=2;
		
	

