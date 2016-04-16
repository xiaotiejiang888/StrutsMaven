package cn.sxt.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2016/3/22.
 */
public class DynamicReadPropertiesFileTest {
//    private static Logger logger = Logger.getLogger(DynamicReadPropertiesFileTest.class);
//    private static final Logger logger = LogManager.getLogger("HelloWorld");
    private static final Logger logger = LogManager.getLogger(DynamicReadPropertiesFileTest.class);

    public static void main(String[] args) throws IOException, InterruptedException {

        while (Boolean.TRUE){
            Thread.sleep(2000);
            Properties prop = new Properties();

//            InputStream is = DynamicReadPropertiesFileTest.class.getClassLoader().getResourceAsStream("/config.properties");       //动态读取  config.properties配置文件   配置文件需要在根目录下

            String path = DynamicReadPropertiesFileTest.class.getClassLoader().getResource("config.properties").getPath();
            System.out.println(path);
            InputStream is = new FileInputStream(path);

            prop.load(is);
            System.out.println(prop.get("userName"));
        }

    }
}
