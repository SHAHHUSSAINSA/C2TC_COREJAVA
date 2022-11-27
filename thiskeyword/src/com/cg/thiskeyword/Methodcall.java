package com.cg.thiskeyword;
class A{
	void m(A x) {
		System.out.println("method m is invoked");
	}
	void p() {
		m(this);
		System.out.println("method p is invoked");
	}
	class B{
		void n() {
			System.out.println("method n is inboked"); 
		}
		void q() {
			System.out.println("method q is invoked");
			}
	}
}
public class Methodcall {

	public static void main(String[] args) {
	  A obj =new A();
	  obj.p();
	}

}
