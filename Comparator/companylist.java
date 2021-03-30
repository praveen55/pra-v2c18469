package javacollectios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;


	class details {
		
	//public static Object status1;
	int ID;
	String name;
	Status status;
	
	enum Status{
		CONFORMED,REJECTED,PENDING
	}
	public details(int ID, String name, Status status) {
		super();
		this.ID = ID;
		this.name = name;
		this.status = status;
	}
}
class companylist{
		
		
		public static void main(String[] args) {
			
		ArrayList<details> list = new ArrayList<details>();
		/*details l1 = new details(101,"sam");
		details l2 = new details(102,"tom");
		details l3 = new details(105,"jack");
		details l4 = new details(104,"jhon");*/
		
		list.add(new details (101,"SAM", details.Status.CONFORMED));
		list.add(new details (102,"TOM", details.Status.REJECTED));
		list.add(new details (103,"RAM", details.Status.PENDING));
       
		System.out.println("\tNAME SORTING");
		Collections.sort(list, new empname());
		for(details pk : list) {
		System.out.println("EMPLOYEEID : " +pk.ID + " EMPLOYEE NAME : " +pk.name+ " Employee Status : "+pk.status);
		}
		
		System.out.println("\tID SORTING");
		Collections.sort(list, new empid());
		/*Iterator<details> itr = list.iterator();
		while(itr.hasNext()) {
			details d1 =(details)itr.next();*/
		for(details d1 : list)
			System.out.println("EMPLOYEEID : " +d1.ID + " EMPLOYEE NAME : " +d1.name + " Employee Status : " +d1.status);
		}
		}