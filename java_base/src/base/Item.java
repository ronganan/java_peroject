package base;


// �������
public class Item {
	// �������
	String name;
	int price;

	// ��ķ���
	void getPrice() {
		System.out.println("�۸�:" + this.price);
	}
	int addPrice(int price) {
		return this.price += price;
	}
	public static void main(String[] args) {
		Item shose = new Item();
		shose.name = "Ѫƿ";
		shose.price = 100;
		shose.getPrice();
		shose.addPrice(11);
		shose.getPrice();

		Item sword = new Item();
		sword.name = "100��";
		sword.price = 12;

	}

}