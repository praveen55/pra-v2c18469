interface method1{
	public void run();
}
interface method2{
	abstract void print();
	public int draw();
}
interface method3{
	public void show();
	public int showable();
	default void display() {
		System.out.println("Display Method");
	}
}
public class exmp implements method1,method2,method3 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show method");
	}

	@Override
	public int showable() {
		// TODO Auto-generated method stub
		System.out.println("Showable method");
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print Method");
	}

	@Override
	public int draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Method");
		return 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method");
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method Run");
		method3.super.display();
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	exmp pk= new exmp();
	System.out.println("Method1......");
	pk.run();
	System.out.println("Method2......");
	pk.print();
	pk.draw();
	System.out.println("Method3......");
	pk.show();
	pk.showable();
	pk.display();
	}
}