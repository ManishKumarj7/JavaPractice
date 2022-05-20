import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d=new Date();
System.out.println(d.toString());
SimpleDateFormat sdf =new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
System.out.println(sdf.format(d));
	}

}
