package javacollectios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;




class sportslist{
	enum Skill{
		Excellend,Good,Average,Belowaverage
	}
	int ID;
	String studentname;
	String sports;
	Skill skill;
	public sportslist(int ID, String studentname, String sports, Skill skill) {
		super();
		this.ID = ID;
		this.studentname = studentname;
		this.sports = sports;
		this.skill = skill;
	}
	
}
public class Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<sportslist> s = new LinkedList<sportslist>();
		s.add(new sportslist (123,"SAM","Cricket", sportslist.Skill.Excellend));
		s.add(new sportslist (124,"Tom","Cricket", sportslist.Skill.Good));
		s.add(new sportslist (125,"Jhon","Cricket", sportslist.Skill.Average));
		s.add(new sportslist (126,"Jack","Cricket", sportslist.Skill.Belowaverage));
		
		System.err.println("\tCRICKET TEAM"); 
		Iterator<sportslist> itr = s.iterator();
		while(itr.hasNext()) {
			sportslist d1 =(sportslist)itr.next();
			
			System.out.println("STUDENT ID : " + d1.ID + " STUDENT NAME :  " + d1.studentname + " Sports Name : " + d1.sports + " SKILLS : " + d1.skill);
	}
		LinkedList<sportslist> sp = new LinkedList<sportslist>();
		sp.add(new sportslist (123,"Max","Chess", sportslist.Skill.Excellend));
		sp.add(new sportslist (124,"Raj","Chess", sportslist.Skill.Good));
		sp.add(new sportslist (125,"Rock","Chess", sportslist.Skill.Average));
		sp.add(new sportslist (126,"Smith","Chess", sportslist.Skill.Belowaverage));
		
		System.err.println("\tCHESS TEAM");
		for(sportslist pk : sp) {
			System.out.println("STUDENT ID : " + pk.ID + " STUDENT NAME :  " + pk.studentname + " Sports Name : " + pk.sports + " SKILLS : " + pk.skill);
		}
	}
}