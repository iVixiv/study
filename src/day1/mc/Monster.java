package day1.mc;

public class Monster {

	public int hp = 5;

	public void live() {
		if (hp > 0) {
			System.out.println("���ﻹ���ţ�HP���У�" + hp);
		} else {
			System.out.println("AWSL");
		}
	}

}
