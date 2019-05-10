package day1.mc;

//public class Monster {
//
//	public int hp = 5;
//
//	public void live() {
//		if (hp > 0) {
//			System.out.println("怪物还活着，HP还有：" + hp);
//		} else {
//			System.out.println("AWSL");
//		}
//	}
//
//}
public interface Monster extends Enemy, Bird {

	void live();

	void attack();

	String name();

	int hp();

	void setHp(int hp);
}