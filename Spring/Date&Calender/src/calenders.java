import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calenders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Date d=new Date();
	Calendar cal=Calendar.getInstance();
SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
System.out.println(sdf.format(cal.getTime()));
System.out.println(cal.get(Calendar.DAY_OF_MONTH));
System.out.println(cal.get(Calendar.WEEK_OF_MONTH));


	}

}
