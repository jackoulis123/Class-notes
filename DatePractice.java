import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {

        	Date today = new Date();
        	Date afterToday = new Date();
        	afterToday.setHours(11);
        	Date nextYear = new Date();
        	nextYear.setYear(121);
        	
        	System.out.println("\nTODAY " + today);
        	System.out.println("AFTER_TODAY " + afterToday);
        	System.out.println("NEXT_YEAR " + nextYear);
        	
        	System.out.println("Today is after afterToday? " + today.after(afterToday));
        	System.out.println("Today is before afterToday? " + today.before(afterToday));
        	System.out.println("Today is before nextYear? " + today.before(nextYear));
        	System.out.println("Today after nextYear " + today.after(nextYear));

        	System.out.println("\nToday's day of the week is " + today.getDay());
        	System.out.println("\nToday's month is " + today.getMonth());
        	System.out.println("\nToday's time since 1970's is" + today.getTime());

        	Date copyToday = today;
        	System.out.println("\nCOPY_TODAY " + copyToday);
        	today.setHours(11);
        	System.out.println("\nCOPY_TODAY " + copyToday);

        	Date cloneToday = (Date) today.clone();
        	System.out.println("\nCOPY_TODAY " + cloneToday);
        	today.setHours(12);
        	System.out.println("\nCOPY_TODAY " + cloneToday);
        	
    }
}