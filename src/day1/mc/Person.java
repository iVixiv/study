package day1.mc;

public class Person {

	// ����һ�ѽ�������
	private Sword sword = null;

	int hp = 20;

	// װ��һ�ѽ�
	public void send(Sword mSword) {
		sword = mSword;
	}

	
	//��װ
	public Sword getSword() {
		return sword;
	}
}
