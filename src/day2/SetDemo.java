package day2;

import java.util.HashSet;

public class SetDemo {

	public static void main(String... strings) {

		HashSet<String> argSet = new HashSet<String>();
		//���value��hash��ͬ ��һ������ǰһ��
		argSet.add("a");
		argSet.add("b");
		argSet.add("b");
		argSet.add("c");

		for (String arg : argSet) {
			System.out.println(arg);
		}

	}

}
