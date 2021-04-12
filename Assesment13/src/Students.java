import java.util.ArrayList;
class Stud{
	int ID;
	String name;
	float Marks;
	
	public Stud(int iD, String name, float marks) {
		super();
		ID = iD;
		this.name = name;
		Marks = marks;
	}
}
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stud> studentlist = new ArrayList<Stud>();
		studentlist.add(new Stud(101, "Sam", 100f));
		studentlist.add(new Stud(102, "Tom", 80f));
		studentlist.add(new Stud(103, "Tom", 70f));
		studentlist.add(new Stud(104, "Ram", 60f));
		studentlist.add(new Stud(105, "Tom", 55f));
		studentlist.add(new Stud(106, "Jhon", 50f));
		studentlist.add(new Stud(107, "Jack", 40f));
		studentlist.add(new Stud(108, "Max", 30f));
		studentlist.add(new Stud(109, "Maxwell",35f));
		studentlist.add(new Stud(110, "Raj", 10f));
		
		System.out.println(" PASSED IN DISTINCTION ");
		studentlist.stream()
		.filter(a->a.Marks>80)
		.forEach(a -> System.out.println("Distinction : "+a.ID +" "+ a.name + " "+ a.Marks));
		System.out.println();
		
		System.out.println(" PASSED IN FIRSTCLASS ");
		studentlist.stream()
		.filter(a-> (a.Marks<=80) && (a.Marks>60))
		.forEach(a -> System.out.println("First Class : " + a.ID+ " "+ a.name+ " "+ a.Marks));
		System.out.println();
		
		System.out.println(" PASSED IN SECONDCLASS ");
		studentlist.stream()
		.filter(a-> (a.Marks<=60) && (a.Marks>50))
		.forEach(a -> System.out.println("Second Class : " + a.ID+ " " + a.name+ " " + a.Marks));
		System.out.println();
		
		System.out.println(" PASSED IN THIRDCLASS ");
		studentlist.stream()
		.filter(a-> (a.Marks<=50) && (a.Marks>=35) )
		.forEach(a -> System.out.println("Third Class : " + a.ID+ " " + a.name+ " "+ a.Marks));
		System.out.println();
		
		System.err.println(" FAILED ");
		studentlist.stream()
		.filter(a->a.Marks<35)
		.forEach(a -> System.out.println("Fail : " + a.ID+ " " + a.name+ " " + a.Marks));
		System.out.println();
	}
}

	
