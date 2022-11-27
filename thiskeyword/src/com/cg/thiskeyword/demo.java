package com.cg.thiskeyword;

public class demo {
	 void m() {
		 System.out.println(this);
	 }

	public static void main(String[] args) {
		demo d1 = new demo();
		demo d2 = new demo();
		System.out.println(d1);
		System.out.println(d2);
		d2.m();
				
	}

}
