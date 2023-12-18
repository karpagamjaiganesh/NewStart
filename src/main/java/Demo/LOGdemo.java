package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LOGdemo {

	static Logger logger = Logger.getLogger(LOGdemo.class);
	
	public static void main(String[] args) throws FileNotFoundException {
          
		//BasicConfigurator.configure();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\jasai\\eclipse-workspace\\NewProject\\src\\main\\java\\Demo\\log.properties");
		PropertyConfigurator.configure(fis);
		logger.info("----------first--------------");
		logger.warn("---------second--------------");
		logger.fatal("-------second--------------");
	}

}
