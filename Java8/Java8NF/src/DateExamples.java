import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

public class DateExamples {
	public static void main(String args[]) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata);

		//Try creating date by providing invalid inputs
		//LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
		//System.out.println(feb29_2014);
		//Exception in thread "main" java.time.DateTimeException: 
		//Invalid date 'February 29' as '2014' is not a leap year

		//java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
		//LocalDate todayIST = LocalDate.now(ZoneId.of("USA"));

		System.out.println(ZoneId.getAvailableZoneIds());

		//Getting date from the base date i.e 01/01/1970
		LocalDate dateFromBase = LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date= "+dateFromBase);

		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
		System.out.println("100th day of 2014="+hundredDay2014);
		
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
LocalDate today = LocalDate.now();
		
		//Get the Year, check if it's leap year
		System.out.println("Year "+today.getYear()+" is Leap Year? "+today.isLeapYear());
		
		//Compare two LocalDate for before and after
		System.out.println("Today is before 01/01/2015? "+today.isBefore(LocalDate.of(2015,1,1)));
		
		//Create LocalDateTime from LocalDate
		System.out.println("Current Time="+today.atTime(LocalTime.now()));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);				
		
		//plus and minus operations
		System.out.println("10 days after today will be "+today.plusDays(10));
		System.out.println("3 weeks after today will be "+today.plusWeeks(3));
		System.out.println("20 months after today will be "+today.plusMonths(20));

		System.out.println("10 days before today will be "+today.minusDays(10));
		System.out.println("3 weeks before today will be "+today.minusWeeks(3));
		System.out.println("20 months before today will be "+today.minusMonths(20));
		
		//Temporal adjusters for adjusting the dates
		System.out.println("First date of this month= "+today.with(TemporalAdjusters.firstDayOfMonth()));
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year= "+lastDayOfYear);
		
		Period period = today.until(lastDayOfYear);
		System.out.println("Period Format= "+period); 
		System.out.println("Months remaining in the year= "+period.getMonths()); 
	}
}
