package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TestLog4j {
	//  ����������ƻ�ȡ��־����
	static Logger lg = Logger.getLogger(TestLog4j.class);	
	public static void main(String[] args) throws InterruptedException {
		// ����Ĭ������
		BasicConfigurator.configure();
		// ������־�������
		lg.setLevel(Level.DEBUG);
		// ���в�ͬ�������־���
		lg.trace("������Ϣ");
		lg.debug("������Ϣ");
		lg.info("�����Ϣ");
        Thread.sleep(1000);
        lg.warn("������Ϣ");
        lg.error("������Ϣ");
        lg.fatal("������Ϣ");
	}
}