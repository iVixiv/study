package day2;

public class ArrayDemo {

	public static void main(String... strings) {
		// 数组
		int[] args = new int[3];
		args[0] = 10;
		args[1] = 20;
		args[2] = 30;
//		args[3] = 40;

		System.out.println(args[2]);
		// 遍历
		// 数组越界 ArrayIndexOutOfBoundsException
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		//数组可以是基础数据 也可以是对象
		float[] arr2 = new float[3];
		Object[] arr3 = new Object[3];
	}
}
