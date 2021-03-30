package javacollectios;

import java.util.Comparator;

public class empid implements Comparator<details> {


	@Override
	public int compare(details o1, details o2) {
		// TODO Auto-generated method stub
		details a1 = (details)o1;
		details b1 = (details)o2;
		
		if(a1.ID == b1.ID)
		{
			return 0;
		}
		else if (a1.ID > b1.ID) {
			return 1;
		}else {
		return -1;
		}
	}
}