package day1.mc;

public class JJBoom implements Monster {

	public int HP = 10;

	@Override
	public void live() {
		if (HP > 0) {
			System.out.println(name()+"�����ţ�HP���У�" + HP);
		} else {
			System.out.println("AWSL");
		}
	}

	@Override
	public void attack() {
		System.out.println(name()+" ��ը��");
	}

	@Override
	public String name() {
		return "JJ��";
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
		
	}

	@Override
	public void fly() {
	
	}
}
