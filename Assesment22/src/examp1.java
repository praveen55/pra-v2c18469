interface method11{
	default  void display(){
		System.out.println("Default method");
	}
}
interface method12{
	public static void run() {
		System.out.println("Static Run method");
	}
}
public class examp1 implements method11, method12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method12.run();
		examp1 pk = new examp1();
		pk.display();
}
}
