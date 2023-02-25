package bp.genericLibarary;

import java.util.Date;
import java.util.Random;

/**
 * This class contains generic method with respect to java
 * 
 * @author Suraj
 *
 */
public class JavaUtilities {
	/**
	 * This methods will generates a random number and returns it to the caller
	 * 
	 * @return
	 */
	public int getRandomNumber() {
		Random ran = new Random();
		int random = ran.nextInt(100);
		return random;
	}

	/**
	 * This method will return the current date to the caller
	 * 
	 * @return
	 */
	public String getCurrentDate() {
		Date date = new Date();
		String currentdate = date.toString();
		return currentdate;
	}

	/**
	 * This method will return date in specified format
	 * 
	 * @return
	 */
	public String getCurrentData() {
		Date date = new Date();
		String d = date.toString();
		String[] dte = d.split(" ");
		String YYYY = dte[5];
		String DD = dte[2];
		String MM = dte[1];
		String today = YYYY + "-" + MM + "-" + DD;
		return today;
	}
}
