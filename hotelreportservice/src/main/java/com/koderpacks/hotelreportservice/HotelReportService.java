package com.koderpacks.hotelreportservice;

public class HotelReportService {

	private static String replaceAll;

	public static void main(String[] args) {
		
		String number="+97997";
replaceAll = number.replaceAll("\\+", "");	
System.out.println(replaceAll);
	}
}
