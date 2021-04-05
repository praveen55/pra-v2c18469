import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student1{
	int ID;
	String name;
	int age;
	public student1(int iD, String name, int age) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
	}
}
public class arraylistlamda {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student1> list = new ArrayList<student1>();
		list.add(new student1(12345, "SAM", 20));
		list.add(new student1(12344, "RAM", 26));
		list.add(new student1(12346, "JOHN", 25));
		list.add(new student1(12347, "JACK", 24));
		
		System.out.println(".......ID SORTING.......");
		Comparator<student1> z= (a,b) -> {
			return (a.ID==b.ID)? 0: (a.ID > b.ID)? 1:-1;
			};
		Collections.sort(list,z);
		for(student1 s: list)
		System.out.println("id:"+s.ID+" "+"name:"+s.name+" "+"age:"+s.age);
		
		System.out.println(".......AGE SORTING.......");
		Comparator<student1> z1= (a,b) -> {
			return (a.age==b.age)? 0: (a.age > b.age)? 1:-1;
			};
		Collections.sort(list,z1);
		for(student1 s1: list)
		System.out.println("id:"+s1.ID+" "+"name:"+s1.name+" "+"age:"+s1.age);
		
		
		System.out.println(".......NAME SORTING.......");
		Comparator<student1> z2=(a,b)->{
			   return (a.name.compareTo(b.name));
		};
		Collections.sort(list,z2);
		for(student1 s2:list)
		System.out.println("id:"+s2.ID+" "+"name:"+s2.name+" "+"age:"+s2.age);
	}
}
