package lam;

class exmp3{
	public void mul(int a,int b,int c) {
	System.out.println(a*b*c);
	}
}
class exmp44 extends exmp3{
	public void sub(int a,int b,int c) {
		System.out.println(a-b-c);
}
}
public class example11 {
	public static void main(String[] args) {
		exmp3 b=new exmp3();
		b.mul(10, 5, 2);
		exmp44 a=new exmp44();
	    a.sub(10, 5, 2);
	}

}
