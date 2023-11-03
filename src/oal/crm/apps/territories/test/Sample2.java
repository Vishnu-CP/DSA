package oal.crm.apps.territories.test;

import java.util.ArrayList;
import java.util.List;



public class Sample2 {

	public static void main(String[] args) {
		List< Emp> ls  = new ArrayList<Emp>();
		int level = 0;
		ls.add(new Emp(0,"A"));
		ls.add(new Emp(0,"B"));
		ls.add(new Emp(0,"C"));
		ls.add(new Emp(0,"D"));
		System.out.println(ls);
		
		
		for(Emp e : ls) {
			e.setId(++level);
		}
		System.out.println(ls);
	}
}


//class Emp   implements  Comparable<Emp>{
//	int id;
//	String name;
//	
//	public Emp(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Override
//	public int compareTo(Emp o) {
//		// TODO Auto-generated method stub
//		return this.id - o.id;
//	}
//	@Override
//	public String toString() {
//		return "Emp [id=" + id + ", name=" + name + "]";
//	}
//	
//	
//}