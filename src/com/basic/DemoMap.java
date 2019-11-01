package com.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {
	public static void main(String[] args) {
		
		HashMap mp= new HashMap ();
		//Map mp= new HashMap (
		
		mp.put(101, "anand");
		mp.put(102, "abhinav");
		mp.put(103, "anu");
		mp.put(105, "manu");
		
		System.out.println(mp);
		
		Set s =mp.keySet();
		System.out.println(s);
		
		Collection c=mp.values();
		
		System.out.println(c);
		
		Set s1=mp.entrySet();
		System.out.println(s1);
		
	Iterator it =s1.iterator();


	while(it.hasNext()){
		Map.Entry mmp=(Map.Entry)it.next();
		
		
		if(mmp.getKey().equals(103)){
			mmp.setValue("Abhinav Anand");
			
		}
		System.out.println( mmp.getKey()+"-----"+mmp.getValue());
	
	}
		
		
	}

}
