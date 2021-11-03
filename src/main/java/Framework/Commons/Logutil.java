package Framework.Commons;

import org.apache.log4j.Logger;

public class Logutil {

    private static Logger log = Logger.getLogger("Rediff Books");

    public static void info(String logInfo){
           log.info(logInfo);
    }

    public static void error(String logError){
        log.error(logError);
    }

    public static void warn(String logWarn){
        log.warn(logWarn);
    }

}
