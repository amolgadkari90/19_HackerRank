package com.lumen;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class AFindDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day -> ");
		int day = scan.nextInt();
		System.out.println("Enter month -> ");
		int month = scan.nextInt();
		System.out.println("Enter year -> ");
		int year = scan.nextInt();
		LocalDate ld =  LocalDate.of(year, month, day);
		String str = ld.getDayOfWeek().toString();
		System.out.println("Day ->"+str);	
		System.out.println("***********************************************");
		//Calendar cal = null;
		//cal.set(year, month, day);
		//java.text.SimpleDateFormat("EEEE", Locale.ENGLISH).format(cal.getTime()).toUpperCase();
		
	}
}
