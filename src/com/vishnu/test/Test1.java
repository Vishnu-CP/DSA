package com.vishnu.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import oal.crm.apps.tcr.services.TcrTeamMemberService;

public class Test1 {
	
	static void date() {
		String strReqDelTime = "21/10/2019";
		 Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(strReqDelTime);
			System.out.println(date);
			Instant reqInstant = date.toInstant();
			System.out.println(reqInstant);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	static void date1() {
		String strReqDelTime = "5/12/2018";
		 Date date;
		LocalDateTime.parse(                   // Parse as an indeterminate `LocalDate`, devoid of time zone or offset-from-UTC. NOT a moment, NOT a point on the timeline.
			    "04:30 PM, Sat 5/12/2018" ,        // This input uses a poor choice of format. Whenever possible, use standard ISO 8601 formats when exchanging date-time values as text. Conveniently, the java.time classes use the standard formats by default when parsing/generating strings.
			    DateTimeFormatter.ofPattern( "hh:mm a, EEE M/d/uuuu" , Locale.US )  // Use single-character `M` & `d` when the number lacks a leading padded zero for single-digit values.
			)                                      // Returns a `LocalDateTime` object.
			.atZone(                               // Apply a zone to that unzoned `LocalDateTime`, giving it meaning, determining a point on the timeline.
			    ZoneId.of( "America/Toronto" )     // Always specify a proper time zone with `Contintent/Region` format, never a 3-4 letter pseudo-zone such as `PST`, `CST`, or `IST`. 
			)                                      // Returns a `ZonedDateTime`. `toString` → 2018-05-12T16:30-04:00[America/Toronto].
			.toInstant()                           // Extract a `Instant` object, always in UTC by definition.
			.toString()    ;                        // Generate a String in standard ISO 8601 format representing the value within this `Instant` object. Note that this string is *generated*, not *contained*.
		 
	}
	public static void main(String[] args) {
//		date();
//		double val1 = 10.09909;
//		BigDecimal b1= new BigDecimal(val1).setScale(2, RoundingMode.HALF_UP);
//		System.out.println(b1);
//		testStreams();
//		instantToDateStr();
//		System.out.println(instantToDateStr(Instant.parse( "2019-02-22T13:43:00Z" ) ));
		
//		Long a = 0L;
//		
//		Long b = 1L;
//		
//		if(a<b)
//			System.out.println("pass");
		
		//date3("12/01/2023");
		
		date4("12/01/2023" , "13/01/2023");
		
				
	}
	
	public static void testStreams() {
		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> odd = ints.stream().filter(i-> i.intValue() % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(odd);
		
		List<Integer> even = ints.stream().filter(i-> i.intValue() %2 != 0)
				.collect(Collectors.toList());
		System.out.println(even);
	}
	
	static void instantToDateStr() {
		Instant instant = Instant.parse( "2019-02-22T13:43:00Z" ) ;
		OffsetDateTime odt = instant.atOffset( ZoneOffset.UTC ) ;

		DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd-MMM-uuuu HH:mm" ) ;
		String output = odt.format( f ) ;
		System.out.println(output);
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern( "dd-MMM-uuuu E" ) ;
		String output1 = odt.format( f1 ) ;
		System.out.println(output1);
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
	
	static void date3(String dateStr) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(dateStr, formatter).plusDays(1);
		
       // localDate.plusDays(2);

		Instant instant = localDate.atStartOfDay(ZoneId.of("UTC")).toInstant();
		System.out.println(instant);
		
		Instant startDate  = YearMonth.of(localDate.getYear(), localDate.getMonthValue()).atDay(1)
				.atStartOfDay(ZoneId.of("UTC")).toInstant();
		System.out.println(startDate);
		
		//Instant endDate=	YearMonth.from(startDate.atZone(ZoneId.of("UTC"))).atEndOfMonth().atTime(LocalTime.MAX).atZone(ZoneId.of("UTC")).toInstant();
		Instant endDate=	YearMonth.from(startDate.atZone(ZoneId.of("UTC"))).plusMonths(1).atDay(1)
				    				.atStartOfDay(ZoneId.of("UTC")).toInstant();
		System.out.println(endDate);
		
		
//		if(StringUtils.equalsIgnoreCase(filterCriteria, TcrTeamMemberService.PREV_MONTH))
//			 endDate=	YearMonth.from(startDate.atZone(ZoneId.of("UTC"))).atEndOfMonth().atTime(LocalTime.MAX).atZone(ZoneId.of("UTC")).toInstant();
//		 else
//			 endDate = YearMonth.from(Instant.now().atZone(ZoneId.of("UTC"))).atEndOfMonth().atTime(LocalTime.MAX).atZone(ZoneId.of("UTC")).toInstant();
//		 
//		
		endDate = YearMonth.from(Instant.now().atZone(ZoneId.of("UTC"))).plusMonths(1).atDay(1)
				.atStartOfDay(ZoneId.of("UTC")).toInstant();
		System.out.println(endDate);
		
		
	}
	
	
	public static void date4(String from, String to) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 LocalDate localDateFrom = LocalDate.parse(from, formatter);
		 Instant instantFrom = localDateFrom.atStartOfDay(ZoneId.of("UTC")).toInstant();
		 System.out.println(instantFrom);
		 
		 LocalDate localDateTo = LocalDate.parse(to, formatter).plusDays(1);
		 Instant instantTo = localDateTo.atStartOfDay(ZoneId.of("UTC")).toInstant();
		 System.out.println(instantTo);
		 
		 
		 int monthDiff= 5;
		 Instant startDate= null;
			Instant endDate = null;
			Map<String , Instant> dateMap = new HashMap<> ();
		 LocalDate startLD = LocalDate.now(ZoneId.of("UTC")).minusMonths(monthDiff);
			
		 startDate  = YearMonth.of(startLD.getYear(), startLD.getMonthValue()).atDay(1)
				.atStartOfDay(ZoneId.of("UTC")).toInstant();
		 
		 System.out.println("startDate1 :: "+startDate);
		
		
			// endDate=	YearMonth.from(startDate.atZone(ZoneId.of("UTC"))).atEndOfMonth().atTime(LocalTime.MAX).atZone(ZoneId.of("UTC")).toInstant();
			 endDate=	 YearMonth.from(startDate.atZone(ZoneId.of("UTC"))).plusMonths(1).atDay(1)
				.atStartOfDay(ZoneId.of("UTC")).toInstant();
			 
			 System.out.println("prev end date :"+endDate);
		 
			 endDate = YearMonth.from(Instant.now().atZone(ZoneId.of("UTC"))).atEndOfMonth().atTime(LocalTime.MAX).atZone(ZoneId.of("UTC")).toInstant();
			 System.out.println("cur end date :"+endDate);
			 
			 System.out.println("=====================");
			
			 
			 startDate  = YearMonth.of(startLD.getYear(), startLD.getMonthValue()).atDay(1)
						.atStartOfDay(ZoneId.of("UTC")).toInstant();
			 System.out.println("startDate "+startDate);
			 endDate=	 YearMonth.from(startDate.atZone(ZoneId.of("UTC"))).plusMonths(1).atDay(1)
						.atStartOfDay(ZoneId.of("UTC")).toInstant();
					 
			 System.out.println("prev end date :"+endDate);
			 
			 endDate = YearMonth.from(Instant.now().atZone(ZoneId.of("UTC"))).plusMonths(1).atDay(1)
						.atStartOfDay(ZoneId.of("UTC")).toInstant();
			System.out.println(endDate);
			 
			 
			 
	}

}
