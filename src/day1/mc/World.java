package day1.mc;

public class World {

	// 数值 为什么超过最大值会变成负数
	// char的具体含义
	// 基础数据类型不是对象
	// 什么是面向对象
	// 基础数据初始化前存在默认值
	// 局部变量属于函数，类变量属于对象，静态变量属于class
	// 对象可以调用类变量和类函数
	// new关键字是生成一个 ‘新’的对象
	// 没有初始化的对象变量都是null
	// 不能访问一个为null的东西
	// private私有的，public公开的
	public static void main(String... arg) {
		Person R = new Person();

		Monster JJBoom = new Monster();

		Sword _钻石剑 = Sword.create();

		R.send(_钻石剑);

		
		R.getSword().attack(JJBoom);
		R.getSword().attack(JJBoom);
		R.getSword().attack(JJBoom);
		R.getSword().attack(JJBoom);
		R.getSword().attack(JJBoom);
	}
}
