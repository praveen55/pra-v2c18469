package student;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

class product {
	// TODO Auto-generated method stub
	String Product_name;
	int size;
	int Shocks_price;
	int Shoe_price;
	
	public product(String product_name, int size, int shocks_price,int shoe_price) {
		super();
		Product_name = product_name;
		this.size = size;
		Shocks_price = shocks_price;
		Shoe_price = shoe_price;
	}
}

public class bipred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<product> list = new ArrayList<product>();
		list.add(new product("Nike",4,30,40));
		list.add(new product("Puma",6,100,60));
		list.add(new product("Adidas",5,15,30));

		BiPredicate<Integer, Integer> p=(Shocks_price,Shoe_price) -> ((Shocks_price + Shoe_price)>=50);
		//BiPredicate<Integer, Integer> p1=(Shoe_price,size) -> ((Shoe_price > 50) && (size>5));
		
		System.out.println("COSTLY PRODUCTS");
		for(product s :list){
				if(p.test(s.Shocks_price, s.Shoe_price)){
				System.out.println("PRODUCT NAME : " + s.Product_name + " PRODUCT SIZE : " + s.size + " SHOCKS PRICE : " +s.Shocks_price + "SHOE PRICE : " + s.Shoe_price);
				}else{
					System.out.println("Cheap Products");
					System.out.println("PRODUCT NAME : " + s.Product_name + " PRODUCT SIZE : " + s.size + " SHOCKS PRICE : " +s.Shocks_price + "SHOE PRICE : " + s.Shoe_price);
			}
		}
		/*for(product s1 :list){
			if(p1.test(s1.Shoe_price, s1.size)){
				System.out.println("PRODUCT NAME : " + s1.Product_name + " PRODUCT SIZE : " + s1.size + " SHOCKS PRICE : " +s1.Shocks_price + "SHOE PRICE : " + s1.Shoe_price);
				}else{
					System.out.println("Cheap Products");
					System.out.println("PRODUCT NAME : " + s1.Product_name + " PRODUCT SIZE : " + s1.size + " SHOCKS PRICE : " +s1.Shocks_price + "SHOE PRICE : " + s1.Shoe_price);	
				}*/
		}
	}
 