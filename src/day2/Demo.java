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
		// 整数和整数运算 结果只能为整数
		// 整数和小数运算 结果只能为小数
		// 数字只能和数字运算

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		// 以上6种运算 结果是boolean类型

		// 位运算
		System.out.println(2 << 2);
		System.out.println(8 >> 2);

		if (a < b) {
			System.out.println("a小于b");
		} else {
			System.out.println("a不小于b");
		}

		int c = 5;

		// 分支
		if (c == 0) {
			System.out.println("C是0");
		} else if (c == 5) {
			System.out.println("C是5");
		} else if (c == 10) {
			System.out.println("C是10");
		} else {
			System.out.println("C是其他");
		}

		System.out.println("--------------------------------");
		switch (c) {
		case 0:
			System.out.println("C是0");
			break;
		case 5:
			System.out.println("C是5");
			break;
		case 10:
			System.out.println("C是10");
			break;
		default:
			System.out.println("C是其他");
			break;
		}
		System.out.println("--------------------------------");

		String flag = "A";
		switch (flag) {
		case "A":
		case "B":
		case "C":
			System.out.println("爱丽结局");
			break;
		case "D":
			System.out.println("侄女路线");
			break;
		default:
			System.out.println("nice boat");
			break;
		}

		System.out.println("--------------------------------");
		// 循环

		// 起始值 中止值 趋近条件
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println(i);
		}
		// *******程序必须终止条件

		int d = 0;
		// 当满足条件时 循环
		while (d < 100) {
			d = d + 1;
			System.out.println(d);
		}
		System.out.println("ABCD-------------------------------");
		int e = 0;
		do {
			e = e + 1;
			System.out.println(e);
			// 不满足条件不再循环
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
