package base;

public class IfElseAndMore {
	// ��ϰ-�ƽ�ָ��  Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���

//��ĸ�ͷ��Ӳ���ͬʱΪż��
//��ĸ�ͷ��� ȡֵ��Χ��[1-20]
//	public static void main(String[] args) {
//		float v = 0f;
//		int a =0, b=0;
//		for (int i = 1; i<=20; i++) {
//			
//			for (int j=1; j<=20;j++) {
//				
//				if (i%2==0 && j%2==0) continue;				
//				float tt = Math.abs((float)i/j - 0.618f);
//				if (v==0f) v = tt;					
//				if (v > tt) {
//					a = i;
//					b = j;
//					v = tt;
//				}
//			}
//		}
//		System.out.println(a + "," + b + "," + v);
//	}
	
	//ˮ�ɻ���  ˮ�ɻ������壺
//	1. һ����3λ��
//	2. ÿһλ��������������ǡ�����������������153=1*1*1+5*5*5+3*3*3
//	Ѱ�����е�ˮ�ɻ���
	public static void main (String[] args) {
		for (int i=1; i<10; i++) {
			for (int j=0; j<10; j++) {
				for (int t=0; t<10; t++) {
					String ff = i+""+j+""+t;
					int tt = i*i*i + j*j*j + t*t*t;
					if (tt  == Integer.parseInt(ff)) {
						System.out.println(ff);
					}
				}
			}
		}		
	}
}