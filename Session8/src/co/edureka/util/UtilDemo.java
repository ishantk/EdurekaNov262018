package co.edureka.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilDemo {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int mm = calendar.get(Calendar.MONTH); // 0 to 11
		int yy = calendar.get(Calendar.YEAR);
		
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);
		
		System.out.println(dd+" / "+(mm+1)+" / "+yy);
		System.out.println(hh+" : "+mi+" : "+ss);

		Date date = new Date();
		System.out.println("Today is: "+date); //System.out.println("Today is: "+date.toString());
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh|mm|ss");
		String today = sdf.format(date);
		System.out.println(today);
		
	}

}
