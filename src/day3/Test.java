package day3;

public class Test {

	//�̳�ֻ�ܼ̳�һ��
	//ʵ�ֽӿڿ���ʵ�ֶ��
	//�������̳ж�ʵ��
	//���b  ���ڲ�ʵ�ֹ���  ֻ�ں��ӿڵĶ���
	//�ӿ�ʵ��
	//�̳�
	//��д������
	// http://www.runoob.com/java/java-polymorphism.html
	public static void main(String[] args) {
		Moblie apple = new Apple();
		Moblie xiaomi = new Xiaomi();
		apple.call();
		xiaomi.play();
	}

}
