package day1.mc;

public class Zombie implements Monster, Bird {

	public int HP = 10;

	@Override
	public void live() {
		if (HP > 0) {
			System.out.println(name() + "还活着，HP还有：" + HP);
		} else {
			System.out.println("AWSL");
		}
	}

	@Override
	public void attack() {
		System.out.println(name() + "咬人辣");
	}

	@Override
	public String name() {
		return "僵尸";
	}

	@Override
	public int hp() {
		return HP;
	}

	@Override
	public void setHp(int hp) {
		this.HP = hp;
	}

	@Override
	public void Boom() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void fly() {
	System.out.println("僵尸鸟会飞");
	}
}
