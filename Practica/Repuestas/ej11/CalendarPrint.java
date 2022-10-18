package ejerciciosTP1.ej11;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class CalendarPrint {
	   public static void main(String[] args) {
	        // Test harness
	        Scanner input = new Scanner(System.in);
	        System.out.print("Ingrese un mes del 1 al 12: ");
	        int m = input.nextInt();

	        System.out.print("Ingrese un año, ej: 2018: ");
	        int y = input.nextInt();
	        printMonth(y, m);
	    }

	    static void printMonth(int year, int month) {
	        YearMonth ym = YearMonth.of(year, month);
	        LocalDate today = LocalDate.now();
	        
	        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	        int counter = 1;

	        // Get day of week of 1st date of the month and print space for as many days as
	        // distant from SUN
	        int dayValue = LocalDate.of(year, month, 1).getDayOfWeek().getValue();
	        
	        if (dayValue != 7) {
	            for (int i = 0; i < dayValue; i++, counter++) {
	                System.out.printf("%-4s", "");
	            }
	        }
	        
	        for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, counter++) {	            
	            if (i == today.getDayOfMonth()) {
		            System.out.printf(i + "*" + " ");
				} else {
		            System.out.printf("%-4d", i);
				}
	            
	            // Break the line if the value of the counter is multiple of 7
	            if (counter % 7 == 0) {
	                System.out.println();
	            }
	        }
	    }
}
