package oal.crm.apps.territories.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	
	static void printUppercase(String s) {
		
		System.out.println(s.toUpperCase());
	}
	
	
	static int findGreatestProduct(int[] arr) {
		
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i>0 ; i--) {
			
			for(int j=0 ; j<i  ;j++) {
				
				int k= j+1;
				while(k <= i) {
					int temp = arr[j] * arr[k];
					if(temp == arr[i])
						return arr[i];
					else {
						k++;
					}
				}
				
			}
			
		}
		
		return -1;
		
	}
	
	public static String instantToDateStr(Instant dateTimeIns,String pattern) {

		if (dateTimeIns == null || pattern == null) {
			return null;
		}
		try {

			OffsetDateTime odt = dateTimeIns.atOffset(ZoneOffset.UTC);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
			String output = odt.format(formatter);
			return output;

		} catch (Exception e) {
			// TODO: handle exception
			return null;

		}

	}
	
	public static void main(String[] args) {
		 // int[] arr = {10,3,5,30,35} ;
//		 int[] arr = {17,2,1,35,30,45} ;
//		 int ans = findGreatestProduct(arr);
//		 System.out.println(ans);
		
		//printUppercase(s);
		
//		Double a = 10.9999999d;
//		Double b= 	0.1111111d;
//		Double c = null;
//		System.out.println(a+b+c);
//		
//		Long l1 =null;
//		Long l2 =null;
//		
//		System.out.println(l1);
//		System.out.println(l2);
//		
//		l1 = l1==null ? 0L : l1;
//		l2 = l2==null ? 0L : l2;
//		System.out.println(l1);
//		System.out.println(l2);
//		//testNestedJson();
		
		//testTime2();
//		Instant ins = Instant.now().atZone(ZoneOffset.UTC).toInstant(); 
//		String op =instantToDateStr(ins, "dd-MMM-uuuu HH:mm:ss");
//		System.out.println(ins);
//		System.out.println(op);
		
		
//		List<String> set = new ArrayList<String>();
//		set.add("hello");
//		set.add("Vishnu");
//		set.add("Soju,Kumar,Sharu");
//		set.add("Ramu");
		
//		System.out.println(set);
//		String s = String.join(",", set);
//		System.out.println(s+"hi");
	
		String from ="01-01-2023";
		String to = "31-01-2023";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDateFrom = LocalDate.parse(from, formatter);
		Instant instantFrom = localDateFrom.atStartOfDay(ZoneId.of("UTC")).toInstant();

		LocalDate localDateTo = LocalDate.parse(to, formatter);
		Instant instantTo = localDateTo.atTime(23, 59, 59).atZone(ZoneId.of("UTC")).toInstant();
		System.out.println(localDateFrom +" --- " + instantFrom);
		System.out.println(localDateTo +" --- " + instantTo);
		System.out.println(Utility.instantToDateStr(instantFrom, "dd-MM-uuuu H:m:s"));
		System.out.println(Utility.instantToDateStr(instantTo, "dd-MM-uuuu H:m:s"));
//		
		
	}
	
	public static String instantToDateStr(Instant dateTimeIns) {

		if (dateTimeIns == null) {
			return null;
		}
		try {

			OffsetDateTime odt = dateTimeIns.atOffset(ZoneOffset.UTC);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-uuuu");
			String output = odt.format(formatter);
			return output;

		} catch (Exception e) {
			// TODO: handle exception
			return null;

		}

	}
	
	static void testTime() {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate earlierOneMonth = now.minusMonths(2);
		System.out.println(earlierOneMonth);
		
		//LocalDate start = YearMonth.().atDay(1);
		LocalDate start  = YearMonth.of(now.getYear(), now.getMonthValue()).atDay(1);
		System.out.println(start);
		
		//System.out.println(earlierOneMonth.atStartOfDay());
		//earlierOneMonth.atStartOfDay();
		
		//Instant from = Instant.from(start.atStartOfDay());
		//Instant to = Instant.from(LocalDateTime.now());
		Instant instant = start.atStartOfDay(ZoneId.of("UTC")).toInstant();
		System.out.println(instant);
		
		LocalDate end = YearMonth.from(Instant.now().atZone(ZoneId.of("UTC"))).atEndOfMonth();
		LocalDateTime ldtEnd	= end.atTime(LocalTime.MAX);
		System.out.println(ldtEnd);
			
		//Instant instant2 = end.plusDays(1).atStartOfDay(ZoneId.of("UTC")).toInstant();
	  Instant instant2 = ldtEnd.atZone(ZoneId.of("UTC")).toInstant();
		
		System.out.println(instant2);
		
		
		
	}
	
	static void testTime2() {
		
		LocalDate startLD = LocalDate.now(ZoneId.of("UTC")).minusMonths(20);
		
		Instant startDate  = YearMonth.of(startLD.getYear(), startLD.getMonthValue()).atDay(1)
				.atStartOfDay(ZoneId.of("UTC")).toInstant();
		
		Instant endDate2=	YearMonth.from(startDate.atZone(ZoneId.of("UTC"))).atEndOfMonth().atTime(LocalTime.MAX).atZone(ZoneId.of("UTC")).toInstant();
		
		 Instant endDate = YearMonth.from(Instant.now().atZone(ZoneId.of("UTC"))).atEndOfMonth().atTime(LocalTime.MAX).atZone(ZoneId.of("UTC")).toInstant();
		 
		 System.out.println(startDate);
		 System.out.println(endDate);
		 System.out.println(endDate2);
		 
		
	}
	
	
	
	static void testNestedJson() {
		
//		map.put("Gov", "Gov");
//		map.put("Vishnu" , "Gov");
//		map.put("Divya" , "Gov");
//		map.put("Divyesh" , "Gov");
		
		List<Industry> ls1 = new LinkedList<Industry>();
		ls1.add(new Industry(1, "Gov", "Gov"));
		ls1.add(new Industry(1, "Vishnu", "Vishnu"));
		ls1.add(new Industry(1, "Gayu", "Gayu"));
		ls1.add(new Industry(2, "VisSoj", "Vishnu"));
		ls1.add(new Industry(2, "GayuChild", "Gayu"));
		
		List<Node>  list = new ArrayList<Node>();
		
	
		Map<Integer, List<Industry>> IndustrylistMap = ls1.stream()
				.collect(Collectors.groupingBy(Industry::getLevel));
		
		for(int i = 0; i < ls1.size(); i++){
			Industry obj = ls1.get(i);
	        //obj.children= [];

	       
			if(obj.level ==1) {
				list.add(new Node(obj.getIname(),obj.getParent(),new ArrayList<Node>()));
			}
			
			if(obj.level == 2) {
				
				for(Node n : list) {
					
					if(obj.parent == n.name) {
						n.getChild().add(new Node(obj.getIname(),obj.getParent(),new ArrayList<Node>()));
					}
				}
			}
	    }
		
		System.out.println(list);
	    
		
		
	}
	
	

}


class  Industry{
	
	Integer level;
	String  Iname;
	String  parent;
	List<Industry> childs;
	public Industry(Integer level, String iname, String parent) {
		super();
		this.level = level;
		this.Iname = iname;
		this.parent = parent;
		this.childs = new ArrayList<Industry>();
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getIname() {
		return Iname;
	}
	public void setIname(String iname) {
		Iname = iname;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public List<Industry> getChilds() {
		return childs;
	}
	public void setChilds(List<Industry> childs) {
		this.childs = childs;
	}
	
	
	
}

class  Node{
	String name;
	public Node(String name, String parent, List<Node> child) {
		super();
		this.name = name;
		this.parent = parent;
		this.child = child;
	}

	@Override
	public String toString() {
		return "Node [name=" + name + ", parent=" + parent + ", child=" + child + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String parent;
	List<Node> child;
	
	Node(String parent){
		this.parent = parent;
		this.child = new LinkedList<Node>();
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public List<Node> getChild() {
		return child;
	}

	public void setChild(List<Node> child) {
		this.child = child;
	}
	
	
	
}
