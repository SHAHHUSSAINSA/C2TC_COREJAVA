package com.cg.thiskeyword;
class Student{
	int rollno;
	String name;
	float cgpa;
	
	//Student(int i, String n, float c){
	//	rollno=i;
	//	name=n;
	//	cgpa=c;
	//}
	public Student(int rollno, String name, float cgpa){
		this.rollno=rollno;
		this.name=name;
		this.cgpa=cgpa;
	}
	void display() {
		System.out.println(rollno +""+ name +""+ cgpa);
	}
}
public class variables {

	public static void main(String[] args) {
		Student s1 = new Student(110,"hussain",8.8f);
        s1.display();
	}

}
