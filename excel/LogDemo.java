package excel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemo {
    private static Logger log = LogManager.getLogger(LogDemo.class);

    public static void main(String[] args) {
        log.info("This is an info log");
        log.error("This is an error log");
    }
}

