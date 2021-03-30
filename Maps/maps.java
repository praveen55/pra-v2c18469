import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> p = new HashMap<>();
		p.put(101,"sam");
		p.put(102,"Tom");
		p.put(103,"Jhon");
		p.put(104,"Jack");
		p.put(105,"Tom");
		System.out.println(p);
		p.replace(104, "Jackson");
		System.out.println(p);
		
		for(Entry<Integer, String> s : p.entrySet())
		{
			System.out.println(s.getKey()+ " " +s.getValue());		
		}
		p.put(106, "Max");
		p.put(100, "Lee");
		p.put(null, "Lee");
		p.put(100, null);
		p.remove(102);
		System.out.println(p);
		System.out.println("After removed");
		for(Entry<Integer, String> s : p.entrySet())
		{
			System.out.println(s.getKey()+ " " +s.getValue());		
		}
	}
}

		
