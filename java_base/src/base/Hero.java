package base;

public class Hero {
	
	String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
     
    public Hero(){
         
    }
     
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
 
    //����
    public void revive(Hero h){
        h = new Hero("��Ī",383);
        System.out.println(h.hp);
    }
 
    public static void main(String[] args) {
        Hero teemo =  new Hero("��Ī",383);
         
        //�ܵ�400�˺�������
        teemo.hp = teemo.hp - 400;
         
        teemo.revive(teemo);
        System.out.println(teemo.hp); 
        //���⣺ System.out.println(teemo.hp); ������٣� ��ô��⣿
         
    }
}