package day1.mc;

public class Sword {
	public int atk = 1;

	public static Sword create() {
		Sword sword = new Sword();
		return sword;
	}

	public void attack(Monster monster) {
		monster.setHp(monster.hp() - atk);
		monster.live();
	}

}
