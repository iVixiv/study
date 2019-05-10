package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortDemo {

	//sort可以自定义顺序
	static int[] args1 = new int[5];

	static ArrayList<String> args2 = new ArrayList<String>();

	public static void main(String[] args) {

		args1[0] = 1;
		args1[1] = 5;
		args1[2] = 3;
		args1[3] = 2;
		args1[4] = 5;

		for (int i = 0; i < args1.length; i++) {
			System.out.println(args1[i]);
		}
		System.out.println("-------");
		//
		Arrays.sort(args1);

		for (int i = args1.length - 1; i >= 0; i--) {
			System.out.println(args1[i]);
		}
		System.out.println("-------");

		args2.add("A");
		args2.add("D");
		args2.add("a");
		args2.add("d");
		args2.add("b");
		args2.add("B");
		args2.add("C");
		args2.add("c");

		for (int i = 0; i < args2.size(); i++) {
			System.out.println(args2.get(i));
		}
		System.out.println("-------");
		//
		Collections.sort(args2);
		for (int i = 0; i < args2.size(); i++) {
			System.out.println(args2.get(i));
		}
		System.out.println("-------");

		for (int i = 0; i < 200; i++) {
			char x = (char) i;
			System.out.println("第"+i+"个是："+x);
			
		}
	}
}
