package day1.mc;

public class World {

	// ��ֵ Ϊʲô�������ֵ���ɸ���
	// char�ľ��庬��
	// �����������Ͳ��Ƕ���
	// ʲô���������
	// �������ݳ�ʼ��ǰ����Ĭ��ֵ
	// �ֲ��������ں�������������ڶ��󣬾�̬��������class
	// ������Ե�����������ຯ��
	// new�ؼ���������һ�� ���¡��Ķ���
	// û�г�ʼ���Ķ����������null
	// ���ܷ���һ��Ϊnull�Ķ���
	// private˽�еģ�public������
	public static void main(String... arg) {
		Person R = new Person();

		Monster JJBoom = new JJBoom();

		Sword _��ʯ�� = Sword.create();

		R.send(_��ʯ��);

		
		R.getSword().attack(JJBoom);
		R.getSword().attack(JJBoom);
		R.getSword().attack(JJBoom);
		R.getSword().attack(JJBoom);
		R.getSword().attack(JJBoom);
		
		R r2=new R();
		r2.getSword();
		r2.attack();
		r2.Boom();
		r2.fly();
		r2.eat();
		r2.eat("��l");
	}
}
