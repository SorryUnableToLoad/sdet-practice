package bp.genericLibarary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class provides generic methods to read data from property file
 * 
 * @author Suraj
 *
 */
public class FileUtilities {

	Properties p;
	/**
	 * This method will read data from property file and it will return the value
	 * 
	 * @return
	 * @throws Throwable
	 * @throws IOException
	 */
	public String dataProperty(String key) {
		File f = new File(IPathcontants.FilePath);
		try {
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			String data = p.getProperty(key);
			return data;
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
		return key;
	}
}
