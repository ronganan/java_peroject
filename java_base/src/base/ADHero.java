package base;

public class ADHero extends Hero {
 // ����       �ɱ����
    public void attack() {
        System.out.println(name + " ������һ�ι��� �����ǲ�ȷ������˭��");
    }
 
    // �ɱ������Ĳ���
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " ������ " + heros[i].name);
 
        }
    }
 
    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "�ͽ�����";
 
        Hero h1 = new Hero();
        h1.name = "����";
        Hero h2 = new Hero();
        h2.name = "��Ī";
 
        bh.attack(h1);
        bh.attack(h1, h2);
 
    }
 
}