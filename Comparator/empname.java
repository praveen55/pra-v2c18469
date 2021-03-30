package javacollectios;

import java.util.Comparator;

public class empname implements Comparator<details> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int compare(details o1, details o2) {
		details a1 = (details)o1;
		details a2 = (details)o2;
		return a1.name.compareTo(a2.name);
	}

}
