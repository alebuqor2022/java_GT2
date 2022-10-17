package clase4_Fechas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;


public class Fecha {

	public static void main(String[] args) { 
		ejemplo0();
		ejemplo1();
		ejemplo2();
		ejemplo3(); 
		
	}
	
	public static void ejemplo0() {
		LocalDate givenDate1 = LocalDate.of(2017, 6, 23); 
		System.out.println(givenDate1.isLeapYear()); 
		LocalDate givenDate2 = LocalDate.of(2012, 10, 20); 
		System.out.println(givenDate2.isLeapYear()); 
		LocalDate givenDate3 = LocalDate.of(2000, 11, 14); 
	System.out.println(givenDate3.isLeapYear()); 
	
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
	//String that contains date as a String 
	String stringDate = "2017/10/23"; 
	//Converting String to LocalDate 
	LocalDate date = LocalDate.parse(stringDate, formatter); 
	//Displaying LocalDate, this will print the date in default format 
	System.out.println("Local Date: "+date); 
	//This will print the date in the format specified in DateTimeFormatter 
	System.out.println("Local Date in the given format: "+formatter.format(date));
	
	} 
	
	public static void ejemplo1() {
		Date miFecha = new Date();
		System.out.println(miFecha);
		Date miFecha2 = new Date(22,6,2022);
		boolean rpta=miFecha.after(miFecha2);
		System.out.println(rpta);
	}
	public static void ejemplo2() {
		Date miFecha = new Date();
		Calendar cal= Calendar.getInstance();
		System.out.println(cal.getTime().getHours());
		
		GregorianCalendar ahora=new GregorianCalendar();
		System.out.println(ahora.getTime().getHours());
		
		int mes= ahora.get(Calendar.MONTH);
		int diaSem= ahora.get(Calendar.DAY_OF_WEEK);
		System.out.println("mes: " + mes + " dia: " + diaSem);//mes: 5 dia: 4
		
	}
	public static void ejemplo3() {
		Date miFecha = new Date();
		DateFormat formato1=new SimpleDateFormat("dd/MM/yyyy");
		String fecha2=formato1.format(miFecha);
		System.out.println(fecha2);
	}
}

	


 
