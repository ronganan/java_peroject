package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TestLog4j {
	//  基于类的名称获取日志对象
	static Logger lg = Logger.getLogger(TestLog4j.class);	
	public static void main(String[] args) throws InterruptedException {
		// 进行默认配置
		BasicConfigurator.configure();
		// 设置日志输出级别
		lg.setLevel(Level.DEBUG);
		// 进行不同级别的日志输出
		lg.trace("跟踪信息");
		lg.debug("调试信息");
		lg.info("输出信息");
        Thread.sleep(1000);
        lg.warn("警告信息");
        lg.error("错误信息");
        lg.fatal("致命信息");
	}
}