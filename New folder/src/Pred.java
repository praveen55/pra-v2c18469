package student;

import java.util.ArrayList;
import java.util.function.Predicate;

class stud {
	// TODO Auto-generated method stub
	String name;
	int id;
	int age;
	
	public stud(String name,int id,int age){
	super ();
	this.name = name;
	this.id = id;
	this.age = age;
	}
}

public class Pred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<stud> list = new ArrayList<stud>();
		list.add(new stud("RAM",101,12));
		list.add(new stud("SAM",102,19));
		list.add(new stud("TOM",103,12));

		Predicate<stud> a = (i) -> (i.age>18);
		for(stud i : list ){
			if(a.test(i)){
				System.out.println("STUDENT NAME : " + i.name + " STUDENT ID : " + i.id + " STUDENT AGE : "+i.age);
				System.out.println("[Allows to Watch Movie]");
			}else
			{
				System.out.println("STUDENT NAME : " + i.name + " STUDENT ID : " + i.id + " STUDENT AGE : "+i.age);
				System.out.println("[Not Allowed to Watch Movies]");
			}
		}
	}
}