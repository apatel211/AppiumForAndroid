package utils;

import java.util.logging.Logger;

public class logger {

    private static final org.apache.logging.log4j.Logger log =
            org.apache.logging.log4j.LogManager.getLogger(logger.class.getName());

    private static final Logger Log = Logger.getLogger(logger.class.getName());

    public static void startTestCase(String sTestCaseName) {
        Log.info("****************************************************************************************");
        Log.info("****************************************************************************************");
        Log.info("$$$$$$$$$$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");
        Log.info("****************************************************************************************");
        Log.info("****************************************************************************************");

    }

    public static void endTestCase(String sTestCaseName) {
        Log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");
        Log.info("X");
        Log.info("X");
        Log.info("X");
        Log.info("X");
    }

    public static void info(String message) {
        Log.info(message);
    }

    public static void error(String message, Exception e) {
        log.error(message);
    }

    public static void warn(String message) {
        log.warn(message);
    }
    
    public static void fatal(String message) {
        log.fatal(message);
    }

    public static void debug(String message) {
        log.debug(message);
    }

}
