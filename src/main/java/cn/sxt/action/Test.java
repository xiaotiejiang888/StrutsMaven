package cn.sxt.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2016/3/22.
 */
public class Test {
//    private static Logger logger = Logger.getLogger(Test.class);
//    private static final Logger logger = LogManager.getLogger("HelloWorld");
    private static final Logger logger = LogManager.getLogger(Test.class);

    public static void main(String[] args) {
        System.out.println("This is a println message");
        logger.debug("this is a debug message");
        logger.info("this is a info message");
        logger.error("this is a error message");
    }
}
