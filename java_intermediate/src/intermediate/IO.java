package intermediate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
	// 读文件
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
	
	// 写文件
	public static void main(String[] args) {
        try {
            // 准备文件lol2.txt其中的内容是空的
            File f = new File("D:/workspace/java_demo/java_peroject/files/demo.txt");
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };
 
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();
             
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}