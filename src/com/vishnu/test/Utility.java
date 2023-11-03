package com.vishnu.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Utility {
public static String dateUtil(String date) {
	String strFinalDate=null;
	try {
	String[] str=date.split(" ");
	String[] strDate=str[0].split("-");
	strFinalDate=strDate[2]+"-"+strDate[1]+"-"+strDate[0];
	return strFinalDate;
	}
	catch(Exception ex) {
//	log.error(ex);	
	}
	return strFinalDate;
	
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
public static Instant dateStrToInstant(String dateStr) {
	Date date;
	if (dateStr != null && !dateStr.isEmpty()) {
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
			Instant reqInstant = date.toInstant();
			return reqInstant;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	return null;

}
public static String instantToDateStr(Instant dateTimeIns, String pattern) {

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
    
    public static String formatCurrency(Long currency) {
        
        Locale defaultLocale = new Locale("en", "US", "USD");
        NumberFormat nf = NumberFormat.getCurrencyInstance(defaultLocale);
        
        return (null != currency && currency !=0) ? nf.format(currency) : "$0";
    }
 
}
