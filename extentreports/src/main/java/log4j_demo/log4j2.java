package log4j_demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2 {
	
	private static final Logger logger = LogManager.getLogger(log4j2.class);

    public static void main(String[] args) {
    	
    	 //System.out.println("hello venna");
        logger.info("Hello World!");
        logger.info("Hello sai");
        logger.debug("Hello venna");
        logger.debug("debug mode");
    }
}




