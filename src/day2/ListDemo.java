package day2;

import java.util.ArrayList;
import java.util.Collection;

// ¼¯ºÏ
public class ListDemo {

	public static void main(String... args) {
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < 100; i++) {
			list.add(i + "");
		}

		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println(list.get(20));

		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("A");
		list2.add("B");
		list2.add("B");
		list2.add("C");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}

}
