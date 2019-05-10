package day1.mc;

public class Person {

	// 人有一把剑（对象）
	private Sword sword = null;

	int hp = 20;

	// 装配一把剑
	public void send(Sword mSword) {
		sword = mSword;
	}

	
	//封装
	public Sword getSword() {
		return sword;
	}
}
