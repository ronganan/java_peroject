package base;

// 变量 类型 转换    用来命名一个数据的标识符
public class Var{
	
	public static void main(String[] args) {
		short a = 11;
		char e = 'e';
		a = (short)e;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(e));
	}
}