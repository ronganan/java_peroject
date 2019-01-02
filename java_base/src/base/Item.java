package base;


// 面向对象
public class Item {
	// 类的属性
	String name;
	int price;

	// 类的方法
	void getPrice() {
		System.out.println("价格:" + this.price);
	}
	int addPrice(int price) {
		return this.price += price;
	}
	public static void main(String[] args) {
		Item shose = new Item();
		shose.name = "血瓶";
		shose.price = 100;
		shose.getPrice();
		shose.addPrice(11);
		shose.getPrice();

		Item sword = new Item();
		sword.name = "100大刀";
		sword.price = 12;

	}

}