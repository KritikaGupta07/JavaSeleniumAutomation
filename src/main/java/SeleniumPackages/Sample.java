package SeleniumPackages;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Sample {

	public static void main(String[] args) {
	
		Date currentDate = new Date();
		
		SimpleDateFormat myDateFormat = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
		
		String date = myDateFormat.format(currentDate);
		
		System.out.println(date);

	}

}
