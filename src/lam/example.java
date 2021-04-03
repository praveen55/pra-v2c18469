package lam;

class exmp{
	int add(int a,int b, int c){
	return a+b+c;
}
	int sub(int a, int b, int c){
		return a-b-c;
}
	int mul(int a, int b, int c){
		return a*b*c;
}
	int div(int a, int b){
		return a/b;
}
}

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exmp e = new exmp();
		int a = e.add(10, 5, 2);
		int b = e.sub(10, 5, 2);
		int c = e.mul(10, 5, 2);
		int d = e.div(10, 5);
		System.out.println("Additon : "+a);
		System.out.println("Subtraction : "+b);
		System.out.println("Multiplication : "+c);
		System.out.println("Divide : "+d);

	}

}
