import java.util.Calendar;

public class PromotionPublic {
	Calendar cal = Calendar.getInstance();
	public int month = cal.get(Calendar.MONTH) + 1;
	public String promotion = "Buy 1 Scoop, Free 1 Scoop";
	
	public String monthString(int monthNumber){
		switch(monthNumber){
			case 1 : return "January";
			case 2 : return "February";
			case 3 : return "March";
			case 4 : return "April";
			case 5 : return "May";
			case 6 : return "June";
			case 7 : return "July";
			case 8 : return "August";
			case 9 : return "September";
			case 10 : return "October";
			case 11 : return "November";
			case 12 : return "December";
			default : return "Error";
		}
	}
}
