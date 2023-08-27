package org.javapractice.java_basic_program;


public class xy {
	static int i=1111;
	static {
		i=(i--)-(--i);
		System.out.println(i+"stat");
	}
	{
		i=i--+--i;
		System.out.println(i+"non-stat");
	}
	public static void main(String[] args) {
		//y a = new y();
		
		System.out.println(i);
		
	}

}
