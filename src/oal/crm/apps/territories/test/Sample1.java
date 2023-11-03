package oal.crm.apps.territories.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Emp   implements  Comparable<Emp>{
	int id;
	String name;
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
}


public class Sample1 {
	
	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
		System.out.println();
		List<Emp> ls1 = new ArrayList<>();
		Set<Emp> set = new HashSet<Emp>();
	//	Set<Emp> set = new TreeSet<Emp>();
		for (int i = 1; i<= 100000 ; i++) {
			Emp e = new Emp(i, "Name_"+i);
			ls1.add(e);
		}
		System.out.println(ls1.size());
		ls1.addAll(ls1);
		System.out.println(ls1.size());
		
//		ls1.parallelStream().forEach(e -> {
//			e.name = e.getName()+"Upd";
//			set.add(e);
//		});
//	
		ls1.stream().forEach(e -> {
			e.name = e.getName()+"Upd";
			set.add(e);
		});
		System.out.println(set.size());
		//System.out.println(set);
		Long end = System.currentTimeMillis();
		System.out.println(end-start + "ms");
	}

}
