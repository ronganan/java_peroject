package intermediate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
	// ���ļ�
//	public static void main(String[] args) {
//		try {
//			File f1 = new File("D:/workspace/java_demo/java_peroject/files/demo.txt");
//			FileInputStream fis = new FileInputStream(f1);
//			byte[] all = new byte[(int) f1.length()];
//			fis.read(all);
//			for (byte b : all) {
//                System.out.println(b);
//            };
//            fis.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	// д�ļ�
	public static void main(String[] args) {
        try {
            // ׼���ļ�lol2.txt���е������ǿյ�
            File f = new File("D:/workspace/java_demo/java_peroject/files/demo.txt");
            // ׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X,Y
            byte data[] = { 88, 89 };
 
            // ���������ļ��������
            FileOutputStream fos = new FileOutputStream(f);
            // ������д�뵽�����
            fos.write(data);
            // �ر������
            fos.close();
             
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}