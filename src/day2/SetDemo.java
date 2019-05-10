package day2;

import java.util.HashSet;

public class SetDemo {

	public static void main(String... strings) {

		HashSet<String> argSet = new HashSet<String>();
		//如果value的hash相同 后一个覆盖前一个
		argSet.add("a");
		argSet.add("b");
		argSet.add("b");
		argSet.add("c");

		for (String arg : argSet) {
			System.out.println(arg);
		}

	}

}
