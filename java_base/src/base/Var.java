package base;

// ���� ���� ת��    ��������һ�����ݵı�ʶ��
public class Var{
	
	public static void main(String[] args) {
		short a = 11;
		char e = 'e';
		a = (short)e;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(e));
	}
}