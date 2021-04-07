import java.awt.print.Printable;

interface method111{
	public static void print() {
		System.out.println("Print Static Method");
	}
	default void display(){
		System.out.println("Default method");
	}
}	
interface method112{
	public static void mul(int a, int b) {
		System.out.println("Static method " +(a*b));
	}
}

public class examp2 implements method112,method111 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method112.mul(5, 2);
		method111.print();
	}
	public void display() {
		method111.super.display();
	}
}


