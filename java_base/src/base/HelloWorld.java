package base;
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int[] b = Arrays.copyOfRange(a, 0, 3);
        String bb = Arrays.toString(b);
        System.out.println(bb);
	}
}