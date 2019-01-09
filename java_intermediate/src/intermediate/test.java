package intermediate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

//作业   如果是写入数据到d:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
public class test {
	//
	public static void main(String[] args) {
		
//		try {
//			File f = new File("D:/workspace/java_demo/java_peroject/files/test/aa/demo.txt");
//			
//			if (!f.getParentFile().exists()) {
//				f.getParentFile().mkdirs();
//			}
//			FileOutputStream fos = new FileOutputStream(f);
//			byte[] bt = {55, 66};
//			fos.write(bt);
//			fos.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		int[] a = {1,2,44,22,3,4};
//		String b = Arrays.toString(a);
//		Arrays.sort(a);
//		Arrays.binarySearch(a, 22);
		StringBuffer a = new StringBuffer("45dfdf");
//		char[] b = a.toCharArray();
		a.append("11");
		a.delete(0, 2);
		a.insert(2, "mm");
		a.reverse();
		a.length();
		System.out.println(a.capacity());		
	}
}