package day2;

public class Demo {

	public static void main(String... strings) {
		int a = 20;
		int b = 10;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		// �������������� ���ֻ��Ϊ����
		// ������С������ ���ֻ��ΪС��
		// ����ֻ�ܺ���������

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		// ����6������ �����boolean����

		// λ����
		System.out.println(2 << 2);
		System.out.println(8 >> 2);

		if (a < b) {
			System.out.println("aС��b");
		} else {
			System.out.println("a��С��b");
		}

		int c = 5;

		// ��֧
		if (c == 0) {
			System.out.println("C��0");
		} else if (c == 5) {
			System.out.println("C��5");
		} else if (c == 10) {
			System.out.println("C��10");
		} else {
			System.out.println("C������");
		}

		System.out.println("--------------------------------");
		switch (c) {
		case 0:
			System.out.println("C��0");
			break;
		case 5:
			System.out.println("C��5");
			break;
		case 10:
			System.out.println("C��10");
			break;
		default:
			System.out.println("C������");
			break;
		}
		System.out.println("--------------------------------");

		String flag = "A";
		switch (flag) {
		case "A":
		case "B":
		case "C":
			System.out.println("�������");
			break;
		case "D":
			System.out.println("ֶŮ·��");
			break;
		default:
			System.out.println("nice boat");
			break;
		}

		System.out.println("--------------------------------");
		// ѭ��

		// ��ʼֵ ��ֵֹ ��������
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println(i);
		}
		// *******���������ֹ����

		int d = 0;
		// ����������ʱ ѭ��
		while (d < 100) {
			d = d + 1;
			System.out.println(d);
		}
		System.out.println("ABCD-------------------------------");
		int e = 0;
		do {
			e = e + 1;
			System.out.println(e);
			// ��������������ѭ��
		} while (e < 100);

		int f = 0;
//		System.out.println(f++);
//		System.out.println(++f);
		System.out.println(f += 1);
		f += 1;
		f = f + 1;
		f -= 1;
		f = f - 1;
		
		
		
		
	}

}
