package day4;

public class Test {
	public static void main(String[] args) {

		// ��̬�๲����Դ ����static�ı����������
		User user = new User();
		user.eat();
		user.eat();

		User2.eat();
		User2.eat();

		User user3 = new User();
		user3.eat();

		System.out.println(user.hp);
		System.out.println(User2.hp);
		System.out.println(user3.hp);

		// ����д�õĺ��� һ���Ϊ���������ļ���lib��
		System.out.println("1+2=" + MathUtil.add(1, 2));

		System.out.println("----------");

		// ������
		Item<String> item = new Item<String>();
		item.t = "t���ַ���";
		Item<User> item2 = new Item<User>();
		item2.t = user;
		System.out.println(item.t);
		System.out.println(item2.t.hp);

		Bao<String> bao1 = new Bao<String>();
		Bao<Bao<String>> bao2 = new Bao<Bao<String>>();
	}

	//���ͷ���
	public <T> void func(T a, T b) {

	}
}
