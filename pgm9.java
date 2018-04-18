package com.niit;
import java.util.*;
public class pgm9 {

public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		boolean ss=false;
		if(st.length()==8){
			ss=st.matches("[A-Z]{3}\\d{4}[A-Z]{1}");
			System.out.println(ss);
		}
		else
		{
			System.out.println("incorrect pan id"+ss);
			System.exit(0);
	}


	
}

}


