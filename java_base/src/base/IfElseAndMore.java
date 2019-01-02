package base;

public class IfElseAndMore {
	// 练习-黄金分割点  寻找某两个数相除，其结果 离黄金分割点 0.618最近

//分母和分子不能同时为偶数
//分母和分子 取值范围在[1-20]
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
	
	//水仙花数  水仙花数定义：
//	1. 一定是3位数
//	2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
//	寻找所有的水仙花数
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