package Log4j2.tyz.use;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J2TestClass{
    //配置文件中logger的名字
    static Logger logger = LogManager.getLogger("test1Logger");
    
    public static void log(){
    	logger.info("log---------");
    	   logger.fatal("log++++++++++");
           logger.debug("log++++++++++");
           logger.error("log++++++++++");
    }
    
}


class Log4jTestclass2{
    static Logger logger = LogManager.getLogger("test2Logger");
    public static void log(){
        logger.info("log++++++++++");

            logger.fatal("log++++++++++");
            logger.debug("log++++++++++");
            logger.error("log++++++++++");
    }
}


class TestMain{
    public static void main(String[] args) {
    	 Log4J2TestClass.log();
    	 Log4jTestclass2.log();
    }
}
