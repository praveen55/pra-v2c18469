package lamexp;
import java.util.ArrayList;
import java.util.Collections;

class student{
	int ID;
	String name;
	float marks;
	public student(int iD, String name, float marks) {
		super();
		ID = iD;
		this.name = name;
		this.marks = marks;
	}
	
}
public class lam {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> list = new ArrayList<student>();
		list.add(new student(12345, "SAM",(float) 98));
		list.add(new student(12344, "RAM", 50));
		list.add(new student(12346, "JOHN", 99));
		list.add(new student(12347, "JACK", 80));
		
		System.out.println("MARKS SORTING");
		Collections.sort(list,(a,b)->{
			if(a.marks == b.marks)
			{
				return 0;
			}
			else if (a.marks > b.marks ) {
				return 1;
			}else {
			return -1;}
		});
		for(student s : list) {
			System.out.println("Student ID : " + s.ID + " Student name : " + s.name +" student marks :  " + s.marks);
		}
		
		Collections.sort(list,(a,b)->{
		return a.name.compareTo(b.name);
		});
		System.out.println("NAME SORTING");
		for(student s1 : list) {
			System.out.println("Student ID : " + s1.ID + " Student name : " + s1.name +" student marks :  " + s1.marks);
		}
		System.out.println("ID SORTING");
		Collections.sort(list,(a,b)->{
			if(a.ID == b.ID)
			{
				return 0;
			}
			else if (a.ID > b.ID ) {
				return 1;
			}else {
			return -1;}
		});
		for(student s2 : list) {
			System.out.println("Student ID : " + s2.ID + " Student name : " + s2.name +" student marks :  " + s2 .marks);
		}
}}