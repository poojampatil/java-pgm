package com.niit;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class pgm3{
public static void main(String args[]){

	HashMap<Integer ,String> map = new HashMap<Integer, String>();
	map.put(2, "hi");
	map.put(13,"hello");
	map.put(12,"hello world");
	for(Iterator <Entry<Integer,String>>it=map.entrySet().iterator();it.hasNext();){
		Entry<Integer,String>Entry = it.next();
		if(Entry.getKey() % 4==0)
		{
			it.remove();
			
		}
	}
	System.out.println("map size :"+map.size());
	
}
}



