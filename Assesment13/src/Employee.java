import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Emp{
	int ID;
	String Name;
	int Age;
	
	
	public Emp(int iD, String name, int age) {
		super();
		ID = iD;
		Name = name;
		Age = age;
	}
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Emp> employeelist = new HashSet<Emp>();
		employeelist.add(new Emp(111, "Jhon", 24));
		employeelist.add(new Emp(112, "Jack", 22));
		employeelist.add(new Emp(113, "Max", 35));
		employeelist.add(new Emp(114, "Max", 30));
		employeelist.add(new Emp(115, "Sam", 50));
		employeelist.add(new Emp(116, "Steve", 65));
		
		System.out.println(" EMPLOYEES ABOVE 50 AGE");
		employeelist.stream().filter(a -> a.Age >=50)
		.forEach(a-> System.out.println(" EMPLOYEE ID : "+a.ID +" EMPLOYEE NAME : "+ a.Name+" EMPLOYEE AGE : "+a.Age));
		System.out.println();
		
		System.out.println(" EMPLOYEES BELOW 50 AGE");
		employeelist.stream().filter(a -> a.Age < 50)
		.forEach(a-> System.out.println(" EMPLOYEE ID : "+a.ID +" EMPLOYEE NAME : "+ a.Name+" EMPLOYEE AGE : "+a.Age));
		System.out.println();
		
		Emp e1 = employeelist.stream().max((p,k) -> p.Age>k.Age ? 1 : -1).get();
		Emp e2 = employeelist.stream().min((p,k) -> p.Age>k.Age ? 1 : -1).get();
		System.out.println("EMPLOYEE ID : " + e1.ID + " EMPLOYEE NAME : " + e1.Name + " EMPLOYEE AGE : " +e1.Age);
		System.out.println("EMPLOYEE ID : " + e2.ID + " EMPLOYEE NAME : " + e2.Name + " EMPLOYEE AGE : " +e2.Age);
		System.out.println(); 
		
		HashSet<String> name1 = (HashSet<String>)employeelist.stream().filter(e->e.Name.equals(e.Name))
				.map(e->e.Name)
				.collect(Collectors.toSet());
		System.out.println("Duplicates are Removed... ");
		for (String String : name1) {
			System.out.println(String);
		}
	}
}

