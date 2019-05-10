package day2;

import java.util.HashMap;

public class MapDemo {

	public static void main(String... strings) {

		// 键 值 （对）
		HashMap<String, String> persion = new HashMap<String, String>();
		persion.put("HP", "100");
		persion.put("MP", "80");
		persion.put("ITEM", "sword");

		System.out.println("HP是" + persion.get("HP"));

		int[] args = new int[10];
		args[1] = 100;
		HashMap<String, int[]> map2 = new HashMap<String, int[]>();
		map2.put("args", args);

		System.out.println("args是" + map2.get("args"));

//		persion.put(null, "abc");
//
//		System.out.println(persion.get(null));
//
//		persion.put("abc", null);
//		
//		System.out.println(persion.get("abc"));
//		
//		persion.put(null, null);
//		
//		System.out.println(persion.get(null));

		// 同Hash的key 后一个value 覆盖前一个
		persion.put("abc", "456");
		persion.put("abc", "567");

		System.out.println(persion.get("abc"));

		HashMap<String, HashMap> test = new HashMap<String, HashMap>();
		test.put("map", test);
		System.out.println(test.get("map"));
		
		

	}
}
